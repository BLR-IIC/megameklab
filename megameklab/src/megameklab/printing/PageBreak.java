/*
 * Copyright (c) 2024 - The MegaMek Team. All Rights Reserved.
 *
 * This file is part of MegaMekLab
 *
 * MegaMek is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MegaMek is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MegaMek. If not, see <http://www.gnu.org/licenses/>.
 */
package megameklab.printing;

import megamek.common.BTObject;

/**
 * Dummy entity that indicates that the page should be broken when printing.
 *
 * @author pavelbraginskiy
 */
public class PageBreak implements BTObject {

    @Override
    public String generalName() {
        return "-PAGE BREAK-";
    }

    @Override
    public String specificName() {
        return "";
    }
}
