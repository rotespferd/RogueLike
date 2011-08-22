/**
 *    <one line to give the program's name and a brief idea of what it does.>
 *    Copyright (C) <year>  Marian Sievers
 *
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation, either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.avancet.game.rougelike.blocks;

import com.avancet.game.rougelike.blocks.Block;
import java.awt.Color;

/**
 *
 * @author Marian Sievers
 */
public class WallBlock extends Block{
    
    public WallBlock(int heightCord, int widthCord){
        super(heightCord, widthCord);
        this.backgroundColor = Color.ORANGE;
        this.isSolid = false;
    }
}
