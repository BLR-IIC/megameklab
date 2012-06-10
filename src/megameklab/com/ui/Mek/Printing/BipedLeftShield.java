/*
 * MegaMekLab - Copyright (C) 2012
 *
 * Original author - Sebastian Brocks (beerockxs@users.sourceforge.net)
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
package megameklab.com.ui.Mek.Printing;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;

/**
 * This class has been automatically generated using <a
 * href="http://englishjavadrinker.blogspot.com/search/label/SVGRoundTrip"
 * >SVGRoundTrip</a>.
 */
public class BipedLeftShield {
    /**
     * Paints the transcoded SVG image on the specified graphics context. You
     * can install a custom transformation on the graphics context to scale the
     * image.
     *
     * @param g
     *            Graphics context.
     */
    public static void paint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
        Area clip = null;

        float origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = (AlphaComposite) origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }

        Shape clip_ = g.getClip();
        AffineTransform defaultTransform_ = g.getTransform();
        // is CompositeGraphicsNode
        float alpha__0 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0 = g.getClip();
        AffineTransform defaultTransform__0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.0f, -0.0f));
        clip = new Area(g.getClip());
        clip.intersect(new Area(new Rectangle2D.Double(0.0, 0.0, 612.0, 792.0)));
        g.setClip(clip);
        // _0 is CompositeGraphicsNode
        float alpha__0_0 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0 = g.getClip();
        AffineTransform defaultTransform__0_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0 is CompositeGraphicsNode
        float alpha__0_0_0 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0 = g.getClip();
        AffineTransform defaultTransform__0_0_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0 is CompositeGraphicsNode
        float alpha__0_0_0_0 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_0 = g.getClip();
        AffineTransform defaultTransform__0_0_0_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_0 is ShapeNode
        paint = new Color(199, 200, 202, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(411.482, 144.223);
        ((GeneralPath) shape).lineTo(412.613, 144.322);
        ((GeneralPath) shape).lineTo(412.662, 143.757);
        ((GeneralPath) shape).lineTo(411.013, 143.042);
        ((GeneralPath) shape).lineTo(411.115, 141.912);
        ((GeneralPath) shape).lineTo(412.861, 141.494);
        ((GeneralPath) shape).lineTo(412.91, 140.929);
        ((GeneralPath) shape).lineTo(411.779, 140.829);
        ((GeneralPath) shape).lineTo(410.796, 139.034);
        ((GeneralPath) shape).lineTo(412.923, 114.715);
        ((GeneralPath) shape).lineTo(415.88, 92.817);
        ((GeneralPath) shape).lineTo(424.966, 82.063);
        ((GeneralPath) shape).lineTo(435.828, 74.356);
        ((GeneralPath) shape).lineTo(439.953, 75.981);
        ((GeneralPath) shape).lineTo(439.953, 88.543);
        ((GeneralPath) shape).lineTo(440.869, 94.934);
        ((GeneralPath) shape).lineTo(443.293, 94.224);
        ((GeneralPath) shape).lineTo(444.314, 116.343);
        ((GeneralPath) shape).lineTo(440.268, 114.828);
        ((GeneralPath) shape).lineTo(439.97, 118.222);
        ((GeneralPath) shape).lineTo(438.224, 118.638);
        ((GeneralPath) shape).lineTo(436.246, 141.261);
        ((GeneralPath) shape).lineTo(434.966, 142.858);
        ((GeneralPath) shape).lineTo(433.836, 142.76);
        ((GeneralPath) shape).lineTo(433.785, 143.325);
        ((GeneralPath) shape).lineTo(435.434, 144.039);
        ((GeneralPath) shape).lineTo(435.334, 145.169);
        ((GeneralPath) shape).lineTo(433.587, 145.586);
        ((GeneralPath) shape).lineTo(433.537, 146.153);
        ((GeneralPath) shape).lineTo(434.67, 146.251);
        ((GeneralPath) shape).lineTo(435.652, 148.047);
        ((GeneralPath) shape).lineTo(433.029, 178.021);
        ((GeneralPath) shape).lineTo(431.186, 179.57);
        ((GeneralPath) shape).lineTo(410.824, 177.789);
        ((GeneralPath) shape).lineTo(404.73, 169.277);
        ((GeneralPath) shape).lineTo(409.636, 145.771);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        origAlpha = alpha__0_0_0_0;
        g.setTransform(defaultTransform__0_0_0_0);
        g.setClip(clip__0_0_0_0);
        float alpha__0_0_0_1 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_1 = g.getClip();
        AffineTransform defaultTransform__0_0_0_1 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_1 is CompositeGraphicsNode
        float alpha__0_0_0_1_0 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_1_0 = g.getClip();
        AffineTransform defaultTransform__0_0_0_1_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_1_0 is ShapeNode
        paint = new Color(199, 200, 202, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(421.135, 192.455);
        ((GeneralPath) shape).lineTo(420.808, 196.197);
        ((GeneralPath) shape).curveTo(420.86603, 195.53, 421.14102, 194.93501,
                421.55103, 194.474);
        ((GeneralPath) shape).curveTo(421.23, 193.863, 421.072, 193.173,
                421.135, 192.455);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        origAlpha = alpha__0_0_0_1_0;
        g.setTransform(defaultTransform__0_0_0_1_0);
        g.setClip(clip__0_0_0_1_0);
        float alpha__0_0_0_1_1 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_1_1 = g.getClip();
        AffineTransform defaultTransform__0_0_0_1_1 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_1_1 is ShapeNode
        paint = new Color(199, 200, 202, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(419.538, 197.676);
        ((GeneralPath) shape).lineTo(420.787, 199.20099);
        ((GeneralPath) shape).curveTo(421.025, 198.915, 421.366, 198.721,
                421.75897, 198.68399);
        ((GeneralPath) shape).lineTo(421.79596, 198.68098);
        ((GeneralPath) shape).curveTo(421.11996, 198.08598, 420.72195,
                197.17798, 420.80795, 196.19598);
        ((GeneralPath) shape).lineTo(420.77097, 196.61098);
        ((GeneralPath) shape).curveTo(420.729, 197.086, 420.248, 197.469,
                419.538, 197.676);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        origAlpha = alpha__0_0_0_1_1;
        g.setTransform(defaultTransform__0_0_0_1_1);
        g.setClip(clip__0_0_0_1_1);
        float alpha__0_0_0_1_2 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_1_2 = g.getClip();
        AffineTransform defaultTransform__0_0_0_1_2 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_1_2 is ShapeNode
        paint = new Color(199, 200, 202, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(430.227, 187.349);
        ((GeneralPath) shape).lineTo(427.57397, 179.248);
        ((GeneralPath) shape).lineTo(414.22598, 178.08);
        ((GeneralPath) shape).lineTo(409.865, 189.502);
        ((GeneralPath) shape).lineTo(412.71298, 189.75099);
        ((GeneralPath) shape).lineTo(412.012, 197.769);
        ((GeneralPath) shape).curveTo(411.971, 198.215, 412.10498, 198.677,
                412.427, 199.049);
        ((GeneralPath) shape).lineTo(417.062, 204.399);
        ((GeneralPath) shape).curveTo(417.703, 205.13701, 418.836, 205.23601,
                419.595, 204.62);
        ((GeneralPath) shape).curveTo(419.738, 204.504, 419.85, 204.366,
                419.946, 204.222);
        ((GeneralPath) shape).curveTo(420.19302, 204.314, 420.462, 204.362,
                420.74402, 204.338);
        ((GeneralPath) shape).lineTo(424.32303, 204.04399);
        ((GeneralPath) shape).curveTo(425.31104, 203.963, 426.04004, 203.12,
                425.95004, 202.16199);
        ((GeneralPath) shape).curveTo(425.91403, 201.76498, 425.73605, 201.415,
                425.47705, 201.14099);
        ((GeneralPath) shape).curveTo(425.93204, 200.85999, 426.22205,
                200.33499, 426.17307, 199.756);
        ((GeneralPath) shape).curveTo(426.13507, 199.29399, 425.88806, 198.907,
                425.53806, 198.66899);
        ((GeneralPath) shape).curveTo(426.08606, 198.185, 426.46005, 197.493,
                426.52905, 196.698);
        ((GeneralPath) shape).curveTo(426.53006, 196.677, 426.53006, 196.65599,
                426.53107, 196.634);
        ((GeneralPath) shape).curveTo(428.24408, 196.245, 429.56708, 194.907,
                429.71606, 193.207);
        ((GeneralPath) shape).lineTo(430.05807, 189.302);
        ((GeneralPath) shape).curveTo(430.1161, 188.639, 429.98807, 187.99901,
                429.7151, 187.424);
        ((GeneralPath) shape).lineTo(430.227, 187.349);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        origAlpha = alpha__0_0_0_1_2;
        g.setTransform(defaultTransform__0_0_0_1_2);
        g.setClip(clip__0_0_0_1_2);
        origAlpha = alpha__0_0_0_1;
        g.setTransform(defaultTransform__0_0_0_1);
        g.setClip(clip__0_0_0_1);
        float alpha__0_0_0_2 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_2 = g.getClip();
        AffineTransform defaultTransform__0_0_0_2 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_2 is CompositeGraphicsNode
        float alpha__0_0_0_2_0 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_2_0 = g.getClip();
        AffineTransform defaultTransform__0_0_0_2_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_2_0 is CompositeGraphicsNode
        float alpha__0_0_0_2_0_0 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_2_0_0 = g.getClip();
        AffineTransform defaultTransform__0_0_0_2_0_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_2_0_0 is CompositeGraphicsNode
        float alpha__0_0_0_2_0_0_0 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_2_0_0_0 = g.getClip();
        AffineTransform defaultTransform__0_0_0_2_0_0_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_2_0_0_0 is ShapeNode
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(418.3, 189.974);
        ((GeneralPath) shape).lineTo(417.973, 193.716);
        ((GeneralPath) shape).curveTo(418.031, 193.049, 418.306, 192.45401,
                418.716, 191.993);
        ((GeneralPath) shape).curveTo(418.396, 191.382, 418.237, 190.692,
                418.3, 189.974);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_2_0_0_0;
        g.setTransform(defaultTransform__0_0_0_2_0_0_0);
        g.setClip(clip__0_0_0_2_0_0_0);
        float alpha__0_0_0_2_0_0_1 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_2_0_0_1 = g.getClip();
        AffineTransform defaultTransform__0_0_0_2_0_0_1 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_2_0_0_1 is ShapeNode
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(416.703, 195.195);
        ((GeneralPath) shape).lineTo(417.952, 196.72);
        ((GeneralPath) shape).curveTo(418.19, 196.434, 418.531, 196.24,
                418.92398, 196.203);
        ((GeneralPath) shape).lineTo(418.96097, 196.2);
        ((GeneralPath) shape).curveTo(418.28497, 195.605, 417.88696, 194.69699,
                417.97296, 193.715);
        ((GeneralPath) shape).lineTo(417.93597, 194.12999);
        ((GeneralPath) shape).curveTo(417.894, 194.605, 417.413, 194.988,
                416.703, 195.195);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_2_0_0_1;
        g.setTransform(defaultTransform__0_0_0_2_0_0_1);
        g.setClip(clip__0_0_0_2_0_0_1);
        float alpha__0_0_0_2_0_0_2 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_2_0_0_2 = g.getClip();
        AffineTransform defaultTransform__0_0_0_2_0_0_2 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_2_0_0_2 is ShapeNode
        paint = new Color(255, 255, 255, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(427.392, 184.868);
        ((GeneralPath) shape).lineTo(424.73898, 176.767);
        ((GeneralPath) shape).lineTo(411.391, 175.599);
        ((GeneralPath) shape).lineTo(407.03, 187.021);
        ((GeneralPath) shape).lineTo(409.878, 187.26999);
        ((GeneralPath) shape).lineTo(409.177, 195.288);
        ((GeneralPath) shape).curveTo(409.13602, 195.734, 409.27, 196.196,
                409.592, 196.568);
        ((GeneralPath) shape).lineTo(414.22702, 201.918);
        ((GeneralPath) shape).curveTo(414.868, 202.656, 416.001, 202.755,
                416.76, 202.13899);
        ((GeneralPath) shape).curveTo(416.903, 202.023, 417.015, 201.885,
                417.11102, 201.741);
        ((GeneralPath) shape).curveTo(417.35803, 201.833, 417.627, 201.881,
                417.90903, 201.857);
        ((GeneralPath) shape).lineTo(421.48804, 201.56299);
        ((GeneralPath) shape).curveTo(422.47604, 201.482, 423.20505, 200.63899,
                423.11505, 199.68098);
        ((GeneralPath) shape).curveTo(423.07904, 199.28398, 422.90106,
                198.93399, 422.64206, 198.65999);
        ((GeneralPath) shape).curveTo(423.09705, 198.37898, 423.38705,
                197.85399, 423.33807, 197.275);
        ((GeneralPath) shape).curveTo(423.30008, 196.81299, 423.05307, 196.426,
                422.70306, 196.18799);
        ((GeneralPath) shape).curveTo(423.25107, 195.704, 423.62506, 195.012,
                423.69406, 194.217);
        ((GeneralPath) shape).curveTo(423.69507, 194.196, 423.69507, 194.17499,
                423.69608, 194.153);
        ((GeneralPath) shape).curveTo(425.4091, 193.76399, 426.7321, 192.426,
                426.88107, 190.726);
        ((GeneralPath) shape).lineTo(427.22308, 186.821);
        ((GeneralPath) shape).curveTo(427.2811, 186.158, 427.15308, 185.518,
                426.8801, 184.943);
        ((GeneralPath) shape).lineTo(427.392, 184.868);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(427.392, 184.868);
        ((GeneralPath) shape).lineTo(424.73898, 176.767);
        ((GeneralPath) shape).lineTo(411.391, 175.599);
        ((GeneralPath) shape).lineTo(407.03, 187.021);
        ((GeneralPath) shape).lineTo(409.878, 187.26999);
        ((GeneralPath) shape).lineTo(409.177, 195.288);
        ((GeneralPath) shape).curveTo(409.13602, 195.734, 409.27, 196.196,
                409.592, 196.568);
        ((GeneralPath) shape).lineTo(414.22702, 201.918);
        ((GeneralPath) shape).curveTo(414.868, 202.656, 416.001, 202.755,
                416.76, 202.13899);
        ((GeneralPath) shape).curveTo(416.903, 202.023, 417.015, 201.885,
                417.11102, 201.741);
        ((GeneralPath) shape).curveTo(417.35803, 201.833, 417.627, 201.881,
                417.90903, 201.857);
        ((GeneralPath) shape).lineTo(421.48804, 201.56299);
        ((GeneralPath) shape).curveTo(422.47604, 201.482, 423.20505, 200.63899,
                423.11505, 199.68098);
        ((GeneralPath) shape).curveTo(423.07904, 199.28398, 422.90106,
                198.93399, 422.64206, 198.65999);
        ((GeneralPath) shape).curveTo(423.09705, 198.37898, 423.38705,
                197.85399, 423.33807, 197.275);
        ((GeneralPath) shape).curveTo(423.30008, 196.81299, 423.05307, 196.426,
                422.70306, 196.18799);
        ((GeneralPath) shape).curveTo(423.25107, 195.704, 423.62506, 195.012,
                423.69406, 194.217);
        ((GeneralPath) shape).curveTo(423.69507, 194.196, 423.69507, 194.17499,
                423.69608, 194.153);
        ((GeneralPath) shape).curveTo(425.4091, 193.76399, 426.7321, 192.426,
                426.88107, 190.726);
        ((GeneralPath) shape).lineTo(427.22308, 186.821);
        ((GeneralPath) shape).curveTo(427.2811, 186.158, 427.15308, 185.518,
                426.8801, 184.943);
        ((GeneralPath) shape).lineTo(427.392, 184.868);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_2_0_0_2;
        g.setTransform(defaultTransform__0_0_0_2_0_0_2);
        g.setClip(clip__0_0_0_2_0_0_2);
        origAlpha = alpha__0_0_0_2_0_0;
        g.setTransform(defaultTransform__0_0_0_2_0_0);
        g.setClip(clip__0_0_0_2_0_0);
        float alpha__0_0_0_2_0_1 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_2_0_1 = g.getClip();
        AffineTransform defaultTransform__0_0_0_2_0_1 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_2_0_1 is CompositeGraphicsNode
        float alpha__0_0_0_2_0_1_0 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_2_0_1_0 = g.getClip();
        AffineTransform defaultTransform__0_0_0_2_0_1_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_2_0_1_0 is CompositeGraphicsNode
        float alpha__0_0_0_2_0_1_0_0 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_2_0_1_0_0 = g.getClip();
        AffineTransform defaultTransform__0_0_0_2_0_1_0_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_2_0_1_0_0 is ShapeNode
        paint = new Color(255, 255, 255, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(421.164, 198.092);
        ((GeneralPath) shape).curveTo(422.151, 198.011, 423.023, 198.721,
                423.113, 199.68);
        ((GeneralPath) shape).lineTo(423.113, 199.68);
        ((GeneralPath) shape).curveTo(423.203, 200.63799, 422.474, 201.48099,
                421.486, 201.562);
        ((GeneralPath) shape).lineTo(417.90698, 201.856);
        ((GeneralPath) shape).curveTo(416.91797, 201.938, 416.046, 201.226,
                415.956, 200.268);
        ((GeneralPath) shape).lineTo(415.956, 200.268);
        ((GeneralPath) shape).curveTo(415.867, 199.31001, 416.596, 198.46701,
                417.58398, 198.38501);
        ((GeneralPath) shape).lineTo(421.164, 198.092);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(421.164, 198.092);
        ((GeneralPath) shape).curveTo(422.151, 198.011, 423.023, 198.721,
                423.113, 199.68);
        ((GeneralPath) shape).lineTo(423.113, 199.68);
        ((GeneralPath) shape).curveTo(423.203, 200.63799, 422.474, 201.48099,
                421.486, 201.562);
        ((GeneralPath) shape).lineTo(417.90698, 201.856);
        ((GeneralPath) shape).curveTo(416.91797, 201.938, 416.046, 201.226,
                415.956, 200.268);
        ((GeneralPath) shape).lineTo(415.956, 200.268);
        ((GeneralPath) shape).curveTo(415.867, 199.31001, 416.596, 198.46701,
                417.58398, 198.38501);
        ((GeneralPath) shape).lineTo(421.164, 198.092);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_2_0_1_0_0;
        g.setTransform(defaultTransform__0_0_0_2_0_1_0_0);
        g.setClip(clip__0_0_0_2_0_1_0_0);
        float alpha__0_0_0_2_0_1_0_1 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_2_0_1_0_1 = g.getClip();
        AffineTransform defaultTransform__0_0_0_2_0_1_0_1 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_2_0_1_0_1 is ShapeNode
        paint = new Color(255, 255, 255, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(416.974, 199.687);
        ((GeneralPath) shape).curveTo(417.613, 200.425, 417.517, 201.522,
                416.759, 202.13899);
        ((GeneralPath) shape).lineTo(416.759, 202.13899);
        ((GeneralPath) shape).curveTo(416.0, 202.75499, 414.866, 202.65599,
                414.226, 201.918);
        ((GeneralPath) shape).lineTo(409.591, 196.568);
        ((GeneralPath) shape).curveTo(408.951, 195.829, 409.048, 194.73099,
                409.807, 194.11499);
        ((GeneralPath) shape).lineTo(409.807, 194.11499);
        ((GeneralPath) shape).curveTo(410.566, 193.49799, 411.699, 193.59698,
                412.33902, 194.33598);
        ((GeneralPath) shape).lineTo(416.974, 199.687);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(416.974, 199.687);
        ((GeneralPath) shape).curveTo(417.613, 200.425, 417.517, 201.522,
                416.759, 202.13899);
        ((GeneralPath) shape).lineTo(416.759, 202.13899);
        ((GeneralPath) shape).curveTo(416.0, 202.75499, 414.866, 202.65599,
                414.226, 201.918);
        ((GeneralPath) shape).lineTo(409.591, 196.568);
        ((GeneralPath) shape).curveTo(408.951, 195.829, 409.048, 194.73099,
                409.807, 194.11499);
        ((GeneralPath) shape).lineTo(409.807, 194.11499);
        ((GeneralPath) shape).curveTo(410.566, 193.49799, 411.699, 193.59698,
                412.33902, 194.33598);
        ((GeneralPath) shape).lineTo(416.974, 199.687);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_2_0_1_0_1;
        g.setTransform(defaultTransform__0_0_0_2_0_1_0_1);
        g.setClip(clip__0_0_0_2_0_1_0_1);
        float alpha__0_0_0_2_0_1_0_2 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_2_0_1_0_2 = g.getClip();
        AffineTransform defaultTransform__0_0_0_2_0_1_0_2 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_2_0_1_0_2 is ShapeNode
        paint = new Color(255, 255, 255, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(416.336, 195.922);
        ((GeneralPath) shape).curveTo(416.25198, 196.87999, 414.581, 197.51599,
                412.605, 197.343);
        ((GeneralPath) shape).lineTo(412.605, 197.343);
        ((GeneralPath) shape).curveTo(410.627, 197.171, 409.092, 196.254,
                409.17603, 195.296);
        ((GeneralPath) shape).lineTo(410.08502, 184.88701);
        ((GeneralPath) shape).curveTo(410.16904, 183.92902, 411.84003,
                183.29301, 413.81802, 183.466);
        ((GeneralPath) shape).lineTo(413.81802, 183.466);
        ((GeneralPath) shape).curveTo(415.79703, 183.639, 417.33002, 184.556,
                417.24603, 185.515);
        ((GeneralPath) shape).lineTo(416.336, 195.922);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(416.336, 195.922);
        ((GeneralPath) shape).curveTo(416.25198, 196.87999, 414.581, 197.51599,
                412.605, 197.343);
        ((GeneralPath) shape).lineTo(412.605, 197.343);
        ((GeneralPath) shape).curveTo(410.627, 197.171, 409.092, 196.254,
                409.17603, 195.296);
        ((GeneralPath) shape).lineTo(410.08502, 184.88701);
        ((GeneralPath) shape).curveTo(410.16904, 183.92902, 411.84003,
                183.29301, 413.81802, 183.466);
        ((GeneralPath) shape).lineTo(413.81802, 183.466);
        ((GeneralPath) shape).curveTo(415.79703, 183.639, 417.33002, 184.556,
                417.24603, 185.515);
        ((GeneralPath) shape).lineTo(416.336, 195.922);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_2_0_1_0_2;
        g.setTransform(defaultTransform__0_0_0_2_0_1_0_2);
        g.setClip(clip__0_0_0_2_0_1_0_2);
        origAlpha = alpha__0_0_0_2_0_1_0;
        g.setTransform(defaultTransform__0_0_0_2_0_1_0);
        g.setClip(clip__0_0_0_2_0_1_0);
        float alpha__0_0_0_2_0_1_1 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_2_0_1_1 = g.getClip();
        AffineTransform defaultTransform__0_0_0_2_0_1_1 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_2_0_1_1 is CompositeGraphicsNode
        float alpha__0_0_0_2_0_1_1_0 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_2_0_1_1_0 = g.getClip();
        AffineTransform defaultTransform__0_0_0_2_0_1_1_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_2_0_1_1_0 is ShapeNode
        paint = new Color(255, 255, 255, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(421.785, 195.942);
        ((GeneralPath) shape).curveTo(422.575, 195.87, 423.269, 196.466,
                423.337, 197.275);
        ((GeneralPath) shape).lineTo(423.337, 197.275);
        ((GeneralPath) shape).curveTo(423.405, 198.083, 422.819, 198.797,
                422.029, 198.87);
        ((GeneralPath) shape).lineTo(419.167, 199.13199);
        ((GeneralPath) shape).curveTo(418.378, 199.204, 417.68298, 198.60799,
                417.615, 197.79999);
        ((GeneralPath) shape).lineTo(417.615, 197.79999);
        ((GeneralPath) shape).curveTo(417.548, 196.99098, 418.134, 196.277,
                418.92398, 196.204);
        ((GeneralPath) shape).lineTo(421.785, 195.942);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(421.785, 195.942);
        ((GeneralPath) shape).curveTo(422.575, 195.87, 423.269, 196.466,
                423.337, 197.275);
        ((GeneralPath) shape).lineTo(423.337, 197.275);
        ((GeneralPath) shape).curveTo(423.405, 198.083, 422.819, 198.797,
                422.029, 198.87);
        ((GeneralPath) shape).lineTo(419.167, 199.13199);
        ((GeneralPath) shape).curveTo(418.378, 199.204, 417.68298, 198.60799,
                417.615, 197.79999);
        ((GeneralPath) shape).lineTo(417.615, 197.79999);
        ((GeneralPath) shape).curveTo(417.548, 196.99098, 418.134, 196.277,
                418.92398, 196.204);
        ((GeneralPath) shape).lineTo(421.785, 195.942);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_2_0_1_1_0;
        g.setTransform(defaultTransform__0_0_0_2_0_1_1_0);
        g.setClip(clip__0_0_0_2_0_1_1_0);
        float alpha__0_0_0_2_0_1_1_1 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_2_0_1_1_1 = g.getClip();
        AffineTransform defaultTransform__0_0_0_2_0_1_1_1 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_2_0_1_1_1 is ShapeNode
        paint = new Color(255, 255, 255, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(418.431, 197.304);
        ((GeneralPath) shape).curveTo(418.94, 197.925, 418.858, 198.852,
                418.25, 199.375);
        ((GeneralPath) shape).lineTo(418.25, 199.375);
        ((GeneralPath) shape).curveTo(417.64, 199.897, 416.735, 199.817,
                416.227, 199.198);
        ((GeneralPath) shape).lineTo(412.54398, 194.703);
        ((GeneralPath) shape).curveTo(412.03598, 194.082, 412.11697, 193.155,
                412.72598, 192.631);
        ((GeneralPath) shape).lineTo(412.72598, 192.631);
        ((GeneralPath) shape).curveTo(413.33298, 192.109, 414.24, 192.188,
                414.748, 192.808);
        ((GeneralPath) shape).lineTo(418.431, 197.304);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(418.431, 197.304);
        ((GeneralPath) shape).curveTo(418.94, 197.925, 418.858, 198.852,
                418.25, 199.375);
        ((GeneralPath) shape).lineTo(418.25, 199.375);
        ((GeneralPath) shape).curveTo(417.64, 199.897, 416.735, 199.817,
                416.227, 199.198);
        ((GeneralPath) shape).lineTo(412.54398, 194.703);
        ((GeneralPath) shape).curveTo(412.03598, 194.082, 412.11697, 193.155,
                412.72598, 192.631);
        ((GeneralPath) shape).lineTo(412.72598, 192.631);
        ((GeneralPath) shape).curveTo(413.33298, 192.109, 414.24, 192.188,
                414.748, 192.808);
        ((GeneralPath) shape).lineTo(418.431, 197.304);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_2_0_1_1_1;
        g.setTransform(defaultTransform__0_0_0_2_0_1_1_1);
        g.setClip(clip__0_0_0_2_0_1_1_1);
        float alpha__0_0_0_2_0_1_1_2 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_2_0_1_1_2 = g.getClip();
        AffineTransform defaultTransform__0_0_0_2_0_1_1_2 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_2_0_1_1_2 is ShapeNode
        paint = new Color(255, 255, 255, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(417.936, 194.13);
        ((GeneralPath) shape).curveTo(417.867, 194.938, 416.528, 195.48201,
                414.95, 195.343);
        ((GeneralPath) shape).lineTo(414.95, 195.343);
        ((GeneralPath) shape).curveTo(413.36902, 195.205, 412.14603, 194.438,
                412.217, 193.63);
        ((GeneralPath) shape).lineTo(412.98602, 184.84401);
        ((GeneralPath) shape).curveTo(413.05603, 184.035, 414.394, 183.49101,
                415.97403, 183.62901);
        ((GeneralPath) shape).lineTo(415.97403, 183.62901);
        ((GeneralPath) shape).curveTo(417.55304, 183.76701, 418.77704,
                184.53601, 418.70602, 185.34401);
        ((GeneralPath) shape).lineTo(417.936, 194.13);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(417.936, 194.13);
        ((GeneralPath) shape).curveTo(417.867, 194.938, 416.528, 195.48201,
                414.95, 195.343);
        ((GeneralPath) shape).lineTo(414.95, 195.343);
        ((GeneralPath) shape).curveTo(413.36902, 195.205, 412.14603, 194.438,
                412.217, 193.63);
        ((GeneralPath) shape).lineTo(412.98602, 184.84401);
        ((GeneralPath) shape).curveTo(413.05603, 184.035, 414.394, 183.49101,
                415.97403, 183.62901);
        ((GeneralPath) shape).lineTo(415.97403, 183.62901);
        ((GeneralPath) shape).curveTo(417.55304, 183.76701, 418.77704,
                184.53601, 418.70602, 185.34401);
        ((GeneralPath) shape).lineTo(417.936, 194.13);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_2_0_1_1_2;
        g.setTransform(defaultTransform__0_0_0_2_0_1_1_2);
        g.setClip(clip__0_0_0_2_0_1_1_2);
        origAlpha = alpha__0_0_0_2_0_1_1;
        g.setTransform(defaultTransform__0_0_0_2_0_1_1);
        g.setClip(clip__0_0_0_2_0_1_1);
        float alpha__0_0_0_2_0_1_2 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_2_0_1_2 = g.getClip();
        AffineTransform defaultTransform__0_0_0_2_0_1_2 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_2_0_1_2 is CompositeGraphicsNode
        float alpha__0_0_0_2_0_1_2_0 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_2_0_1_2_0 = g.getClip();
        AffineTransform defaultTransform__0_0_0_2_0_1_2_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_2_0_1_2_0 is ShapeNode
        paint = new Color(255, 255, 255, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(423.693, 194.217);
        ((GeneralPath) shape).curveTo(423.55, 195.83499, 422.156, 197.03299,
                420.576, 196.896);
        ((GeneralPath) shape).lineTo(420.576, 196.896);
        ((GeneralPath) shape).curveTo(418.99698, 196.75699, 417.83, 195.333,
                417.972, 193.716);
        ((GeneralPath) shape).lineTo(417.972, 193.716);
        ((GeneralPath) shape).curveTo(418.11298, 192.099, 419.508, 190.90001,
                421.08798, 191.03801);
        ((GeneralPath) shape).lineTo(421.08798, 191.03801);
        ((GeneralPath) shape).curveTo(422.668, 191.175, 423.834, 192.6,
                423.693, 194.217);
        ((GeneralPath) shape).lineTo(423.693, 194.217);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(423.693, 194.217);
        ((GeneralPath) shape).curveTo(423.55, 195.83499, 422.156, 197.03299,
                420.576, 196.896);
        ((GeneralPath) shape).lineTo(420.576, 196.896);
        ((GeneralPath) shape).curveTo(418.99698, 196.75699, 417.83, 195.333,
                417.972, 193.716);
        ((GeneralPath) shape).lineTo(417.972, 193.716);
        ((GeneralPath) shape).curveTo(418.11298, 192.099, 419.508, 190.90001,
                421.08798, 191.03801);
        ((GeneralPath) shape).lineTo(421.08798, 191.03801);
        ((GeneralPath) shape).curveTo(422.668, 191.175, 423.834, 192.6,
                423.693, 194.217);
        ((GeneralPath) shape).lineTo(423.693, 194.217);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_2_0_1_2_0;
        g.setTransform(defaultTransform__0_0_0_2_0_1_2_0);
        g.setClip(clip__0_0_0_2_0_1_2_0);
        float alpha__0_0_0_2_0_1_2_1 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_2_0_1_2_1 = g.getClip();
        AffineTransform defaultTransform__0_0_0_2_0_1_2_1 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_2_0_1_2_1 is ShapeNode
        paint = new Color(255, 255, 255, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(426.88, 190.725);
        ((GeneralPath) shape).curveTo(426.69202, 192.88101, 424.618, 194.462,
                422.249, 194.25401);
        ((GeneralPath) shape).lineTo(422.249, 194.25401);
        ((GeneralPath) shape).curveTo(419.878, 194.04701, 418.111, 192.13002,
                418.3, 189.97401);
        ((GeneralPath) shape).lineTo(418.642, 186.07);
        ((GeneralPath) shape).curveTo(418.83, 183.914, 420.904, 182.33401,
                423.273, 182.541);
        ((GeneralPath) shape).lineTo(423.273, 182.541);
        ((GeneralPath) shape).curveTo(425.643, 182.748, 427.41, 184.664,
                427.22202, 186.821);
        ((GeneralPath) shape).lineTo(426.88, 190.725);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(426.88, 190.725);
        ((GeneralPath) shape).curveTo(426.69202, 192.88101, 424.618, 194.462,
                422.249, 194.25401);
        ((GeneralPath) shape).lineTo(422.249, 194.25401);
        ((GeneralPath) shape).curveTo(419.878, 194.04701, 418.111, 192.13002,
                418.3, 189.97401);
        ((GeneralPath) shape).lineTo(418.642, 186.07);
        ((GeneralPath) shape).curveTo(418.83, 183.914, 420.904, 182.33401,
                423.273, 182.541);
        ((GeneralPath) shape).lineTo(423.273, 182.541);
        ((GeneralPath) shape).curveTo(425.643, 182.748, 427.41, 184.664,
                427.22202, 186.821);
        ((GeneralPath) shape).lineTo(426.88, 190.725);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_2_0_1_2_1;
        g.setTransform(defaultTransform__0_0_0_2_0_1_2_1);
        g.setClip(clip__0_0_0_2_0_1_2_1);
        origAlpha = alpha__0_0_0_2_0_1_2;
        g.setTransform(defaultTransform__0_0_0_2_0_1_2);
        g.setClip(clip__0_0_0_2_0_1_2);
        float alpha__0_0_0_2_0_1_3 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_2_0_1_3 = g.getClip();
        AffineTransform defaultTransform__0_0_0_2_0_1_3 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_2_0_1_3 is ShapeNode
        paint = new Color(255, 255, 255, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(407.029, 187.021);
        ((GeneralPath) shape).lineTo(410.367, 187.314);
        ((GeneralPath) shape).lineTo(427.392, 184.868);
        ((GeneralPath) shape).lineTo(424.738, 176.767);
        ((GeneralPath) shape).lineTo(411.391, 175.599);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(407.029, 187.021);
        ((GeneralPath) shape).lineTo(410.367, 187.314);
        ((GeneralPath) shape).lineTo(427.392, 184.868);
        ((GeneralPath) shape).lineTo(424.738, 176.767);
        ((GeneralPath) shape).lineTo(411.391, 175.599);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_2_0_1_3;
        g.setTransform(defaultTransform__0_0_0_2_0_1_3);
        g.setClip(clip__0_0_0_2_0_1_3);
        origAlpha = alpha__0_0_0_2_0_1;
        g.setTransform(defaultTransform__0_0_0_2_0_1);
        g.setClip(clip__0_0_0_2_0_1);
        origAlpha = alpha__0_0_0_2_0;
        g.setTransform(defaultTransform__0_0_0_2_0);
        g.setClip(clip__0_0_0_2_0);
        origAlpha = alpha__0_0_0_2;
        g.setTransform(defaultTransform__0_0_0_2);
        g.setClip(clip__0_0_0_2);
        float alpha__0_0_0_3 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_3 = g.getClip();
        AffineTransform defaultTransform__0_0_0_3 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_3 is ShapeNode
        paint = new Color(198, 200, 202, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(398.851, 144.193);
        ((GeneralPath) shape).curveTo(398.72202, 144.193, 398.59302, 144.159,
                398.47702, 144.092);
        ((GeneralPath) shape).curveTo(398.24402, 143.957, 398.1, 143.705,
                398.1, 143.444);
        ((GeneralPath) shape).lineTo(398.1, 81.327);
        ((GeneralPath) shape).lineTo(398.1, 81.3);
        ((GeneralPath) shape).lineTo(400.178, 29.946003);
        ((GeneralPath) shape).curveTo(400.19702, 29.568003, 400.493, 29.253002,
                400.88, 29.226004);
        ((GeneralPath) shape).lineTo(425.63, 27.561005);
        ((GeneralPath) shape).curveTo(425.651, 27.559004, 425.671, 27.558004,
                425.693, 27.558004);
        ((GeneralPath) shape).curveTo(425.879, 27.558004, 426.059, 27.629004,
                426.188, 27.759005);
        ((GeneralPath) shape).curveTo(426.341, 27.894005, 426.431, 28.092005,
                426.431, 28.299006);
        ((GeneralPath) shape).lineTo(426.746, 59.025005);
        ((GeneralPath) shape).lineTo(430.696, 59.070004);
        ((GeneralPath) shape).curveTo(431.084, 59.070004, 431.398, 59.367004,
                431.43503, 59.754005);
        ((GeneralPath) shape).lineTo(432.60504, 72.507);
        ((GeneralPath) shape).curveTo(432.63004, 72.786, 432.49704, 73.05601,
                432.25305, 73.20901);
        ((GeneralPath) shape).lineTo(423.44104, 78.81601);
        ((GeneralPath) shape).lineTo(412.73206, 91.31701);
        ((GeneralPath) shape).lineTo(407.08804, 139.27802);
        ((GeneralPath) shape).curveTo(407.06104, 139.51201, 406.91705,
                139.72801, 406.71005, 139.84502);
        ((GeneralPath) shape).lineTo(399.22305, 144.09302);
        ((GeneralPath) shape).curveTo(399.107, 144.16, 398.979, 144.193,
                398.851, 144.193);
        g.setPaint(paint);
        g.fill(shape);
        origAlpha = alpha__0_0_0_3;
        g.setTransform(defaultTransform__0_0_0_3);
        g.setClip(clip__0_0_0_3);
        float alpha__0_0_0_4 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_4 = g.getClip();
        AffineTransform defaultTransform__0_0_0_4 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_4 is ShapeNode
        paint = new Color(255, 255, 255, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(404.344, 137.189);
        ((GeneralPath) shape).lineTo(396.853, 141.441);
        ((GeneralPath) shape).lineTo(396.853, 79.329);
        ((GeneralPath) shape).lineTo(398.927, 27.976);
        ((GeneralPath) shape).lineTo(423.683, 26.307);
        ((GeneralPath) shape).lineTo(424.003, 57.767);
        ((GeneralPath) shape).lineTo(428.69, 57.819);
        ((GeneralPath) shape).lineTo(429.855, 70.575);
        ((GeneralPath) shape).lineTo(420.942, 76.244);
        ((GeneralPath) shape).lineTo(410.013, 89.0);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 1, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(404.344, 137.189);
        ((GeneralPath) shape).lineTo(396.853, 141.441);
        ((GeneralPath) shape).lineTo(396.853, 79.329);
        ((GeneralPath) shape).lineTo(398.927, 27.976);
        ((GeneralPath) shape).lineTo(423.683, 26.307);
        ((GeneralPath) shape).lineTo(424.003, 57.767);
        ((GeneralPath) shape).lineTo(428.69, 57.819);
        ((GeneralPath) shape).lineTo(429.855, 70.575);
        ((GeneralPath) shape).lineTo(420.942, 76.244);
        ((GeneralPath) shape).lineTo(410.013, 89.0);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_4;
        g.setTransform(defaultTransform__0_0_0_4);
        g.setClip(clip__0_0_0_4);
        float alpha__0_0_0_5 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_5 = g.getClip();
        AffineTransform defaultTransform__0_0_0_5 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_5 is CompositeGraphicsNode
        float alpha__0_0_0_5_0 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_5_0 = g.getClip();
        AffineTransform defaultTransform__0_0_0_5_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_5_0 is ShapeNode
        paint = new Color(0, 0, 0, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(400.07, 75.999);
        ((GeneralPath) shape).lineTo(402.254, 75.999);
        ((GeneralPath) shape).curveTo(402.798, 75.999, 403.791, 76.071,
                403.791, 77.732);
        ((GeneralPath) shape).lineTo(403.791, 78.806);
        ((GeneralPath) shape).curveTo(403.791, 79.25, 403.719, 80.497, 402.373,
                80.497);
        ((GeneralPath) shape).lineTo(400.06998, 80.497);
        ((GeneralPath) shape).lineTo(400.06998, 75.999);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(402.254, 80.046);
        ((GeneralPath) shape).curveTo(403.15, 80.046, 403.271, 79.518, 403.282,
                78.714);
        ((GeneralPath) shape).lineTo(403.282, 77.533);
        ((GeneralPath) shape).curveTo(403.282, 77.281, 403.19202, 76.448,
                402.337, 76.448);
        ((GeneralPath) shape).lineTo(400.579, 76.448);
        ((GeneralPath) shape).lineTo(400.579, 80.046);
        ((GeneralPath) shape).lineTo(402.254, 80.046);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        origAlpha = alpha__0_0_0_5_0;
        g.setTransform(defaultTransform__0_0_0_5_0);
        g.setClip(clip__0_0_0_5_0);
        float alpha__0_0_0_5_1 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_5_1 = g.getClip();
        AffineTransform defaultTransform__0_0_0_5_1 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_5_1 is ShapeNode
        paint = new Color(0, 0, 0, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(404.998, 79.542);
        ((GeneralPath) shape).lineTo(404.651, 80.496);
        ((GeneralPath) shape).lineTo(404.119, 80.496);
        ((GeneralPath) shape).lineTo(405.75198, 75.998);
        ((GeneralPath) shape).lineTo(406.46997, 75.998);
        ((GeneralPath) shape).lineTo(408.14496, 80.496);
        ((GeneralPath) shape).lineTo(407.61896, 80.496);
        ((GeneralPath) shape).lineTo(407.26495, 79.542);
        ((GeneralPath) shape).lineTo(404.998, 79.542);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(406.123, 76.418);
        ((GeneralPath) shape).lineTo(405.136, 79.123);
        ((GeneralPath) shape).lineTo(407.12198, 79.123);
        ((GeneralPath) shape).lineTo(406.123, 76.418);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        origAlpha = alpha__0_0_0_5_1;
        g.setTransform(defaultTransform__0_0_0_5_1);
        g.setClip(clip__0_0_0_5_1);
        origAlpha = alpha__0_0_0_5;
        g.setTransform(defaultTransform__0_0_0_5);
        g.setClip(clip__0_0_0_5);
        float alpha__0_0_0_6 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_6 = g.getClip();
        AffineTransform defaultTransform__0_0_0_6 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_6 is CompositeGraphicsNode
        float alpha__0_0_0_6_0 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_6_0 = g.getClip();
        AffineTransform defaultTransform__0_0_0_6_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_6_0 is ShapeNode
        paint = new Color(0, 0, 0, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(414.245, 68.913);
        ((GeneralPath) shape).lineTo(416.429, 68.913);
        ((GeneralPath) shape).curveTo(416.973, 68.913, 417.96597, 68.985,
                417.96597, 70.646);
        ((GeneralPath) shape).lineTo(417.96597, 71.72);
        ((GeneralPath) shape).curveTo(417.96597, 72.164, 417.89398, 73.411,
                416.54797, 73.411);
        ((GeneralPath) shape).lineTo(414.24496, 73.411);
        ((GeneralPath) shape).lineTo(414.24496, 68.913);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(416.429, 72.96);
        ((GeneralPath) shape).curveTo(417.32498, 72.96, 417.44598, 72.432,
                417.457, 71.628);
        ((GeneralPath) shape).lineTo(417.457, 70.447);
        ((GeneralPath) shape).curveTo(417.457, 70.195, 417.367, 69.362,
                416.512, 69.362);
        ((GeneralPath) shape).lineTo(414.754, 69.362);
        ((GeneralPath) shape).lineTo(414.754, 72.96);
        ((GeneralPath) shape).lineTo(416.429, 72.96);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        origAlpha = alpha__0_0_0_6_0;
        g.setTransform(defaultTransform__0_0_0_6_0);
        g.setClip(clip__0_0_0_6_0);
        float alpha__0_0_0_6_1 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_6_1 = g.getClip();
        AffineTransform defaultTransform__0_0_0_6_1 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_6_1 is ShapeNode
        paint = new Color(0, 0, 0, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(419.831, 73.446);
        ((GeneralPath) shape).curveTo(419.012, 73.446, 418.527, 72.93, 418.527,
                72.03);
        ((GeneralPath) shape).lineTo(418.527, 70.291);
        ((GeneralPath) shape).curveTo(418.527, 69.02, 419.31, 68.875,
                420.39902, 68.875);
        ((GeneralPath) shape).lineTo(420.81702, 68.875);
        ((GeneralPath) shape).curveTo(421.756, 68.875, 422.044, 69.283,
                422.044, 70.17);
        ((GeneralPath) shape).lineTo(422.044, 70.313995);
        ((GeneralPath) shape).lineTo(421.536, 70.313995);
        ((GeneralPath) shape).lineTo(421.536, 70.19);
        ((GeneralPath) shape).curveTo(421.536, 69.560005, 421.40402, 69.326004,
                420.746, 69.326004);
        ((GeneralPath) shape).lineTo(420.459, 69.326004);
        ((GeneralPath) shape).curveTo(419.406, 69.326004, 419.035, 69.452,
                419.035, 70.274);
        ((GeneralPath) shape).lineTo(419.035, 71.509);
        ((GeneralPath) shape).curveTo(419.035, 72.534004, 419.077, 72.996,
                419.927, 72.996);
        ((GeneralPath) shape).lineTo(420.531, 72.996);
        ((GeneralPath) shape).curveTo(421.345, 72.996, 421.596, 72.882,
                421.596, 72.240005);
        ((GeneralPath) shape).lineTo(421.596, 71.880005);
        ((GeneralPath) shape).lineTo(422.104, 71.880005);
        ((GeneralPath) shape).lineTo(422.104, 72.3);
        ((GeneralPath) shape).curveTo(422.104, 73.331, 421.447, 73.44601,
                420.549, 73.44601);
        ((GeneralPath) shape).lineTo(419.831, 73.44601);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        origAlpha = alpha__0_0_0_6_1;
        g.setTransform(defaultTransform__0_0_0_6_1);
        g.setClip(clip__0_0_0_6_1);
        origAlpha = alpha__0_0_0_6;
        g.setTransform(defaultTransform__0_0_0_6);
        g.setClip(clip__0_0_0_6);
        float alpha__0_0_0_7 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_7 = g.getClip();
        AffineTransform defaultTransform__0_0_0_7 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_7 is ShapeNode
        paint = new Color(255, 255, 255, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(408.387, 141.735);
        ((GeneralPath) shape).lineTo(409.518, 141.834);
        ((GeneralPath) shape).lineTo(409.566, 141.269);
        ((GeneralPath) shape).lineTo(407.917, 140.554);
        ((GeneralPath) shape).lineTo(408.02, 139.424);
        ((GeneralPath) shape).lineTo(409.766, 139.006);
        ((GeneralPath) shape).lineTo(409.814, 138.441);
        ((GeneralPath) shape).lineTo(408.684, 138.341);
        ((GeneralPath) shape).lineTo(407.7, 136.546);
        ((GeneralPath) shape).lineTo(409.827, 112.227);
        ((GeneralPath) shape).lineTo(412.784, 90.329);
        ((GeneralPath) shape).lineTo(421.87, 79.575);
        ((GeneralPath) shape).lineTo(432.732, 71.868);
        ((GeneralPath) shape).lineTo(436.857, 73.493);
        ((GeneralPath) shape).lineTo(436.857, 86.056);
        ((GeneralPath) shape).lineTo(437.773, 92.446);
        ((GeneralPath) shape).lineTo(440.197, 91.736);
        ((GeneralPath) shape).lineTo(441.219, 113.855);
        ((GeneralPath) shape).lineTo(437.172, 112.34);
        ((GeneralPath) shape).lineTo(436.874, 115.734);
        ((GeneralPath) shape).lineTo(435.128, 116.15);
        ((GeneralPath) shape).lineTo(433.15, 138.773);
        ((GeneralPath) shape).lineTo(431.87, 140.37);
        ((GeneralPath) shape).lineTo(430.74, 140.272);
        ((GeneralPath) shape).lineTo(430.689, 140.837);
        ((GeneralPath) shape).lineTo(432.338, 141.551);
        ((GeneralPath) shape).lineTo(432.238, 142.682);
        ((GeneralPath) shape).lineTo(430.491, 143.099);
        ((GeneralPath) shape).lineTo(430.441, 143.665);
        ((GeneralPath) shape).lineTo(431.574, 143.764);
        ((GeneralPath) shape).lineTo(432.557, 145.559);
        ((GeneralPath) shape).lineTo(429.934, 175.533);
        ((GeneralPath) shape).lineTo(428.09, 177.082);
        ((GeneralPath) shape).lineTo(407.729, 175.301);
        ((GeneralPath) shape).lineTo(401.635, 166.789);
        ((GeneralPath) shape).lineTo(406.54, 143.283);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 1, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(408.387, 141.735);
        ((GeneralPath) shape).lineTo(409.518, 141.834);
        ((GeneralPath) shape).lineTo(409.566, 141.269);
        ((GeneralPath) shape).lineTo(407.917, 140.554);
        ((GeneralPath) shape).lineTo(408.02, 139.424);
        ((GeneralPath) shape).lineTo(409.766, 139.006);
        ((GeneralPath) shape).lineTo(409.814, 138.441);
        ((GeneralPath) shape).lineTo(408.684, 138.341);
        ((GeneralPath) shape).lineTo(407.7, 136.546);
        ((GeneralPath) shape).lineTo(409.827, 112.227);
        ((GeneralPath) shape).lineTo(412.784, 90.329);
        ((GeneralPath) shape).lineTo(421.87, 79.575);
        ((GeneralPath) shape).lineTo(432.732, 71.868);
        ((GeneralPath) shape).lineTo(436.857, 73.493);
        ((GeneralPath) shape).lineTo(436.857, 86.056);
        ((GeneralPath) shape).lineTo(437.773, 92.446);
        ((GeneralPath) shape).lineTo(440.197, 91.736);
        ((GeneralPath) shape).lineTo(441.219, 113.855);
        ((GeneralPath) shape).lineTo(437.172, 112.34);
        ((GeneralPath) shape).lineTo(436.874, 115.734);
        ((GeneralPath) shape).lineTo(435.128, 116.15);
        ((GeneralPath) shape).lineTo(433.15, 138.773);
        ((GeneralPath) shape).lineTo(431.87, 140.37);
        ((GeneralPath) shape).lineTo(430.74, 140.272);
        ((GeneralPath) shape).lineTo(430.689, 140.837);
        ((GeneralPath) shape).lineTo(432.338, 141.551);
        ((GeneralPath) shape).lineTo(432.238, 142.682);
        ((GeneralPath) shape).lineTo(430.491, 143.099);
        ((GeneralPath) shape).lineTo(430.441, 143.665);
        ((GeneralPath) shape).lineTo(431.574, 143.764);
        ((GeneralPath) shape).lineTo(432.557, 145.559);
        ((GeneralPath) shape).lineTo(429.934, 175.533);
        ((GeneralPath) shape).lineTo(428.09, 177.082);
        ((GeneralPath) shape).lineTo(407.729, 175.301);
        ((GeneralPath) shape).lineTo(401.635, 166.789);
        ((GeneralPath) shape).lineTo(406.54, 143.283);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_7;
        g.setTransform(defaultTransform__0_0_0_7);
        g.setClip(clip__0_0_0_7);
        float alpha__0_0_0_8 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_8 = g.getClip();
        AffineTransform defaultTransform__0_0_0_8 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_8 is CompositeGraphicsNode
        origAlpha = alpha__0_0_0_8;
        g.setTransform(defaultTransform__0_0_0_8);
        g.setClip(clip__0_0_0_8);
        float alpha__0_0_0_9 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_9 = g.getClip();
        AffineTransform defaultTransform__0_0_0_9 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_9 is CompositeGraphicsNode
        origAlpha = alpha__0_0_0_9;
        g.setTransform(defaultTransform__0_0_0_9);
        g.setClip(clip__0_0_0_9);
        float alpha__0_0_0_10 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10 is CompositeGraphicsNode
        float alpha__0_0_0_10_0 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_0 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_0 is CompositeGraphicsNode
        float alpha__0_0_0_10_0_0 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_0_0 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_0_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_0_0 is CompositeGraphicsNode
        float alpha__0_0_0_10_0_0_0 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_0_0_0 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_0_0_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_0_0_0 is ShapeNode
        paint = new Color(199, 200, 202, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(421.135, 192.455);
        ((GeneralPath) shape).lineTo(420.808, 196.197);
        ((GeneralPath) shape).curveTo(420.86603, 195.53, 421.14102, 194.93501,
                421.55103, 194.474);
        ((GeneralPath) shape).curveTo(421.23, 193.863, 421.072, 193.173,
                421.135, 192.455);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        origAlpha = alpha__0_0_0_10_0_0_0;
        g.setTransform(defaultTransform__0_0_0_10_0_0_0);
        g.setClip(clip__0_0_0_10_0_0_0);
        float alpha__0_0_0_10_0_0_1 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_0_0_1 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_0_0_1 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_0_0_1 is ShapeNode
        paint = new Color(199, 200, 202, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(419.538, 197.676);
        ((GeneralPath) shape).lineTo(420.787, 199.20099);
        ((GeneralPath) shape).curveTo(421.025, 198.915, 421.366, 198.721,
                421.75897, 198.68399);
        ((GeneralPath) shape).lineTo(421.79596, 198.68098);
        ((GeneralPath) shape).curveTo(421.11996, 198.08598, 420.72195,
                197.17798, 420.80795, 196.19598);
        ((GeneralPath) shape).lineTo(420.77097, 196.61098);
        ((GeneralPath) shape).curveTo(420.729, 197.086, 420.248, 197.469,
                419.538, 197.676);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        origAlpha = alpha__0_0_0_10_0_0_1;
        g.setTransform(defaultTransform__0_0_0_10_0_0_1);
        g.setClip(clip__0_0_0_10_0_0_1);
        origAlpha = alpha__0_0_0_10_0_0;
        g.setTransform(defaultTransform__0_0_0_10_0_0);
        g.setClip(clip__0_0_0_10_0_0);
        float alpha__0_0_0_10_0_1 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_0_1 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_0_1 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_0_1 is ShapeNode
        paint = new Color(199, 200, 202, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(543.706, 217.286);
        ((GeneralPath) shape).lineTo(548.281, 217.286);
        ((GeneralPath) shape).lineTo(550.552, 228.64);
        ((GeneralPath) shape).lineTo(550.076, 241.13);
        ((GeneralPath) shape).lineTo(551.86, 242.494);
        ((GeneralPath) shape).lineTo(564.319, 271.219);
        ((GeneralPath) shape).lineTo(564.35, 275.193);
        ((GeneralPath) shape).lineTo(560.67, 279.734);
        ((GeneralPath) shape).lineTo(563.782, 292.792);
        ((GeneralPath) shape).lineTo(559.241, 295.063);
        ((GeneralPath) shape).lineTo(561.513, 299.038);
        ((GeneralPath) shape).lineTo(572.299, 303.579);
        ((GeneralPath) shape).lineTo(573.435, 306.417);
        ((GeneralPath) shape).lineTo(575.705, 307.553);
        ((GeneralPath) shape).lineTo(575.703, 311.527);
        ((GeneralPath) shape).lineTo(574.569, 311.527);
        ((GeneralPath) shape).lineTo(527.448, 311.527);
        ((GeneralPath) shape).lineTo(527.448, 306.984);
        ((GeneralPath) shape).lineTo(529.152, 305.281);
        ((GeneralPath) shape).lineTo(529.721, 302.443);
        ((GeneralPath) shape).lineTo(533.126, 300.741);
        ((GeneralPath) shape).lineTo(533.126, 293.36);
        ((GeneralPath) shape).lineTo(530.915, 292.792);
        ((GeneralPath) shape).lineTo(529.152, 284.844);
        ((GeneralPath) shape).lineTo(522.339, 283.709);
        ((GeneralPath) shape).lineTo(517.798, 276.328);
        ((GeneralPath) shape).lineTo(518.366, 244.536);
        ((GeneralPath) shape).lineTo(519.091, 243.401);
        ((GeneralPath) shape).lineTo(517.23, 236.588);
        ((GeneralPath) shape).lineTo(517.798, 234.317);
        ((GeneralPath) shape).lineTo(517.23, 230.343);
        ((GeneralPath) shape).lineTo(514.959, 228.64);
        ((GeneralPath) shape).lineTo(512.12, 226.369);
        ((GeneralPath) shape).lineTo(511.553, 225.802);
        ((GeneralPath) shape).lineTo(512.12, 224.667);
        ((GeneralPath) shape).lineTo(513.823, 224.099);
        ((GeneralPath) shape).lineTo(513.256, 221.828);
        ((GeneralPath) shape).lineTo(512.258, 218.423);
        ((GeneralPath) shape).lineTo(501.901, 179.249);
        ((GeneralPath) shape).lineTo(533.693, 179.249);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        origAlpha = alpha__0_0_0_10_0_1;
        g.setTransform(defaultTransform__0_0_0_10_0_1);
        g.setClip(clip__0_0_0_10_0_1);
        float alpha__0_0_0_10_0_2 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_0_2 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_0_2 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_0_2 is ShapeNode
        paint = new Color(199, 200, 202, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(444.769, 217.286);
        ((GeneralPath) shape).lineTo(440.194, 217.286);
        ((GeneralPath) shape).lineTo(437.924, 228.64);
        ((GeneralPath) shape).lineTo(438.397, 241.13);
        ((GeneralPath) shape).lineTo(436.614, 242.494);
        ((GeneralPath) shape).lineTo(424.154, 271.219);
        ((GeneralPath) shape).lineTo(424.125, 275.193);
        ((GeneralPath) shape).lineTo(427.804, 279.734);
        ((GeneralPath) shape).lineTo(424.692, 292.792);
        ((GeneralPath) shape).lineTo(429.234, 295.063);
        ((GeneralPath) shape).lineTo(426.962, 299.038);
        ((GeneralPath) shape).lineTo(416.176, 303.579);
        ((GeneralPath) shape).lineTo(415.04, 306.417);
        ((GeneralPath) shape).lineTo(412.77, 307.553);
        ((GeneralPath) shape).lineTo(412.771, 311.527);
        ((GeneralPath) shape).lineTo(413.905, 311.527);
        ((GeneralPath) shape).lineTo(461.025, 311.527);
        ((GeneralPath) shape).lineTo(461.025, 306.984);
        ((GeneralPath) shape).lineTo(459.322, 305.281);
        ((GeneralPath) shape).lineTo(458.755, 302.443);
        ((GeneralPath) shape).lineTo(455.349, 300.741);
        ((GeneralPath) shape).lineTo(455.349, 293.36);
        ((GeneralPath) shape).lineTo(457.56, 292.792);
        ((GeneralPath) shape).lineTo(459.322, 284.844);
        ((GeneralPath) shape).lineTo(466.135, 283.709);
        ((GeneralPath) shape).lineTo(470.677, 276.328);
        ((GeneralPath) shape).lineTo(470.109, 244.536);
        ((GeneralPath) shape).lineTo(469.384, 243.401);
        ((GeneralPath) shape).lineTo(471.244, 236.588);
        ((GeneralPath) shape).lineTo(470.677, 234.317);
        ((GeneralPath) shape).lineTo(471.244, 230.343);
        ((GeneralPath) shape).lineTo(473.516, 228.64);
        ((GeneralPath) shape).lineTo(476.354, 226.369);
        ((GeneralPath) shape).lineTo(476.922, 225.802);
        ((GeneralPath) shape).lineTo(476.354, 224.667);
        ((GeneralPath) shape).lineTo(474.65, 224.099);
        ((GeneralPath) shape).lineTo(475.218, 221.828);
        ((GeneralPath) shape).lineTo(476.217, 218.423);
        ((GeneralPath) shape).lineTo(486.573, 179.249);
        ((GeneralPath) shape).lineTo(454.781, 179.249);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        origAlpha = alpha__0_0_0_10_0_2;
        g.setTransform(defaultTransform__0_0_0_10_0_2);
        g.setClip(clip__0_0_0_10_0_2);
        float alpha__0_0_0_10_0_3 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_0_3 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_0_3 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_0_3 is ShapeNode
        paint = new Color(199, 200, 202, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(476.354, 86.144);
        ((GeneralPath) shape).lineTo(470.109, 86.144);
        ((GeneralPath) shape).lineTo(443.99402, 87.846);
        ((GeneralPath) shape).lineTo(442.85803, 89.549);
        ((GeneralPath) shape).lineTo(444.56204, 126.451004);
        ((GeneralPath) shape).lineTo(446.26505, 128.155);
        ((GeneralPath) shape).curveTo(446.26505, 128.155, 454.21304, 129.29,
                458.18704, 129.858);
        ((GeneralPath) shape).curveTo(459.32205, 146.889, 464.99905, 158.243,
                464.99905, 158.243);
        ((GeneralPath) shape).lineTo(451.32306, 160.871);
        ((GeneralPath) shape).lineTo(450.80606, 161.65001);
        ((GeneralPath) shape).lineTo(449.67007, 178.11401);
        ((GeneralPath) shape).lineTo(450.80606, 179.24901);
        ((GeneralPath) shape).lineTo(479.19305, 179.24901);
        ((GeneralPath) shape).lineTo(479.19305, 159.37901);
        ((GeneralPath) shape).lineTo(476.35406, 129.85802);
        ((GeneralPath) shape).lineTo(476.35406, 86.144);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        origAlpha = alpha__0_0_0_10_0_3;
        g.setTransform(defaultTransform__0_0_0_10_0_3);
        g.setClip(clip__0_0_0_10_0_3);
        float alpha__0_0_0_10_0_4 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_0_4 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_0_4 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_0_4 is ShapeNode
        paint = new Color(199, 200, 202, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(512.12, 86.144);
        ((GeneralPath) shape).lineTo(518.36597, 86.144);
        ((GeneralPath) shape).lineTo(544.48, 87.846);
        ((GeneralPath) shape).lineTo(545.61597, 89.549);
        ((GeneralPath) shape).lineTo(543.91296, 126.451004);
        ((GeneralPath) shape).lineTo(542.20996, 128.155);
        ((GeneralPath) shape).curveTo(542.20996, 128.155, 534.261, 129.29,
                530.28796, 129.858);
        ((GeneralPath) shape).curveTo(529.152, 146.889, 523.475, 158.243,
                523.475, 158.243);
        ((GeneralPath) shape).lineTo(537.152, 160.871);
        ((GeneralPath) shape).lineTo(537.66797, 161.65001);
        ((GeneralPath) shape).lineTo(538.80396, 178.11401);
        ((GeneralPath) shape).lineTo(537.66797, 179.24901);
        ((GeneralPath) shape).lineTo(509.28296, 179.24901);
        ((GeneralPath) shape).lineTo(509.28296, 159.37901);
        ((GeneralPath) shape).lineTo(512.121, 129.85802);
        ((GeneralPath) shape).lineTo(512.121, 86.144);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        origAlpha = alpha__0_0_0_10_0_4;
        g.setTransform(defaultTransform__0_0_0_10_0_4);
        g.setClip(clip__0_0_0_10_0_4);
        float alpha__0_0_0_10_0_5 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_0_5 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_0_5 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_0_5 is CompositeGraphicsNode
        float alpha__0_0_0_10_0_5_0 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_0_5_0 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_0_5_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_0_5_0 is ShapeNode
        paint = new Color(199, 200, 202, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(567.622, 192.455);
        ((GeneralPath) shape).lineTo(567.95, 196.197);
        ((GeneralPath) shape).curveTo(567.891, 195.53, 567.617, 194.93501,
                567.206, 194.474);
        ((GeneralPath) shape).curveTo(567.527, 193.863, 567.686, 193.173,
                567.622, 192.455);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        origAlpha = alpha__0_0_0_10_0_5_0;
        g.setTransform(defaultTransform__0_0_0_10_0_5_0);
        g.setClip(clip__0_0_0_10_0_5_0);
        float alpha__0_0_0_10_0_5_1 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_0_5_1 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_0_5_1 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_0_5_1 is ShapeNode
        paint = new Color(199, 200, 202, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(569.221, 197.676);
        ((GeneralPath) shape).lineTo(567.97003, 199.20099);
        ((GeneralPath) shape).curveTo(567.734, 198.915, 567.39105, 198.721,
                567.00006, 198.68399);
        ((GeneralPath) shape).lineTo(566.96106, 198.68098);
        ((GeneralPath) shape).curveTo(567.63806, 198.08598, 568.0361,
                197.17798, 567.9501, 196.19598);
        ((GeneralPath) shape).lineTo(567.98706, 196.61098);
        ((GeneralPath) shape).curveTo(568.029, 197.086, 568.51, 197.469,
                569.221, 197.676);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        origAlpha = alpha__0_0_0_10_0_5_1;
        g.setTransform(defaultTransform__0_0_0_10_0_5_1);
        g.setClip(clip__0_0_0_10_0_5_1);
        float alpha__0_0_0_10_0_5_2 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_0_5_2 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_0_5_2 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_0_5_2 is ShapeNode
        paint = new Color(199, 200, 202, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(559.045, 187.423);
        ((GeneralPath) shape).curveTo(558.772, 187.998, 558.644, 188.638,
                558.701, 189.30101);
        ((GeneralPath) shape).lineTo(559.044, 193.20601);
        ((GeneralPath) shape).curveTo(559.191, 194.906, 560.514, 196.24501,
                562.228, 196.63301);
        ((GeneralPath) shape).curveTo(562.229, 196.65501, 562.229, 196.67601,
                562.23004, 196.697);
        ((GeneralPath) shape).curveTo(562.30005, 197.492, 562.67303, 198.184,
                563.22107, 198.668);
        ((GeneralPath) shape).curveTo(562.8721, 198.906, 562.6241, 199.293,
                562.58606, 199.755);
        ((GeneralPath) shape).curveTo(562.53705, 200.334, 562.8271, 200.85901,
                563.28204, 201.14);
        ((GeneralPath) shape).curveTo(563.0231, 201.414, 562.84607, 201.76399,
                562.809, 202.161);
        ((GeneralPath) shape).curveTo(562.72003, 203.11899, 563.448, 203.96199,
                564.437, 204.043);
        ((GeneralPath) shape).lineTo(568.015, 204.337);
        ((GeneralPath) shape).curveTo(568.297, 204.36, 568.567, 204.313,
                568.814, 204.22101);
        ((GeneralPath) shape).curveTo(568.91003, 204.365, 569.021, 204.503,
                569.16504, 204.619);
        ((GeneralPath) shape).curveTo(569.924, 205.235, 571.05707, 205.136,
                571.69604, 204.39801);
        ((GeneralPath) shape).lineTo(576.33105, 199.048);
        ((GeneralPath) shape).curveTo(576.65405, 198.67601, 576.78906, 198.214,
                576.7471, 197.768);
        ((GeneralPath) shape).lineTo(576.0461, 189.75);
        ((GeneralPath) shape).lineTo(578.89307, 189.501);
        ((GeneralPath) shape).lineTo(574.53204, 178.07901);
        ((GeneralPath) shape).lineTo(561.18506, 179.24701);
        ((GeneralPath) shape).lineTo(558.53204, 187.348);
        ((GeneralPath) shape).lineTo(559.045, 187.423);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        origAlpha = alpha__0_0_0_10_0_5_2;
        g.setTransform(defaultTransform__0_0_0_10_0_5_2);
        g.setClip(clip__0_0_0_10_0_5_2);
        origAlpha = alpha__0_0_0_10_0_5;
        g.setTransform(defaultTransform__0_0_0_10_0_5);
        g.setClip(clip__0_0_0_10_0_5);
        float alpha__0_0_0_10_0_6 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_0_6 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_0_6 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_0_6 is ShapeNode
        paint = new Color(199, 200, 202, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(577.211, 144.223);
        ((GeneralPath) shape).lineTo(576.08, 144.322);
        ((GeneralPath) shape).lineTo(576.031, 143.756);
        ((GeneralPath) shape).lineTo(577.679, 143.042);
        ((GeneralPath) shape).lineTo(577.578, 141.912);
        ((GeneralPath) shape).lineTo(575.832, 141.494);
        ((GeneralPath) shape).lineTo(575.783, 140.928);
        ((GeneralPath) shape).lineTo(576.914, 140.829);
        ((GeneralPath) shape).lineTo(577.896, 139.033);
        ((GeneralPath) shape).lineTo(575.769, 114.715);
        ((GeneralPath) shape).lineTo(576.901, 114.616);
        ((GeneralPath) shape).lineTo(585.355, 107.038);
        ((GeneralPath) shape).lineTo(584.812, 100.816);
        ((GeneralPath) shape).lineTo(576.744, 99.813);
        ((GeneralPath) shape).lineTo(583.454, 91.817);
        ((GeneralPath) shape).lineTo(581.164, 85.179);
        ((GeneralPath) shape).lineTo(571.551, 86.02);
        ((GeneralPath) shape).lineTo(574.371, 72.666);
        ((GeneralPath) shape).lineTo(569.549, 69.668);
        ((GeneralPath) shape).lineTo(559.199, 75.133);
        ((GeneralPath) shape).lineTo(558.726, 63.207);
        ((GeneralPath) shape).lineTo(552.258, 60.923);
        ((GeneralPath) shape).lineTo(542.869, 70.863);
        ((GeneralPath) shape).lineTo(539.086, 79.742);
        ((GeneralPath) shape).lineTo(539.999, 83.651);
        ((GeneralPath) shape).lineTo(547.23, 88.147);
        ((GeneralPath) shape).lineTo(547.824, 94.934);
        ((GeneralPath) shape).lineTo(545.4, 94.224);
        ((GeneralPath) shape).lineTo(544.379, 116.342);
        ((GeneralPath) shape).lineTo(548.425, 114.828);
        ((GeneralPath) shape).lineTo(548.723, 118.221);
        ((GeneralPath) shape).lineTo(550.468, 118.638);
        ((GeneralPath) shape).lineTo(552.447, 141.26);
        ((GeneralPath) shape).lineTo(553.726, 142.858);
        ((GeneralPath) shape).lineTo(554.857, 142.759);
        ((GeneralPath) shape).lineTo(554.907, 143.325);
        ((GeneralPath) shape).lineTo(553.26, 144.039);
        ((GeneralPath) shape).lineTo(553.359, 145.169);
        ((GeneralPath) shape).lineTo(555.105, 145.586);
        ((GeneralPath) shape).lineTo(555.155, 146.152);
        ((GeneralPath) shape).lineTo(554.023, 146.251);
        ((GeneralPath) shape).lineTo(553.04, 148.047);
        ((GeneralPath) shape).lineTo(555.663, 178.021);
        ((GeneralPath) shape).lineTo(557.508, 179.57);
        ((GeneralPath) shape).lineTo(577.868, 177.789);
        ((GeneralPath) shape).lineTo(583.962, 169.277);
        ((GeneralPath) shape).lineTo(579.056, 145.771);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        origAlpha = alpha__0_0_0_10_0_6;
        g.setTransform(defaultTransform__0_0_0_10_0_6);
        g.setClip(clip__0_0_0_10_0_6);
        float alpha__0_0_0_10_0_7 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_0_7 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_0_7 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_0_7 is ShapeNode
        paint = new Color(199, 200, 202, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(476.354, 86.144);
        ((GeneralPath) shape).lineTo(476.354, 129.858);
        ((GeneralPath) shape).lineTo(479.193, 159.379);
        ((GeneralPath) shape).lineTo(479.193, 178.681);
        ((GeneralPath) shape).lineTo(480.896, 194.01);
        ((GeneralPath) shape).lineTo(483.167, 196.281);
        ((GeneralPath) shape).lineTo(505.309, 196.281);
        ((GeneralPath) shape).lineTo(507.579, 194.01);
        ((GeneralPath) shape).lineTo(509.282, 178.681);
        ((GeneralPath) shape).lineTo(509.282, 159.379);
        ((GeneralPath) shape).lineTo(512.12, 129.858);
        ((GeneralPath) shape).lineTo(512.12, 86.144);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        origAlpha = alpha__0_0_0_10_0_7;
        g.setTransform(defaultTransform__0_0_0_10_0_7);
        g.setClip(clip__0_0_0_10_0_7);
        float alpha__0_0_0_10_0_8 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_0_8 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_0_8 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_0_8 is ShapeNode
        paint = new Color(199, 200, 202, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(494.238, 105.446);
        ((GeneralPath) shape).curveTo(485.08502, 105.446, 477.66602, 101.194,
                477.66602, 86.144);
        ((GeneralPath) shape).lineTo(472.94803, 86.144);
        ((GeneralPath) shape).lineTo(472.94803, 73.654);
        ((GeneralPath) shape).lineTo(474.67404, 71.951);
        ((GeneralPath) shape).lineTo(480.27304, 71.480995);
        ((GeneralPath) shape).curveTo(481.87405, 67.368, 484.12704, 64.006996,
                486.79605, 61.797997);
        ((GeneralPath) shape).lineTo(487.24704, 57.757996);
        ((GeneralPath) shape).lineTo(489.05905, 56.054996);
        ((GeneralPath) shape).lineTo(499.41605, 56.054996);
        ((GeneralPath) shape).lineTo(501.22903, 57.757996);
        ((GeneralPath) shape).lineTo(501.68002, 61.797997);
        ((GeneralPath) shape).curveTo(504.34702, 64.006996, 506.60202, 67.368,
                508.20303, 71.480995);
        ((GeneralPath) shape).lineTo(513.801, 71.951);
        ((GeneralPath) shape).lineTo(515.528, 73.654);
        ((GeneralPath) shape).lineTo(515.528, 86.144);
        ((GeneralPath) shape).lineTo(510.80902, 86.144);
        ((GeneralPath) shape).curveTo(510.809, 101.194, 503.389, 105.446,
                494.238, 105.446);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        origAlpha = alpha__0_0_0_10_0_8;
        g.setTransform(defaultTransform__0_0_0_10_0_8);
        g.setClip(clip__0_0_0_10_0_8);
        origAlpha = alpha__0_0_0_10_0;
        g.setTransform(defaultTransform__0_0_0_10_0);
        g.setClip(clip__0_0_0_10_0);
        float alpha__0_0_0_10_1 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_1 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_1 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_1 is ShapeNode
        paint = new Color(255, 255, 255, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(540.871, 214.805);
        ((GeneralPath) shape).lineTo(545.446, 214.805);
        ((GeneralPath) shape).lineTo(547.717, 226.159);
        ((GeneralPath) shape).lineTo(547.241, 238.649);
        ((GeneralPath) shape).lineTo(549.025, 240.013);
        ((GeneralPath) shape).lineTo(561.484, 268.738);
        ((GeneralPath) shape).lineTo(561.515, 272.712);
        ((GeneralPath) shape).lineTo(557.835, 277.253);
        ((GeneralPath) shape).lineTo(560.947, 290.311);
        ((GeneralPath) shape).lineTo(556.406, 292.582);
        ((GeneralPath) shape).lineTo(558.678, 296.557);
        ((GeneralPath) shape).lineTo(569.464, 301.098);
        ((GeneralPath) shape).lineTo(570.6, 303.936);
        ((GeneralPath) shape).lineTo(572.87, 305.072);
        ((GeneralPath) shape).lineTo(572.868, 309.046);
        ((GeneralPath) shape).lineTo(571.734, 309.046);
        ((GeneralPath) shape).lineTo(524.613, 309.046);
        ((GeneralPath) shape).lineTo(524.613, 304.503);
        ((GeneralPath) shape).lineTo(526.317, 302.8);
        ((GeneralPath) shape).lineTo(526.886, 299.962);
        ((GeneralPath) shape).lineTo(530.291, 298.26);
        ((GeneralPath) shape).lineTo(530.291, 290.879);
        ((GeneralPath) shape).lineTo(528.08, 290.311);
        ((GeneralPath) shape).lineTo(526.317, 282.363);
        ((GeneralPath) shape).lineTo(519.504, 281.228);
        ((GeneralPath) shape).lineTo(514.963, 273.847);
        ((GeneralPath) shape).lineTo(515.531, 242.055);
        ((GeneralPath) shape).lineTo(516.256, 240.92);
        ((GeneralPath) shape).lineTo(514.396, 234.107);
        ((GeneralPath) shape).lineTo(514.963, 231.836);
        ((GeneralPath) shape).lineTo(514.396, 227.862);
        ((GeneralPath) shape).lineTo(512.124, 226.159);
        ((GeneralPath) shape).lineTo(509.285, 223.888);
        ((GeneralPath) shape).lineTo(508.718, 223.321);
        ((GeneralPath) shape).lineTo(509.285, 222.186);
        ((GeneralPath) shape).lineTo(510.988, 221.618);
        ((GeneralPath) shape).lineTo(510.421, 219.347);
        ((GeneralPath) shape).lineTo(509.423, 215.942);
        ((GeneralPath) shape).lineTo(499.066, 176.768);
        ((GeneralPath) shape).lineTo(530.858, 176.768);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(540.871, 214.805);
        ((GeneralPath) shape).lineTo(545.446, 214.805);
        ((GeneralPath) shape).lineTo(547.717, 226.159);
        ((GeneralPath) shape).lineTo(547.241, 238.649);
        ((GeneralPath) shape).lineTo(549.025, 240.013);
        ((GeneralPath) shape).lineTo(561.484, 268.738);
        ((GeneralPath) shape).lineTo(561.515, 272.712);
        ((GeneralPath) shape).lineTo(557.835, 277.253);
        ((GeneralPath) shape).lineTo(560.947, 290.311);
        ((GeneralPath) shape).lineTo(556.406, 292.582);
        ((GeneralPath) shape).lineTo(558.678, 296.557);
        ((GeneralPath) shape).lineTo(569.464, 301.098);
        ((GeneralPath) shape).lineTo(570.6, 303.936);
        ((GeneralPath) shape).lineTo(572.87, 305.072);
        ((GeneralPath) shape).lineTo(572.868, 309.046);
        ((GeneralPath) shape).lineTo(571.734, 309.046);
        ((GeneralPath) shape).lineTo(524.613, 309.046);
        ((GeneralPath) shape).lineTo(524.613, 304.503);
        ((GeneralPath) shape).lineTo(526.317, 302.8);
        ((GeneralPath) shape).lineTo(526.886, 299.962);
        ((GeneralPath) shape).lineTo(530.291, 298.26);
        ((GeneralPath) shape).lineTo(530.291, 290.879);
        ((GeneralPath) shape).lineTo(528.08, 290.311);
        ((GeneralPath) shape).lineTo(526.317, 282.363);
        ((GeneralPath) shape).lineTo(519.504, 281.228);
        ((GeneralPath) shape).lineTo(514.963, 273.847);
        ((GeneralPath) shape).lineTo(515.531, 242.055);
        ((GeneralPath) shape).lineTo(516.256, 240.92);
        ((GeneralPath) shape).lineTo(514.396, 234.107);
        ((GeneralPath) shape).lineTo(514.963, 231.836);
        ((GeneralPath) shape).lineTo(514.396, 227.862);
        ((GeneralPath) shape).lineTo(512.124, 226.159);
        ((GeneralPath) shape).lineTo(509.285, 223.888);
        ((GeneralPath) shape).lineTo(508.718, 223.321);
        ((GeneralPath) shape).lineTo(509.285, 222.186);
        ((GeneralPath) shape).lineTo(510.988, 221.618);
        ((GeneralPath) shape).lineTo(510.421, 219.347);
        ((GeneralPath) shape).lineTo(509.423, 215.942);
        ((GeneralPath) shape).lineTo(499.066, 176.768);
        ((GeneralPath) shape).lineTo(530.858, 176.768);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_10_1;
        g.setTransform(defaultTransform__0_0_0_10_1);
        g.setClip(clip__0_0_0_10_1);
        float alpha__0_0_0_10_2 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_2 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_2 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_2 is ShapeNode
        paint = new Color(255, 255, 255, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(441.934, 214.805);
        ((GeneralPath) shape).lineTo(437.359, 214.805);
        ((GeneralPath) shape).lineTo(435.089, 226.159);
        ((GeneralPath) shape).lineTo(435.563, 238.649);
        ((GeneralPath) shape).lineTo(433.779, 240.013);
        ((GeneralPath) shape).lineTo(421.319, 268.738);
        ((GeneralPath) shape).lineTo(421.29, 272.712);
        ((GeneralPath) shape).lineTo(424.969, 277.253);
        ((GeneralPath) shape).lineTo(421.857, 290.311);
        ((GeneralPath) shape).lineTo(426.399, 292.582);
        ((GeneralPath) shape).lineTo(424.127, 296.557);
        ((GeneralPath) shape).lineTo(413.341, 301.098);
        ((GeneralPath) shape).lineTo(412.205, 303.936);
        ((GeneralPath) shape).lineTo(409.935, 305.072);
        ((GeneralPath) shape).lineTo(409.936, 309.046);
        ((GeneralPath) shape).lineTo(411.07, 309.046);
        ((GeneralPath) shape).lineTo(458.19, 309.046);
        ((GeneralPath) shape).lineTo(458.19, 304.503);
        ((GeneralPath) shape).lineTo(456.487, 302.8);
        ((GeneralPath) shape).lineTo(455.92, 299.962);
        ((GeneralPath) shape).lineTo(452.514, 298.26);
        ((GeneralPath) shape).lineTo(452.514, 290.879);
        ((GeneralPath) shape).lineTo(454.725, 290.311);
        ((GeneralPath) shape).lineTo(456.487, 282.363);
        ((GeneralPath) shape).lineTo(463.3, 281.228);
        ((GeneralPath) shape).lineTo(467.842, 273.847);
        ((GeneralPath) shape).lineTo(467.274, 242.055);
        ((GeneralPath) shape).lineTo(466.549, 240.92);
        ((GeneralPath) shape).lineTo(468.409, 234.107);
        ((GeneralPath) shape).lineTo(467.842, 231.836);
        ((GeneralPath) shape).lineTo(468.409, 227.862);
        ((GeneralPath) shape).lineTo(470.681, 226.159);
        ((GeneralPath) shape).lineTo(473.52, 223.888);
        ((GeneralPath) shape).lineTo(474.087, 223.321);
        ((GeneralPath) shape).lineTo(473.52, 222.186);
        ((GeneralPath) shape).lineTo(471.815, 221.618);
        ((GeneralPath) shape).lineTo(472.383, 219.347);
        ((GeneralPath) shape).lineTo(473.382, 215.942);
        ((GeneralPath) shape).lineTo(483.738, 176.768);
        ((GeneralPath) shape).lineTo(451.946, 176.768);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(441.934, 214.805);
        ((GeneralPath) shape).lineTo(437.359, 214.805);
        ((GeneralPath) shape).lineTo(435.089, 226.159);
        ((GeneralPath) shape).lineTo(435.563, 238.649);
        ((GeneralPath) shape).lineTo(433.779, 240.013);
        ((GeneralPath) shape).lineTo(421.319, 268.738);
        ((GeneralPath) shape).lineTo(421.29, 272.712);
        ((GeneralPath) shape).lineTo(424.969, 277.253);
        ((GeneralPath) shape).lineTo(421.857, 290.311);
        ((GeneralPath) shape).lineTo(426.399, 292.582);
        ((GeneralPath) shape).lineTo(424.127, 296.557);
        ((GeneralPath) shape).lineTo(413.341, 301.098);
        ((GeneralPath) shape).lineTo(412.205, 303.936);
        ((GeneralPath) shape).lineTo(409.935, 305.072);
        ((GeneralPath) shape).lineTo(409.936, 309.046);
        ((GeneralPath) shape).lineTo(411.07, 309.046);
        ((GeneralPath) shape).lineTo(458.19, 309.046);
        ((GeneralPath) shape).lineTo(458.19, 304.503);
        ((GeneralPath) shape).lineTo(456.487, 302.8);
        ((GeneralPath) shape).lineTo(455.92, 299.962);
        ((GeneralPath) shape).lineTo(452.514, 298.26);
        ((GeneralPath) shape).lineTo(452.514, 290.879);
        ((GeneralPath) shape).lineTo(454.725, 290.311);
        ((GeneralPath) shape).lineTo(456.487, 282.363);
        ((GeneralPath) shape).lineTo(463.3, 281.228);
        ((GeneralPath) shape).lineTo(467.842, 273.847);
        ((GeneralPath) shape).lineTo(467.274, 242.055);
        ((GeneralPath) shape).lineTo(466.549, 240.92);
        ((GeneralPath) shape).lineTo(468.409, 234.107);
        ((GeneralPath) shape).lineTo(467.842, 231.836);
        ((GeneralPath) shape).lineTo(468.409, 227.862);
        ((GeneralPath) shape).lineTo(470.681, 226.159);
        ((GeneralPath) shape).lineTo(473.52, 223.888);
        ((GeneralPath) shape).lineTo(474.087, 223.321);
        ((GeneralPath) shape).lineTo(473.52, 222.186);
        ((GeneralPath) shape).lineTo(471.815, 221.618);
        ((GeneralPath) shape).lineTo(472.383, 219.347);
        ((GeneralPath) shape).lineTo(473.382, 215.942);
        ((GeneralPath) shape).lineTo(483.738, 176.768);
        ((GeneralPath) shape).lineTo(451.946, 176.768);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_10_2;
        g.setTransform(defaultTransform__0_0_0_10_2);
        g.setClip(clip__0_0_0_10_2);
        float alpha__0_0_0_10_3 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_3 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_3 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_3 is ShapeNode
        paint = new Color(255, 255, 255, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(473.52, 83.663);
        ((GeneralPath) shape).lineTo(467.275, 83.663);
        ((GeneralPath) shape).lineTo(441.16, 85.365005);
        ((GeneralPath) shape).lineTo(440.02402, 87.06801);
        ((GeneralPath) shape).lineTo(441.72803, 123.97001);
        ((GeneralPath) shape).lineTo(443.43103, 125.67401);
        ((GeneralPath) shape).curveTo(443.43103, 125.67401, 451.37903,
                126.80901, 455.35303, 127.377014);
        ((GeneralPath) shape).curveTo(456.48804, 144.40802, 462.16504,
                155.76201, 462.16504, 155.76201);
        ((GeneralPath) shape).lineTo(448.48904, 158.39001);
        ((GeneralPath) shape).lineTo(447.97205, 159.16902);
        ((GeneralPath) shape).lineTo(446.83606, 175.63303);
        ((GeneralPath) shape).lineTo(447.97205, 176.76802);
        ((GeneralPath) shape).lineTo(476.35904, 176.76802);
        ((GeneralPath) shape).lineTo(476.35904, 156.89803);
        ((GeneralPath) shape).lineTo(473.52005, 127.37703);
        ((GeneralPath) shape).lineTo(473.52005, 83.663);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(473.52, 83.663);
        ((GeneralPath) shape).lineTo(467.275, 83.663);
        ((GeneralPath) shape).lineTo(441.16, 85.365005);
        ((GeneralPath) shape).lineTo(440.02402, 87.06801);
        ((GeneralPath) shape).lineTo(441.72803, 123.97001);
        ((GeneralPath) shape).lineTo(443.43103, 125.67401);
        ((GeneralPath) shape).curveTo(443.43103, 125.67401, 451.37903,
                126.80901, 455.35303, 127.377014);
        ((GeneralPath) shape).curveTo(456.48804, 144.40802, 462.16504,
                155.76201, 462.16504, 155.76201);
        ((GeneralPath) shape).lineTo(448.48904, 158.39001);
        ((GeneralPath) shape).lineTo(447.97205, 159.16902);
        ((GeneralPath) shape).lineTo(446.83606, 175.63303);
        ((GeneralPath) shape).lineTo(447.97205, 176.76802);
        ((GeneralPath) shape).lineTo(476.35904, 176.76802);
        ((GeneralPath) shape).lineTo(476.35904, 156.89803);
        ((GeneralPath) shape).lineTo(473.52005, 127.37703);
        ((GeneralPath) shape).lineTo(473.52005, 83.663);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_10_3;
        g.setTransform(defaultTransform__0_0_0_10_3);
        g.setClip(clip__0_0_0_10_3);
        float alpha__0_0_0_10_4 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_4 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_4 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_4 is ShapeNode
        paint = new Color(255, 255, 255, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(509.285, 83.663);
        ((GeneralPath) shape).lineTo(515.531, 83.663);
        ((GeneralPath) shape).lineTo(541.645, 85.365005);
        ((GeneralPath) shape).lineTo(542.781, 87.06801);
        ((GeneralPath) shape).lineTo(541.078, 123.97001);
        ((GeneralPath) shape).lineTo(539.375, 125.67401);
        ((GeneralPath) shape).curveTo(539.375, 125.67401, 531.426, 126.80901,
                527.453, 127.377014);
        ((GeneralPath) shape).curveTo(526.317, 144.40802, 520.64, 155.76201,
                520.64, 155.76201);
        ((GeneralPath) shape).lineTo(534.317, 158.39001);
        ((GeneralPath) shape).lineTo(534.833, 159.16902);
        ((GeneralPath) shape).lineTo(535.969, 175.63303);
        ((GeneralPath) shape).lineTo(534.833, 176.76802);
        ((GeneralPath) shape).lineTo(506.448, 176.76802);
        ((GeneralPath) shape).lineTo(506.448, 156.89803);
        ((GeneralPath) shape).lineTo(509.286, 127.37703);
        ((GeneralPath) shape).lineTo(509.286, 83.663);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(509.285, 83.663);
        ((GeneralPath) shape).lineTo(515.531, 83.663);
        ((GeneralPath) shape).lineTo(541.645, 85.365005);
        ((GeneralPath) shape).lineTo(542.781, 87.06801);
        ((GeneralPath) shape).lineTo(541.078, 123.97001);
        ((GeneralPath) shape).lineTo(539.375, 125.67401);
        ((GeneralPath) shape).curveTo(539.375, 125.67401, 531.426, 126.80901,
                527.453, 127.377014);
        ((GeneralPath) shape).curveTo(526.317, 144.40802, 520.64, 155.76201,
                520.64, 155.76201);
        ((GeneralPath) shape).lineTo(534.317, 158.39001);
        ((GeneralPath) shape).lineTo(534.833, 159.16902);
        ((GeneralPath) shape).lineTo(535.969, 175.63303);
        ((GeneralPath) shape).lineTo(534.833, 176.76802);
        ((GeneralPath) shape).lineTo(506.448, 176.76802);
        ((GeneralPath) shape).lineTo(506.448, 156.89803);
        ((GeneralPath) shape).lineTo(509.286, 127.37703);
        ((GeneralPath) shape).lineTo(509.286, 83.663);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_10_4;
        g.setTransform(defaultTransform__0_0_0_10_4);
        g.setClip(clip__0_0_0_10_4);
        float alpha__0_0_0_10_5 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_5 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_5 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_5 is CompositeGraphicsNode
        float alpha__0_0_0_10_5_0 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_5_0 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_5_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_5_0 is CompositeGraphicsNode
        float alpha__0_0_0_10_5_0_0 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_5_0_0 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_5_0_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_5_0_0 is CompositeGraphicsNode
        float alpha__0_0_0_10_5_0_0_0 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_5_0_0_0 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_5_0_0_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_5_0_0_0 is ShapeNode
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(564.787, 189.974);
        ((GeneralPath) shape).lineTo(565.115, 193.716);
        ((GeneralPath) shape).curveTo(565.05597, 193.049, 564.782, 192.45401,
                564.371, 191.993);
        ((GeneralPath) shape).curveTo(564.692, 191.382, 564.851, 190.692,
                564.787, 189.974);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_10_5_0_0_0;
        g.setTransform(defaultTransform__0_0_0_10_5_0_0_0);
        g.setClip(clip__0_0_0_10_5_0_0_0);
        float alpha__0_0_0_10_5_0_0_1 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_5_0_0_1 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_5_0_0_1 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_5_0_0_1 is ShapeNode
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(566.386, 195.195);
        ((GeneralPath) shape).lineTo(565.135, 196.72);
        ((GeneralPath) shape).curveTo(564.899, 196.434, 564.556, 196.24,
                564.16504, 196.203);
        ((GeneralPath) shape).lineTo(564.12604, 196.2);
        ((GeneralPath) shape).curveTo(564.80304, 195.605, 565.20105, 194.69699,
                565.11505, 193.715);
        ((GeneralPath) shape).lineTo(565.15204, 194.12999);
        ((GeneralPath) shape).curveTo(565.194, 194.605, 565.675, 194.988,
                566.386, 195.195);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_10_5_0_0_1;
        g.setTransform(defaultTransform__0_0_0_10_5_0_0_1);
        g.setClip(clip__0_0_0_10_5_0_0_1);
        float alpha__0_0_0_10_5_0_0_2 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_5_0_0_2 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_5_0_0_2 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_5_0_0_2 is ShapeNode
        paint = new Color(255, 255, 255, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(556.21, 184.942);
        ((GeneralPath) shape).curveTo(555.937, 185.517, 555.809, 186.157,
                555.866, 186.82);
        ((GeneralPath) shape).lineTo(556.20905, 190.725);
        ((GeneralPath) shape).curveTo(556.356, 192.425, 557.679, 193.764,
                559.39307, 194.15201);
        ((GeneralPath) shape).curveTo(559.39404, 194.17401, 559.39404, 194.195,
                559.3951, 194.216);
        ((GeneralPath) shape).curveTo(559.4651, 195.011, 559.8381, 195.703,
                560.3861, 196.187);
        ((GeneralPath) shape).curveTo(560.0371, 196.425, 559.7891, 196.812,
                559.7511, 197.274);
        ((GeneralPath) shape).curveTo(559.7021, 197.853, 559.9921, 198.378,
                560.4471, 198.659);
        ((GeneralPath) shape).curveTo(560.1881, 198.933, 560.0111, 199.28299,
                559.97406, 199.68);
        ((GeneralPath) shape).curveTo(559.8851, 200.63799, 560.61304,
                201.48099, 561.60205, 201.562);
        ((GeneralPath) shape).lineTo(565.18005, 201.856);
        ((GeneralPath) shape).curveTo(565.46204, 201.879, 565.73206, 201.832,
                565.97906, 201.74);
        ((GeneralPath) shape).curveTo(566.0751, 201.884, 566.18604, 202.022,
                566.3301, 202.138);
        ((GeneralPath) shape).curveTo(567.08905, 202.754, 568.2221, 202.655,
                568.8611, 201.917);
        ((GeneralPath) shape).lineTo(573.4961, 196.567);
        ((GeneralPath) shape).curveTo(573.8191, 196.195, 573.9541, 195.733,
                573.9121, 195.287);
        ((GeneralPath) shape).lineTo(573.2111, 187.269);
        ((GeneralPath) shape).lineTo(576.0581, 187.02);
        ((GeneralPath) shape).lineTo(571.6971, 175.598);
        ((GeneralPath) shape).lineTo(558.3501, 176.766);
        ((GeneralPath) shape).lineTo(555.6971, 184.867);
        ((GeneralPath) shape).lineTo(556.21, 184.942);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(556.21, 184.942);
        ((GeneralPath) shape).curveTo(555.937, 185.517, 555.809, 186.157,
                555.866, 186.82);
        ((GeneralPath) shape).lineTo(556.20905, 190.725);
        ((GeneralPath) shape).curveTo(556.356, 192.425, 557.679, 193.764,
                559.39307, 194.15201);
        ((GeneralPath) shape).curveTo(559.39404, 194.17401, 559.39404, 194.195,
                559.3951, 194.216);
        ((GeneralPath) shape).curveTo(559.4651, 195.011, 559.8381, 195.703,
                560.3861, 196.187);
        ((GeneralPath) shape).curveTo(560.0371, 196.425, 559.7891, 196.812,
                559.7511, 197.274);
        ((GeneralPath) shape).curveTo(559.7021, 197.853, 559.9921, 198.378,
                560.4471, 198.659);
        ((GeneralPath) shape).curveTo(560.1881, 198.933, 560.0111, 199.28299,
                559.97406, 199.68);
        ((GeneralPath) shape).curveTo(559.8851, 200.63799, 560.61304,
                201.48099, 561.60205, 201.562);
        ((GeneralPath) shape).lineTo(565.18005, 201.856);
        ((GeneralPath) shape).curveTo(565.46204, 201.879, 565.73206, 201.832,
                565.97906, 201.74);
        ((GeneralPath) shape).curveTo(566.0751, 201.884, 566.18604, 202.022,
                566.3301, 202.138);
        ((GeneralPath) shape).curveTo(567.08905, 202.754, 568.2221, 202.655,
                568.8611, 201.917);
        ((GeneralPath) shape).lineTo(573.4961, 196.567);
        ((GeneralPath) shape).curveTo(573.8191, 196.195, 573.9541, 195.733,
                573.9121, 195.287);
        ((GeneralPath) shape).lineTo(573.2111, 187.269);
        ((GeneralPath) shape).lineTo(576.0581, 187.02);
        ((GeneralPath) shape).lineTo(571.6971, 175.598);
        ((GeneralPath) shape).lineTo(558.3501, 176.766);
        ((GeneralPath) shape).lineTo(555.6971, 184.867);
        ((GeneralPath) shape).lineTo(556.21, 184.942);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_10_5_0_0_2;
        g.setTransform(defaultTransform__0_0_0_10_5_0_0_2);
        g.setClip(clip__0_0_0_10_5_0_0_2);
        origAlpha = alpha__0_0_0_10_5_0_0;
        g.setTransform(defaultTransform__0_0_0_10_5_0_0);
        g.setClip(clip__0_0_0_10_5_0_0);
        float alpha__0_0_0_10_5_0_1 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_5_0_1 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_5_0_1 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_5_0_1 is CompositeGraphicsNode
        float alpha__0_0_0_10_5_0_1_0 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_5_0_1_0 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_5_0_1_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_5_0_1_0 is CompositeGraphicsNode
        float alpha__0_0_0_10_5_0_1_0_0 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_5_0_1_0_0 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_5_0_1_0_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_5_0_1_0_0 is ShapeNode
        paint = new Color(255, 255, 255, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(561.925, 198.092);
        ((GeneralPath) shape).curveTo(560.938, 198.011, 560.06396, 198.721,
                559.975, 199.68);
        ((GeneralPath) shape).lineTo(559.975, 199.68);
        ((GeneralPath) shape).curveTo(559.886, 200.63799, 560.61395, 201.48099,
                561.60297, 201.562);
        ((GeneralPath) shape).lineTo(565.18097, 201.856);
        ((GeneralPath) shape).curveTo(566.17, 201.938, 567.04297, 201.226,
                567.13196, 200.268);
        ((GeneralPath) shape).lineTo(567.13196, 200.268);
        ((GeneralPath) shape).curveTo(567.22095, 199.31001, 566.49097,
                198.46701, 565.50494, 198.38501);
        ((GeneralPath) shape).lineTo(561.925, 198.092);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(561.925, 198.092);
        ((GeneralPath) shape).curveTo(560.938, 198.011, 560.06396, 198.721,
                559.975, 199.68);
        ((GeneralPath) shape).lineTo(559.975, 199.68);
        ((GeneralPath) shape).curveTo(559.886, 200.63799, 560.61395, 201.48099,
                561.60297, 201.562);
        ((GeneralPath) shape).lineTo(565.18097, 201.856);
        ((GeneralPath) shape).curveTo(566.17, 201.938, 567.04297, 201.226,
                567.13196, 200.268);
        ((GeneralPath) shape).lineTo(567.13196, 200.268);
        ((GeneralPath) shape).curveTo(567.22095, 199.31001, 566.49097,
                198.46701, 565.50494, 198.38501);
        ((GeneralPath) shape).lineTo(561.925, 198.092);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_10_5_0_1_0_0;
        g.setTransform(defaultTransform__0_0_0_10_5_0_1_0_0);
        g.setClip(clip__0_0_0_10_5_0_1_0_0);
        float alpha__0_0_0_10_5_0_1_0_1 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_5_0_1_0_1 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_5_0_1_0_1 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_5_0_1_0_1 is ShapeNode
        paint = new Color(255, 255, 255, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(566.114, 199.687);
        ((GeneralPath) shape).curveTo(565.47504, 200.425, 565.571, 201.522,
                566.33, 202.13899);
        ((GeneralPath) shape).lineTo(566.33, 202.13899);
        ((GeneralPath) shape).curveTo(567.089, 202.75499, 568.22205, 202.65599,
                568.861, 201.918);
        ((GeneralPath) shape).lineTo(573.49603, 196.568);
        ((GeneralPath) shape).curveTo(574.137, 195.829, 574.041, 194.73099,
                573.28204, 194.11499);
        ((GeneralPath) shape).lineTo(573.28204, 194.11499);
        ((GeneralPath) shape).curveTo(572.5231, 193.49799, 571.38904,
                193.59698, 570.749, 194.33598);
        ((GeneralPath) shape).lineTo(566.114, 199.687);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(566.114, 199.687);
        ((GeneralPath) shape).curveTo(565.47504, 200.425, 565.571, 201.522,
                566.33, 202.13899);
        ((GeneralPath) shape).lineTo(566.33, 202.13899);
        ((GeneralPath) shape).curveTo(567.089, 202.75499, 568.22205, 202.65599,
                568.861, 201.918);
        ((GeneralPath) shape).lineTo(573.49603, 196.568);
        ((GeneralPath) shape).curveTo(574.137, 195.829, 574.041, 194.73099,
                573.28204, 194.11499);
        ((GeneralPath) shape).lineTo(573.28204, 194.11499);
        ((GeneralPath) shape).curveTo(572.5231, 193.49799, 571.38904,
                193.59698, 570.749, 194.33598);
        ((GeneralPath) shape).lineTo(566.114, 199.687);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_10_5_0_1_0_1;
        g.setTransform(defaultTransform__0_0_0_10_5_0_1_0_1);
        g.setClip(clip__0_0_0_10_5_0_1_0_1);
        float alpha__0_0_0_10_5_0_1_0_2 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_5_0_1_0_2 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_5_0_1_0_2 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_5_0_1_0_2 is ShapeNode
        paint = new Color(255, 255, 255, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(566.751, 195.922);
        ((GeneralPath) shape).curveTo(566.836, 196.87999, 568.50696, 197.51599,
                570.48395, 197.343);
        ((GeneralPath) shape).lineTo(570.48395, 197.343);
        ((GeneralPath) shape).curveTo(572.462, 197.171, 573.99695, 196.254,
                573.9119, 195.296);
        ((GeneralPath) shape).lineTo(573.00195, 184.88701);
        ((GeneralPath) shape).curveTo(572.91797, 183.92902, 571.2479,
                183.29301, 569.26996, 183.466);
        ((GeneralPath) shape).lineTo(569.26996, 183.466);
        ((GeneralPath) shape).curveTo(567.29193, 183.639, 565.75793, 184.556,
                565.842, 185.515);
        ((GeneralPath) shape).lineTo(566.751, 195.922);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(566.751, 195.922);
        ((GeneralPath) shape).curveTo(566.836, 196.87999, 568.50696, 197.51599,
                570.48395, 197.343);
        ((GeneralPath) shape).lineTo(570.48395, 197.343);
        ((GeneralPath) shape).curveTo(572.462, 197.171, 573.99695, 196.254,
                573.9119, 195.296);
        ((GeneralPath) shape).lineTo(573.00195, 184.88701);
        ((GeneralPath) shape).curveTo(572.91797, 183.92902, 571.2479,
                183.29301, 569.26996, 183.466);
        ((GeneralPath) shape).lineTo(569.26996, 183.466);
        ((GeneralPath) shape).curveTo(567.29193, 183.639, 565.75793, 184.556,
                565.842, 185.515);
        ((GeneralPath) shape).lineTo(566.751, 195.922);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_10_5_0_1_0_2;
        g.setTransform(defaultTransform__0_0_0_10_5_0_1_0_2);
        g.setClip(clip__0_0_0_10_5_0_1_0_2);
        origAlpha = alpha__0_0_0_10_5_0_1_0;
        g.setTransform(defaultTransform__0_0_0_10_5_0_1_0);
        g.setClip(clip__0_0_0_10_5_0_1_0);
        float alpha__0_0_0_10_5_0_1_1 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_5_0_1_1 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_5_0_1_1 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_5_0_1_1 is CompositeGraphicsNode
        float alpha__0_0_0_10_5_0_1_1_0 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_5_0_1_1_0 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_5_0_1_1_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_5_0_1_1_0 is ShapeNode
        paint = new Color(255, 255, 255, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(561.304, 195.942);
        ((GeneralPath) shape).curveTo(560.513, 195.87, 559.818, 196.466,
                559.75104, 197.275);
        ((GeneralPath) shape).lineTo(559.75104, 197.275);
        ((GeneralPath) shape).curveTo(559.68304, 198.083, 560.26807, 198.797,
                561.059, 198.87);
        ((GeneralPath) shape).lineTo(563.921, 199.13199);
        ((GeneralPath) shape).curveTo(564.70905, 199.204, 565.405, 198.60799,
                565.473, 197.79999);
        ((GeneralPath) shape).lineTo(565.473, 197.79999);
        ((GeneralPath) shape).curveTo(565.54004, 196.99098, 564.95404, 196.277,
                564.16504, 196.204);
        ((GeneralPath) shape).lineTo(561.304, 195.942);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(561.304, 195.942);
        ((GeneralPath) shape).curveTo(560.513, 195.87, 559.818, 196.466,
                559.75104, 197.275);
        ((GeneralPath) shape).lineTo(559.75104, 197.275);
        ((GeneralPath) shape).curveTo(559.68304, 198.083, 560.26807, 198.797,
                561.059, 198.87);
        ((GeneralPath) shape).lineTo(563.921, 199.13199);
        ((GeneralPath) shape).curveTo(564.70905, 199.204, 565.405, 198.60799,
                565.473, 197.79999);
        ((GeneralPath) shape).lineTo(565.473, 197.79999);
        ((GeneralPath) shape).curveTo(565.54004, 196.99098, 564.95404, 196.277,
                564.16504, 196.204);
        ((GeneralPath) shape).lineTo(561.304, 195.942);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_10_5_0_1_1_0;
        g.setTransform(defaultTransform__0_0_0_10_5_0_1_1_0);
        g.setClip(clip__0_0_0_10_5_0_1_1_0);
        float alpha__0_0_0_10_5_0_1_1_1 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_5_0_1_1_1 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_5_0_1_1_1 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_5_0_1_1_1 is ShapeNode
        paint = new Color(255, 255, 255, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(564.658, 197.304);
        ((GeneralPath) shape).curveTo(564.14905, 197.925, 564.23004, 198.852,
                564.83905, 199.375);
        ((GeneralPath) shape).lineTo(564.83905, 199.375);
        ((GeneralPath) shape).curveTo(565.447, 199.897, 566.353, 199.817,
                566.861, 199.198);
        ((GeneralPath) shape).lineTo(570.544, 194.703);
        ((GeneralPath) shape).curveTo(571.052, 194.082, 570.972, 193.155,
                570.362, 192.631);
        ((GeneralPath) shape).lineTo(570.362, 192.631);
        ((GeneralPath) shape).curveTo(569.755, 192.109, 568.849, 192.188,
                568.34, 192.808);
        ((GeneralPath) shape).lineTo(564.658, 197.304);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(564.658, 197.304);
        ((GeneralPath) shape).curveTo(564.14905, 197.925, 564.23004, 198.852,
                564.83905, 199.375);
        ((GeneralPath) shape).lineTo(564.83905, 199.375);
        ((GeneralPath) shape).curveTo(565.447, 199.897, 566.353, 199.817,
                566.861, 199.198);
        ((GeneralPath) shape).lineTo(570.544, 194.703);
        ((GeneralPath) shape).curveTo(571.052, 194.082, 570.972, 193.155,
                570.362, 192.631);
        ((GeneralPath) shape).lineTo(570.362, 192.631);
        ((GeneralPath) shape).curveTo(569.755, 192.109, 568.849, 192.188,
                568.34, 192.808);
        ((GeneralPath) shape).lineTo(564.658, 197.304);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_10_5_0_1_1_1;
        g.setTransform(defaultTransform__0_0_0_10_5_0_1_1_1);
        g.setClip(clip__0_0_0_10_5_0_1_1_1);
        float alpha__0_0_0_10_5_0_1_1_2 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_5_0_1_1_2 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_5_0_1_1_2 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_5_0_1_1_2 is ShapeNode
        paint = new Color(255, 255, 255, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(565.152, 194.13);
        ((GeneralPath) shape).curveTo(565.222, 194.938, 566.561, 195.48201,
                568.139, 195.343);
        ((GeneralPath) shape).lineTo(568.139, 195.343);
        ((GeneralPath) shape).curveTo(569.719, 195.205, 570.94196, 194.438,
                570.87195, 193.63);
        ((GeneralPath) shape).lineTo(570.1019, 184.84401);
        ((GeneralPath) shape).curveTo(570.03094, 184.035, 568.69293, 183.49101,
                567.11395, 183.62901);
        ((GeneralPath) shape).lineTo(567.11395, 183.62901);
        ((GeneralPath) shape).curveTo(565.535, 183.76701, 564.311, 184.53601,
                564.38196, 185.34401);
        ((GeneralPath) shape).lineTo(565.152, 194.13);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(565.152, 194.13);
        ((GeneralPath) shape).curveTo(565.222, 194.938, 566.561, 195.48201,
                568.139, 195.343);
        ((GeneralPath) shape).lineTo(568.139, 195.343);
        ((GeneralPath) shape).curveTo(569.719, 195.205, 570.94196, 194.438,
                570.87195, 193.63);
        ((GeneralPath) shape).lineTo(570.1019, 184.84401);
        ((GeneralPath) shape).curveTo(570.03094, 184.035, 568.69293, 183.49101,
                567.11395, 183.62901);
        ((GeneralPath) shape).lineTo(567.11395, 183.62901);
        ((GeneralPath) shape).curveTo(565.535, 183.76701, 564.311, 184.53601,
                564.38196, 185.34401);
        ((GeneralPath) shape).lineTo(565.152, 194.13);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_10_5_0_1_1_2;
        g.setTransform(defaultTransform__0_0_0_10_5_0_1_1_2);
        g.setClip(clip__0_0_0_10_5_0_1_1_2);
        origAlpha = alpha__0_0_0_10_5_0_1_1;
        g.setTransform(defaultTransform__0_0_0_10_5_0_1_1);
        g.setClip(clip__0_0_0_10_5_0_1_1);
        float alpha__0_0_0_10_5_0_1_2 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_5_0_1_2 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_5_0_1_2 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_5_0_1_2 is CompositeGraphicsNode
        float alpha__0_0_0_10_5_0_1_2_0 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_5_0_1_2_0 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_5_0_1_2_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_5_0_1_2_0 is ShapeNode
        paint = new Color(255, 255, 255, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(559.395, 194.217);
        ((GeneralPath) shape).curveTo(559.538, 195.83499, 560.93304, 197.03299,
                562.513, 196.896);
        ((GeneralPath) shape).lineTo(562.513, 196.896);
        ((GeneralPath) shape).curveTo(564.092, 196.75699, 565.258, 195.333,
                565.116, 193.716);
        ((GeneralPath) shape).lineTo(565.116, 193.716);
        ((GeneralPath) shape).curveTo(564.974, 192.099, 563.58, 190.90001,
                562.0, 191.03801);
        ((GeneralPath) shape).lineTo(562.0, 191.03801);
        ((GeneralPath) shape).curveTo(560.419, 191.175, 559.253, 192.6,
                559.395, 194.217);
        ((GeneralPath) shape).lineTo(559.395, 194.217);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(559.395, 194.217);
        ((GeneralPath) shape).curveTo(559.538, 195.83499, 560.93304, 197.03299,
                562.513, 196.896);
        ((GeneralPath) shape).lineTo(562.513, 196.896);
        ((GeneralPath) shape).curveTo(564.092, 196.75699, 565.258, 195.333,
                565.116, 193.716);
        ((GeneralPath) shape).lineTo(565.116, 193.716);
        ((GeneralPath) shape).curveTo(564.974, 192.099, 563.58, 190.90001,
                562.0, 191.03801);
        ((GeneralPath) shape).lineTo(562.0, 191.03801);
        ((GeneralPath) shape).curveTo(560.419, 191.175, 559.253, 192.6,
                559.395, 194.217);
        ((GeneralPath) shape).lineTo(559.395, 194.217);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_10_5_0_1_2_0;
        g.setTransform(defaultTransform__0_0_0_10_5_0_1_2_0);
        g.setClip(clip__0_0_0_10_5_0_1_2_0);
        float alpha__0_0_0_10_5_0_1_2_1 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_5_0_1_2_1 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_5_0_1_2_1 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_5_0_1_2_1 is ShapeNode
        paint = new Color(255, 255, 255, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(556.209, 190.725);
        ((GeneralPath) shape).curveTo(556.397, 192.88101, 558.47, 194.462,
                560.841, 194.25401);
        ((GeneralPath) shape).lineTo(560.841, 194.25401);
        ((GeneralPath) shape).curveTo(563.209, 194.04701, 564.978, 192.13002,
                564.787, 189.97401);
        ((GeneralPath) shape).lineTo(564.446, 186.07);
        ((GeneralPath) shape).curveTo(564.258, 183.914, 562.18396, 182.33401,
                559.81396, 182.541);
        ((GeneralPath) shape).lineTo(559.81396, 182.541);
        ((GeneralPath) shape).curveTo(557.44495, 182.748, 555.67694, 184.664,
                555.86597, 186.821);
        ((GeneralPath) shape).lineTo(556.209, 190.725);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(556.209, 190.725);
        ((GeneralPath) shape).curveTo(556.397, 192.88101, 558.47, 194.462,
                560.841, 194.25401);
        ((GeneralPath) shape).lineTo(560.841, 194.25401);
        ((GeneralPath) shape).curveTo(563.209, 194.04701, 564.978, 192.13002,
                564.787, 189.97401);
        ((GeneralPath) shape).lineTo(564.446, 186.07);
        ((GeneralPath) shape).curveTo(564.258, 183.914, 562.18396, 182.33401,
                559.81396, 182.541);
        ((GeneralPath) shape).lineTo(559.81396, 182.541);
        ((GeneralPath) shape).curveTo(557.44495, 182.748, 555.67694, 184.664,
                555.86597, 186.821);
        ((GeneralPath) shape).lineTo(556.209, 190.725);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_10_5_0_1_2_1;
        g.setTransform(defaultTransform__0_0_0_10_5_0_1_2_1);
        g.setClip(clip__0_0_0_10_5_0_1_2_1);
        origAlpha = alpha__0_0_0_10_5_0_1_2;
        g.setTransform(defaultTransform__0_0_0_10_5_0_1_2);
        g.setClip(clip__0_0_0_10_5_0_1_2);
        float alpha__0_0_0_10_5_0_1_3 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_5_0_1_3 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_5_0_1_3 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_5_0_1_3 is ShapeNode
        paint = new Color(255, 255, 255, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(576.058, 187.021);
        ((GeneralPath) shape).lineTo(572.722, 187.314);
        ((GeneralPath) shape).lineTo(555.696, 184.868);
        ((GeneralPath) shape).lineTo(558.35, 176.767);
        ((GeneralPath) shape).lineTo(571.696, 175.599);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(576.058, 187.021);
        ((GeneralPath) shape).lineTo(572.722, 187.314);
        ((GeneralPath) shape).lineTo(555.696, 184.868);
        ((GeneralPath) shape).lineTo(558.35, 176.767);
        ((GeneralPath) shape).lineTo(571.696, 175.599);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_10_5_0_1_3;
        g.setTransform(defaultTransform__0_0_0_10_5_0_1_3);
        g.setClip(clip__0_0_0_10_5_0_1_3);
        origAlpha = alpha__0_0_0_10_5_0_1;
        g.setTransform(defaultTransform__0_0_0_10_5_0_1);
        g.setClip(clip__0_0_0_10_5_0_1);
        origAlpha = alpha__0_0_0_10_5_0;
        g.setTransform(defaultTransform__0_0_0_10_5_0);
        g.setClip(clip__0_0_0_10_5_0);
        float alpha__0_0_0_10_5_1 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_5_1 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_5_1 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_5_1 is ShapeNode
        paint = new Color(255, 255, 255, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(574.376, 141.742);
        ((GeneralPath) shape).lineTo(573.245, 141.841);
        ((GeneralPath) shape).lineTo(573.196, 141.275);
        ((GeneralPath) shape).lineTo(574.844, 140.561);
        ((GeneralPath) shape).lineTo(574.743, 139.431);
        ((GeneralPath) shape).lineTo(572.997, 139.013);
        ((GeneralPath) shape).lineTo(572.948, 138.447);
        ((GeneralPath) shape).lineTo(574.079, 138.348);
        ((GeneralPath) shape).lineTo(575.062, 136.552);
        ((GeneralPath) shape).lineTo(572.934, 112.234);
        ((GeneralPath) shape).lineTo(574.066, 112.135);
        ((GeneralPath) shape).lineTo(582.521, 104.557);
        ((GeneralPath) shape).lineTo(581.977, 98.335);
        ((GeneralPath) shape).lineTo(573.909, 97.332);
        ((GeneralPath) shape).lineTo(580.619, 89.336);
        ((GeneralPath) shape).lineTo(578.329, 82.698);
        ((GeneralPath) shape).lineTo(568.716, 83.539);
        ((GeneralPath) shape).lineTo(571.536, 70.185);
        ((GeneralPath) shape).lineTo(566.714, 67.188);
        ((GeneralPath) shape).lineTo(556.364, 72.652);
        ((GeneralPath) shape).lineTo(555.891, 60.726);
        ((GeneralPath) shape).lineTo(549.423, 58.442);
        ((GeneralPath) shape).lineTo(540.034, 68.382);
        ((GeneralPath) shape).lineTo(536.251, 77.261);
        ((GeneralPath) shape).lineTo(537.164, 81.17);
        ((GeneralPath) shape).lineTo(544.396, 85.667);
        ((GeneralPath) shape).lineTo(544.989, 92.453);
        ((GeneralPath) shape).lineTo(542.565, 91.743);
        ((GeneralPath) shape).lineTo(541.544, 113.861);
        ((GeneralPath) shape).lineTo(545.59, 112.347);
        ((GeneralPath) shape).lineTo(545.888, 115.74);
        ((GeneralPath) shape).lineTo(547.633, 116.157);
        ((GeneralPath) shape).lineTo(549.612, 138.779);
        ((GeneralPath) shape).lineTo(550.891, 140.377);
        ((GeneralPath) shape).lineTo(552.022, 140.278);
        ((GeneralPath) shape).lineTo(552.072, 140.844);
        ((GeneralPath) shape).lineTo(550.425, 141.558);
        ((GeneralPath) shape).lineTo(550.524, 142.688);
        ((GeneralPath) shape).lineTo(552.271, 143.105);
        ((GeneralPath) shape).lineTo(552.32, 143.671);
        ((GeneralPath) shape).lineTo(551.188, 143.771);
        ((GeneralPath) shape).lineTo(550.205, 145.566);
        ((GeneralPath) shape).lineTo(552.828, 175.54);
        ((GeneralPath) shape).lineTo(554.673, 177.089);
        ((GeneralPath) shape).lineTo(575.033, 175.308);
        ((GeneralPath) shape).lineTo(581.127, 166.796);
        ((GeneralPath) shape).lineTo(576.221, 143.29);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(574.376, 141.742);
        ((GeneralPath) shape).lineTo(573.245, 141.841);
        ((GeneralPath) shape).lineTo(573.196, 141.275);
        ((GeneralPath) shape).lineTo(574.844, 140.561);
        ((GeneralPath) shape).lineTo(574.743, 139.431);
        ((GeneralPath) shape).lineTo(572.997, 139.013);
        ((GeneralPath) shape).lineTo(572.948, 138.447);
        ((GeneralPath) shape).lineTo(574.079, 138.348);
        ((GeneralPath) shape).lineTo(575.062, 136.552);
        ((GeneralPath) shape).lineTo(572.934, 112.234);
        ((GeneralPath) shape).lineTo(574.066, 112.135);
        ((GeneralPath) shape).lineTo(582.521, 104.557);
        ((GeneralPath) shape).lineTo(581.977, 98.335);
        ((GeneralPath) shape).lineTo(573.909, 97.332);
        ((GeneralPath) shape).lineTo(580.619, 89.336);
        ((GeneralPath) shape).lineTo(578.329, 82.698);
        ((GeneralPath) shape).lineTo(568.716, 83.539);
        ((GeneralPath) shape).lineTo(571.536, 70.185);
        ((GeneralPath) shape).lineTo(566.714, 67.188);
        ((GeneralPath) shape).lineTo(556.364, 72.652);
        ((GeneralPath) shape).lineTo(555.891, 60.726);
        ((GeneralPath) shape).lineTo(549.423, 58.442);
        ((GeneralPath) shape).lineTo(540.034, 68.382);
        ((GeneralPath) shape).lineTo(536.251, 77.261);
        ((GeneralPath) shape).lineTo(537.164, 81.17);
        ((GeneralPath) shape).lineTo(544.396, 85.667);
        ((GeneralPath) shape).lineTo(544.989, 92.453);
        ((GeneralPath) shape).lineTo(542.565, 91.743);
        ((GeneralPath) shape).lineTo(541.544, 113.861);
        ((GeneralPath) shape).lineTo(545.59, 112.347);
        ((GeneralPath) shape).lineTo(545.888, 115.74);
        ((GeneralPath) shape).lineTo(547.633, 116.157);
        ((GeneralPath) shape).lineTo(549.612, 138.779);
        ((GeneralPath) shape).lineTo(550.891, 140.377);
        ((GeneralPath) shape).lineTo(552.022, 140.278);
        ((GeneralPath) shape).lineTo(552.072, 140.844);
        ((GeneralPath) shape).lineTo(550.425, 141.558);
        ((GeneralPath) shape).lineTo(550.524, 142.688);
        ((GeneralPath) shape).lineTo(552.271, 143.105);
        ((GeneralPath) shape).lineTo(552.32, 143.671);
        ((GeneralPath) shape).lineTo(551.188, 143.771);
        ((GeneralPath) shape).lineTo(550.205, 145.566);
        ((GeneralPath) shape).lineTo(552.828, 175.54);
        ((GeneralPath) shape).lineTo(554.673, 177.089);
        ((GeneralPath) shape).lineTo(575.033, 175.308);
        ((GeneralPath) shape).lineTo(581.127, 166.796);
        ((GeneralPath) shape).lineTo(576.221, 143.29);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_10_5_1;
        g.setTransform(defaultTransform__0_0_0_10_5_1);
        g.setClip(clip__0_0_0_10_5_1);
        origAlpha = alpha__0_0_0_10_5;
        g.setTransform(defaultTransform__0_0_0_10_5);
        g.setClip(clip__0_0_0_10_5);
        float alpha__0_0_0_10_6 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_6 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_6 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_6 is ShapeNode
        paint = new Color(255, 255, 255, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(473.52, 83.663);
        ((GeneralPath) shape).lineTo(473.52, 127.377);
        ((GeneralPath) shape).lineTo(476.358, 156.898);
        ((GeneralPath) shape).lineTo(476.358, 176.2);
        ((GeneralPath) shape).lineTo(478.062, 191.529);
        ((GeneralPath) shape).lineTo(480.332, 193.8);
        ((GeneralPath) shape).lineTo(502.474, 193.8);
        ((GeneralPath) shape).lineTo(504.744, 191.529);
        ((GeneralPath) shape).lineTo(506.447, 176.2);
        ((GeneralPath) shape).lineTo(506.447, 156.898);
        ((GeneralPath) shape).lineTo(509.285, 127.377);
        ((GeneralPath) shape).lineTo(509.285, 83.663);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(473.52, 83.663);
        ((GeneralPath) shape).lineTo(473.52, 127.377);
        ((GeneralPath) shape).lineTo(476.358, 156.898);
        ((GeneralPath) shape).lineTo(476.358, 176.2);
        ((GeneralPath) shape).lineTo(478.062, 191.529);
        ((GeneralPath) shape).lineTo(480.332, 193.8);
        ((GeneralPath) shape).lineTo(502.474, 193.8);
        ((GeneralPath) shape).lineTo(504.744, 191.529);
        ((GeneralPath) shape).lineTo(506.447, 176.2);
        ((GeneralPath) shape).lineTo(506.447, 156.898);
        ((GeneralPath) shape).lineTo(509.285, 127.377);
        ((GeneralPath) shape).lineTo(509.285, 83.663);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_10_6;
        g.setTransform(defaultTransform__0_0_0_10_6);
        g.setClip(clip__0_0_0_10_6);
        float alpha__0_0_0_10_7 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_7 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_7 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_7 is ShapeNode
        paint = new Color(255, 255, 255, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(491.403, 102.965);
        ((GeneralPath) shape).curveTo(482.25, 102.965, 474.83102, 98.713,
                474.83102, 83.662994);
        ((GeneralPath) shape).lineTo(470.11304, 83.662994);
        ((GeneralPath) shape).lineTo(470.11304, 71.173);
        ((GeneralPath) shape).lineTo(471.83905, 69.46999);
        ((GeneralPath) shape).lineTo(477.43805, 68.99999);
        ((GeneralPath) shape).curveTo(479.03906, 64.88699, 481.29205,
                61.525993, 483.96106, 59.316994);
        ((GeneralPath) shape).lineTo(484.41205, 55.276993);
        ((GeneralPath) shape).lineTo(486.22406, 53.573994);
        ((GeneralPath) shape).lineTo(496.58105, 53.573994);
        ((GeneralPath) shape).lineTo(498.39404, 55.276993);
        ((GeneralPath) shape).lineTo(498.84503, 59.316994);
        ((GeneralPath) shape).curveTo(501.51202, 61.525993, 503.76703,
                64.88699, 505.36804, 68.99999);
        ((GeneralPath) shape).lineTo(510.96603, 69.46999);
        ((GeneralPath) shape).lineTo(512.69305, 71.173);
        ((GeneralPath) shape).lineTo(512.69305, 83.662994);
        ((GeneralPath) shape).lineTo(507.97406, 83.662994);
        ((GeneralPath) shape).curveTo(507.974, 98.713, 500.554, 102.965,
                491.403, 102.965);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(0, 0, 0, 255);
        stroke = new BasicStroke(1.5f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(491.403, 102.965);
        ((GeneralPath) shape).curveTo(482.25, 102.965, 474.83102, 98.713,
                474.83102, 83.662994);
        ((GeneralPath) shape).lineTo(470.11304, 83.662994);
        ((GeneralPath) shape).lineTo(470.11304, 71.173);
        ((GeneralPath) shape).lineTo(471.83905, 69.46999);
        ((GeneralPath) shape).lineTo(477.43805, 68.99999);
        ((GeneralPath) shape).curveTo(479.03906, 64.88699, 481.29205,
                61.525993, 483.96106, 59.316994);
        ((GeneralPath) shape).lineTo(484.41205, 55.276993);
        ((GeneralPath) shape).lineTo(486.22406, 53.573994);
        ((GeneralPath) shape).lineTo(496.58105, 53.573994);
        ((GeneralPath) shape).lineTo(498.39404, 55.276993);
        ((GeneralPath) shape).lineTo(498.84503, 59.316994);
        ((GeneralPath) shape).curveTo(501.51202, 61.525993, 503.76703,
                64.88699, 505.36804, 68.99999);
        ((GeneralPath) shape).lineTo(510.96603, 69.46999);
        ((GeneralPath) shape).lineTo(512.69305, 71.173);
        ((GeneralPath) shape).lineTo(512.69305, 83.662994);
        ((GeneralPath) shape).lineTo(507.97406, 83.662994);
        ((GeneralPath) shape).curveTo(507.974, 98.713, 500.554, 102.965,
                491.403, 102.965);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_10_7;
        g.setTransform(defaultTransform__0_0_0_10_7);
        g.setClip(clip__0_0_0_10_7);
        float alpha__0_0_0_10_8 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_8 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_8 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_8 is CompositeGraphicsNode
        float alpha__0_0_0_10_8_0 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_8_0 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_8_0 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_8_0 is ShapeNode
        paint = new Color(199, 200, 202, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(503.721, 91.413);
        ((GeneralPath) shape).curveTo(505.075, 88.288, 505.879, 84.498,
                505.879, 80.216);
        ((GeneralPath) shape).curveTo(505.879, 76.924, 505.398, 73.806,
                504.564, 70.995);
        ((GeneralPath) shape).curveTo(503.619, 70.658005, 502.645, 70.362,
                501.648, 70.101006);
        ((GeneralPath) shape).curveTo(502.938, 76.157, 503.702, 83.494,
                503.721, 91.413);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(199, 200, 202, 255);
        stroke = new BasicStroke(1.0f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(503.721, 91.413);
        ((GeneralPath) shape).curveTo(505.075, 88.288, 505.879, 84.498,
                505.879, 80.216);
        ((GeneralPath) shape).curveTo(505.879, 76.924, 505.398, 73.806,
                504.564, 70.995);
        ((GeneralPath) shape).curveTo(503.619, 70.658005, 502.645, 70.362,
                501.648, 70.101006);
        ((GeneralPath) shape).curveTo(502.938, 76.157, 503.702, 83.494,
                503.721, 91.413);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_10_8_0;
        g.setTransform(defaultTransform__0_0_0_10_8_0);
        g.setClip(clip__0_0_0_10_8_0);
        float alpha__0_0_0_10_8_1 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_8_1 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_8_1 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_8_1 is ShapeNode
        paint = new Color(199, 200, 202, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(479.085, 91.42);
        ((GeneralPath) shape).curveTo(479.103, 83.499, 479.867, 76.159,
                481.158, 70.101);
        ((GeneralPath) shape).curveTo(480.16098, 70.362, 479.185, 70.658,
                478.241, 70.994995);
        ((GeneralPath) shape).curveTo(477.406, 73.80599, 476.926, 76.923996,
                476.926, 80.215996);
        ((GeneralPath) shape).curveTo(476.926, 84.5, 477.73, 88.296, 479.085,
                91.42);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(199, 200, 202, 255);
        stroke = new BasicStroke(1.0f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(479.085, 91.42);
        ((GeneralPath) shape).curveTo(479.103, 83.499, 479.867, 76.159,
                481.158, 70.101);
        ((GeneralPath) shape).curveTo(480.16098, 70.362, 479.185, 70.658,
                478.241, 70.994995);
        ((GeneralPath) shape).curveTo(477.406, 73.80599, 476.926, 76.923996,
                476.926, 80.215996);
        ((GeneralPath) shape).curveTo(476.926, 84.5, 477.73, 88.296, 479.085,
                91.42);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_10_8_1;
        g.setTransform(defaultTransform__0_0_0_10_8_1);
        g.setClip(clip__0_0_0_10_8_1);
        float alpha__0_0_0_10_8_2 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_8_2 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_8_2 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_8_2 is ShapeNode
        paint = new Color(199, 200, 202, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(498.884, 67.172);
        ((GeneralPath) shape).curveTo(497.91602, 64.172, 496.709, 63.461,
                495.344, 61.857);
        ((GeneralPath) shape).curveTo(494.081, 61.315998, 492.75598, 61.018997,
                491.406, 61.018997);
        ((GeneralPath) shape).curveTo(490.056, 61.018997, 488.73102, 61.315998,
                487.47, 61.857);
        ((GeneralPath) shape).curveTo(486.104, 63.461, 484.896, 64.172,
                483.927, 67.172);
        ((GeneralPath) shape).curveTo(486.314, 66.797, 488.819, 66.593994,
                491.406, 66.593994);
        ((GeneralPath) shape).curveTo(493.993, 66.594, 496.498, 66.796,
                498.884, 67.172);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(199, 200, 202, 255);
        stroke = new BasicStroke(1.0f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(498.884, 67.172);
        ((GeneralPath) shape).curveTo(497.91602, 64.172, 496.709, 63.461,
                495.344, 61.857);
        ((GeneralPath) shape).curveTo(494.081, 61.315998, 492.75598, 61.018997,
                491.406, 61.018997);
        ((GeneralPath) shape).curveTo(490.056, 61.018997, 488.73102, 61.315998,
                487.47, 61.857);
        ((GeneralPath) shape).curveTo(486.104, 63.461, 484.896, 64.172,
                483.927, 67.172);
        ((GeneralPath) shape).curveTo(486.314, 66.797, 488.819, 66.593994,
                491.406, 66.593994);
        ((GeneralPath) shape).curveTo(493.993, 66.594, 496.498, 66.796,
                498.884, 67.172);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_10_8_2;
        g.setTransform(defaultTransform__0_0_0_10_8_2);
        g.setClip(clip__0_0_0_10_8_2);
        float alpha__0_0_0_10_8_3 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_10_8_3 = g.getClip();
        AffineTransform defaultTransform__0_0_0_10_8_3 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_10_8_3 is ShapeNode
        paint = new Color(199, 200, 202, 255);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(481.467, 92.222);
        ((GeneralPath) shape).curveTo(483.315, 95.363, 485.7, 98.098, 488.444,
                98.992);
        ((GeneralPath) shape).lineTo(489.132, 96.022995);
        ((GeneralPath) shape).lineTo(494.104, 96.022995);
        ((GeneralPath) shape).lineTo(494.729, 98.823);
        ((GeneralPath) shape).curveTo(497.284, 97.844, 499.60602, 95.184,
                501.346, 92.226);
        ((GeneralPath) shape).curveTo(501.355, 91.685, 501.358, 91.141,
                501.358, 90.592995);
        ((GeneralPath) shape).curveTo(501.358, 82.607994, 500.553, 75.268,
                499.208, 69.464);
        ((GeneralPath) shape).curveTo(496.733, 68.919, 494.117, 68.621994,
                491.407, 68.621994);
        ((GeneralPath) shape).curveTo(488.69702, 68.621994, 486.082, 68.91799,
                483.608, 69.464);
        ((GeneralPath) shape).curveTo(482.26102, 75.268, 481.457, 82.607994,
                481.457, 90.592995);
        ((GeneralPath) shape).curveTo(481.455, 91.139, 481.459, 91.681,
                481.467, 92.222);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.fill(shape);
        paint = new Color(199, 200, 202, 255);
        stroke = new BasicStroke(1.0f, 0, 0, 4.0f, null, 0.0f);
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(481.467, 92.222);
        ((GeneralPath) shape).curveTo(483.315, 95.363, 485.7, 98.098, 488.444,
                98.992);
        ((GeneralPath) shape).lineTo(489.132, 96.022995);
        ((GeneralPath) shape).lineTo(494.104, 96.022995);
        ((GeneralPath) shape).lineTo(494.729, 98.823);
        ((GeneralPath) shape).curveTo(497.284, 97.844, 499.60602, 95.184,
                501.346, 92.226);
        ((GeneralPath) shape).curveTo(501.355, 91.685, 501.358, 91.141,
                501.358, 90.592995);
        ((GeneralPath) shape).curveTo(501.358, 82.607994, 500.553, 75.268,
                499.208, 69.464);
        ((GeneralPath) shape).curveTo(496.733, 68.919, 494.117, 68.621994,
                491.407, 68.621994);
        ((GeneralPath) shape).curveTo(488.69702, 68.621994, 486.082, 68.91799,
                483.608, 69.464);
        ((GeneralPath) shape).curveTo(482.26102, 75.268, 481.457, 82.607994,
                481.457, 90.592995);
        ((GeneralPath) shape).curveTo(481.455, 91.139, 481.459, 91.681,
                481.467, 92.222);
        ((GeneralPath) shape).closePath();
        g.setPaint(paint);
        g.setStroke(stroke);
        g.draw(shape);
        origAlpha = alpha__0_0_0_10_8_3;
        g.setTransform(defaultTransform__0_0_0_10_8_3);
        g.setClip(clip__0_0_0_10_8_3);
        origAlpha = alpha__0_0_0_10_8;
        g.setTransform(defaultTransform__0_0_0_10_8);
        g.setClip(clip__0_0_0_10_8);
        origAlpha = alpha__0_0_0_10;
        g.setTransform(defaultTransform__0_0_0_10);
        g.setClip(clip__0_0_0_10);
        float alpha__0_0_0_11 = origAlpha;
        origAlpha = origAlpha * 1.0f;
        g.setComposite(AlphaComposite.getInstance(3, origAlpha));
        Shape clip__0_0_0_11 = g.getClip();
        AffineTransform defaultTransform__0_0_0_11 = g.getTransform();
        g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
        // _0_0_0_11 is CompositeGraphicsNode
        origAlpha = alpha__0_0_0_11;
        g.setTransform(defaultTransform__0_0_0_11);
        g.setClip(clip__0_0_0_11);
        origAlpha = alpha__0_0_0;
        g.setTransform(defaultTransform__0_0_0);
        g.setClip(clip__0_0_0);
        origAlpha = alpha__0_0;
        g.setTransform(defaultTransform__0_0);
        g.setClip(clip__0_0);
        origAlpha = alpha__0;
        g.setTransform(defaultTransform__0);
        g.setClip(clip__0);
        g.setTransform(defaultTransform_);
        g.setClip(clip_);

    }

    /**
     * Returns the X of the bounding box of the original SVG image.
     *
     * @return The X of the bounding box of the original SVG image.
     */
    public static int getOrigX() {
        return 397;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     *
     * @return The Y of the bounding box of the original SVG image.
     */
    public static int getOrigY() {
        return 26;
    }

    /**
     * Returns the width of the bounding box of the original SVG image.
     *
     * @return The width of the bounding box of the original SVG image.
     */
    public static int getOrigWidth() {
        return 612;
    }

    /**
     * Returns the height of the bounding box of the original SVG image.
     *
     * @return The height of the bounding box of the original SVG image.
     */
    public static int getOrigHeight() {
        return 792;
    }
}