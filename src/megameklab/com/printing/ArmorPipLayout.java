/*
 * MegaMekLab - Copyright (C) 2017 - The MegaMek Team
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 */
package megameklab.com.printing;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.svg.SVGRectElement;

import java.awt.geom.Rectangle2D;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static megameklab.com.printing.PrintRecordSheet.DEFAULT_PIP_SIZE;

/**
 * Utility for determining placement of armor and structure pips.
 * Assumes that the group includes a number of {@link SVGRectElement}s defining horizontal rows,
 * that the regions are continguous, and the rows themselves are contiguous.
 */
class ArmorPipLayout {

    private final PrintRecordSheet sheet;
    private final Element group;
    private final int pipCount;
    private final PrintRecordSheet.PipType pipType;
    private final double strokeWidth;
    private final Bounds bounds;
    private final double avgHeight;
    private final double avgWidth;
    private final TreeMap<Double, Rectangle2D> regions = new TreeMap<>();

    /**
     * Processes the <code>rect</code> elements within a group to find the width of the region
     * at each marked point and adds pip elements to the group layed out in a symmetric pattern.
     *
     * @param sheet       The record sheet being printed.
     * @param group       The group element that contains the <code>rect</code> elements that
     *                    mark the dimensions of the area on the armor or structure diagram.
     * @param pipCount    The number of armor or structure pips to add
     * @param pipType     The shape of pip to add
     * @param strokeWidth The width of the pip outline stroke
     */
    static void addPips(PrintRecordSheet sheet, Element group, int pipCount,
                        PrintRecordSheet.PipType pipType, double strokeWidth) {
        if (pipCount > 0) {
            ArmorPipLayout layout = new ArmorPipLayout(sheet, group, pipCount,
                    pipType, strokeWidth);
            layout.process();
        }
    }

    /**
     * Processes the <code>rect</code> elements within a group to find the width of the region
     * at each marked point and adds pip elements to the group layed out in a symmetric pattern.
     *
     * @param sheet       The record sheet being printed.
     * @param group       The group element that contains the <code>rect</code> elements that
     *                    mark the dimensions of the area on the armor or structure diagram.
     * @param pipCount    The number of armor or structure pips to add
     * @param pipType     The shape of pip to add
     */
    static void addPips(PrintRecordSheet sheet, Element group, int pipCount,
                        PrintRecordSheet.PipType pipType) {
        addPips(sheet, group, pipCount, pipType, 0.5);
    }

    /**
     * Processes the <code>rect</code> elements within a group to find the width of the region
     * at each marked point and adds circular pip elements to the group layed out in a symmetric
     * pattern.
     *
     * @param sheet       The record sheet being printed.
     * @param group       The group element that contains the <code>rect</code> elements that
     *                    mark the dimensions of the area on the armor or structure diagram.
     * @param pipCount    The number of armor or structure pips to add
     */
    static void addPips(PrintRecordSheet sheet, Element group, int pipCount) {
        addPips(sheet, group, pipCount, PrintRecordSheet.PipType.CIRCLE, 0.5);
    }

    private ArmorPipLayout(PrintRecordSheet sheet, Element group, int pipCount, PrintRecordSheet.PipType pipType,
                   double strokeWidth) {
        this.sheet = sheet;
        this.group = group;
        this.pipCount = pipCount;
        this.pipType = pipType;
        this.strokeWidth = strokeWidth;
        bounds = processRegions();
        avgHeight = regions.values().stream().mapToDouble(Rectangle2D::getHeight).average().orElse(0.0);
        avgWidth = regions.values().stream().mapToDouble(Rectangle2D::getWidth).average().orElse(0.0);
    }

    /**
     * Iterates through the <code>rect</code> elements in the group, sorts them into a {@link TreeMap}
     * keyed to the y coordinate of the top, and calculates the bounding box.
     *
     * @return The bounding box of the region
     */
    private Bounds processRegions() {
        double left = Double.MAX_VALUE;
        double top = Double.MAX_VALUE;
        double right = 0.0;
        double bottom = 0.0;
        for (int i = 0; i < group.getChildNodes().getLength(); i++) {
            final Node r = group.getChildNodes().item(i);
            if (r instanceof SVGRectElement) {
                Rectangle2D bbox = PrintRecordSheet.getRectBBox((SVGRectElement) r);
                if (bbox.getX() < left) {
                    left = bbox.getX();
                }
                if (bbox.getY() < top) {
                    top = bbox.getY();
                }
                if (bbox.getX() + bbox.getWidth() > right) {
                    right = bbox.getX() + bbox.getWidth();
                }
                if (bbox.getY() + bbox.getHeight() > bottom) {
                    bottom = bbox.getY() + bbox.getHeight();
                }
                regions.put(bbox.getY(), bbox);
            }
        }
        return new Bounds(left, top, right, bottom);
    }

    /**
     * Performs the calculations to lay out the pips and adds them to the document.
     */
    void process() {
        /* Estimate the number of rows required by finding the height of a rectangle
         * with an area of pipCount that has the same aspect ratio as the bounding box.
         */
        int nRows = Math.max(1, (int) Math.round(Math.sqrt(pipCount * bounds.height() / bounds.width())));

        // We don't want to allocate more rows than we have pips.
        if (nRows > pipCount) {
            nRows = pipCount;
        }
        // Calculate the average width of the rows in pips, but no more than the number that can
        // fit in the average row. avgHeight is the initial default cell size.
        int nCols = Math.min(pipCount / nRows, (int) (avgWidth / avgHeight));
        // If the initial number is not enough to hold the number of pips add more rows
        // or columns, attempting to keep close to the original aspect ratio.
        while ((nCols * nRows < pipCount) && (nRows <= pipCount)) {
            if (avgWidth / nCols > bounds.height() / nRows) {
                nCols++;
            } else {
                nRows++;
            }
        }
        // If staggered, successive rows are offset by a half pip to allow the rows to be closer
        // together
        boolean staggered = false;
        double radius = avgHeight * DEFAULT_PIP_SIZE;
        double spacing = Math.min(avgHeight, bounds.height() / nRows);
        // If the orthagonal arrangement is not possible, we may also have to scale down
        // this size of the pips.
        if (spacing < avgHeight) {
            staggered = true;
            radius = Math.min(radius, spacing * 0.5);
        }

        // Number of pips per row
        List<Integer> rowCount = new ArrayList<>();
        // The bounds of each actual row
        List<Bounds> rows = new ArrayList<>();
        // Expand the spacing between rows geometrically
        spacing = Math.sqrt(spacing * nRows / bounds.height()) * bounds.height() / nRows;
        double ypos = Math.max(bounds.top, bounds.top + (bounds.height() - spacing * nRows) / 2.0
                + spacing * 0.5 - radius);
        // As we add or remove pips to make the count come all even or odd (or alternating for staggered)
        // keep track of the shift and ajust up or down to keep the shift close to zero
        int shift = 0;
        // If staggered, toggle the parity after each row. Otherwise try to keep the same parity.
        int parity = nCols % 2;
        for (int r = 0; r < nRows; r++) {
            Rectangle2D upper = regions.floorEntry(ypos).getValue();
            Map.Entry<Double, Rectangle2D> lowerEntry= regions.ceilingEntry(ypos);
            Rectangle2D lower = lowerEntry == null ? upper : lowerEntry.getValue();
            Bounds row = new Bounds(Math.max(upper.getMinX(), lower.getMinX()),
                    ypos, Math.min(upper.getMaxX(), lower.getMaxX()), ypos + spacing);
            rows.add(row);
            // First we figure out how much width we have to work with on this row.
            int count = staggered ?
                    (int) (nCols * (row.width() / avgWidth) * 0.5) :
                    (int) (nCols * (row.width() / avgWidth));
            if (count % 2 != parity) {
                if (shift <= 0) {
                    count++;
                    shift--;
                } else {
                    count--;
                    shift++;
                }
                if (count * spacing * 2 > row.width()) {
                    count -= 2;
                }
            }
            rowCount.add(count);
            ypos += spacing;
            if (staggered) {
                parity = 1 - parity;
            }
        }
        double xSpacing = adjustCount(rows, rowCount, staggered, spacing);
        drawPips(rows, rowCount, staggered, Math.min(radius, xSpacing * 0.4), xSpacing);
    }

    /**
     * Takes the rough layout and adds or removes pips to match the required number.
     * Pips are added to the rows with the most extra space and removed from rows with
     * the least extra space.
     *
     * @param rows      A list of the bounding boxes of the selected rows
     * @param rowCount  The number of pips in each of the rows. This list needs to be
     *                  the same size as <code>rows</code>.
     * @param staggered If true, attempt to maintain the parity of each row.
     * @param spacing   The spacing between rows, used as the starting spacing between
     *                  pips in the row
     * @return          The ratio of the horizontal to vertical spacing
     */
    private double adjustCount(List<Bounds> rows, List<Integer> rowCount,
                               boolean staggered, double spacing) {
        int current = rowCount.stream().mapToInt(Integer::intValue).sum();
        if (current == pipCount) {
            return spacing;
        }
        // Sort the indices from the most extra space to the least
        List<Integer> indices = IntStream.range(0, rows.size()).boxed()
                .sorted(Comparator.comparingDouble(i -> rowCount.get(i) / rows.get(i).width()))
                .collect(Collectors.toList());
        int row = 0;
        int dRowCount = staggered ? 2 : 1;
        if (current > pipCount) {
            Collections.reverse(indices);
            dRowCount = -dRowCount;
        }
        int full;
        do {
            full = 0;
            while ((current != pipCount) && full < rows.size()) {
                int index = indices.get(row % indices.size());
                int change = Math.min(dRowCount, Math.abs(pipCount - current));
                if (spacing * (rowCount.get(index) + change) <= rows.get(index).width()) {
                    rowCount.set(index, rowCount.get(index) + change);
                    current += change;
                } else {
                    full++;
                }
                row++;
            }
            if (full == rows.size()) {
                spacing *= 0.9;
            }
        } while (full == rows.size());
        return spacing;
    }

    /**
     * Calculates the actual position of each pip and adds it to the document.
     *
     * @param rows      A list of bounding rectangles defining the position and width of each row
     * @param rowCount  The number of pips to place in the row with the same index
     * @param staggered If true, the horizontal spacing will be double the verticle.
     * @param radius    The radius of each pip.
     */
    private void drawPips(List<Bounds> rows, List<Integer> rowCount,
                          boolean staggered, double radius, double xSpacing) {
        double dx = staggered ? xSpacing * 2 : xSpacing;
        /* Find the row that takes up the largest perctage of its row. If it's over 100%,
         * reduce the horizontal spacing to make it fit. If lower, increase the horizontal
         * spacing by a factor of the geometric mean of the percentage and 1.0 to prevent
         * having a cluster of pips in the center and too much blank space on the sides. */
        double pct = 0.0;
        for (int r = 0; r < rows.size(); r++) {
            pct = Math.max(pct, (dx * rowCount.get(r)) / rows.get(r).width());
        }
        if (pct > 1.0) {
            dx /= pct;
        } else {
            dx /= Math.sqrt(pct);
        }
        // Start by centering the top row and fit subsequent rows into the same grid if possible.
        // If the rows shift in a way that the pips cannot fit within the grid, shift the center.
        double centerX = rows.get(0).centerX();
        // The offset needed to center the pip in the cell.
        double xPadding = dx * 0.5 - radius;
        for (int r = 0; r < rows.size(); r++) {
            double xpos;
            xpos = calcRowStartX(centerX, rowCount.get(r), dx) + xPadding;
            while (xpos < rows.get(r).left) {
                xpos += dx;
            }
            while (xpos + dx * rowCount.get(r) > rows.get(r).right) {
                xpos -= dx;
            }
            if (xpos < rows.get(r).left || rowCount.get(r) == 1) {
                centerX = rows.get(r).centerX();
                xpos = calcRowStartX(centerX, rowCount.get(r), dx) + xPadding;
            }
            for (int i = 0; i < rowCount.get(r); i++) {
                Element pip = sheet.createPip(xpos, rows.get(r).top, radius, strokeWidth, pipType);
                group.appendChild(pip);
                xpos += dx;
            }
        }
    }

    /**
     * Calculates the x coordinate of the leftmost pip to center the row on the provided anchor.
     *
     * @param center    The x coordinate of the center of the row
     * @param pipCount  The number of pips on the current row
     * @param cellWidth The width of each pip, including padding
     * @return          The x coordinate of the starting pip
     */
    private double calcRowStartX(double center, int pipCount, double cellWidth) {
        return center - cellWidth * (pipCount / 2.0);
    }

    /**
     * Data class for defining rows
     */
    private static class Bounds {
        final double left;
        final double top;
        final double right;
        final double bottom;

        Bounds(double left, double top, double right, double bottom) {
            this.left = left;
            this.top = top;
            this.right = right;
            this.bottom = bottom;
        }

        double width() {
            return right - left;
        }

        double height() {
            return bottom - top;
        }

        double centerX() {
            return left + width() * 0.5;
        }
    }
}
