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

import com.avancet.game.rougelike.basic.PhysicalObject;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Marian Sievers
 */
public class Block extends PhysicalObject{
 
    protected Color backgroundColor;
    
    protected boolean isSolid;
    
    public Block(int heightCord, int widthCord){
        super(heightCord, widthCord);
        this.backgroundColor = Color.LIGHT_GRAY;
        this.isSolid = false;
    }
    
//    @Override
//    public void paint(Graphics g) {
//        if (isVisible()) {
//            this.paintObject(getCordW(), getCordH(), g);
//        } else {
//            super.erase(getCordW(), getCordH(),g);
//        }
//    }
    
    @Override
    protected void paintObject(int w, int h, Graphics g){
        //super.paintObject(w, h, g);
        g.setColor(getBackgroundColor());
        g.fillRect(w * size + 15, h * size + 15, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(w * size + 15, h * size + 15, size, size);
    }

    /**
     * @return the backgroundColor
     */
    public Color getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * @param backgroundColor the backgroundColor to set
     */
    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    /**
     * @return the isSolid
     */
    public boolean isIsSolid() {
        return isSolid;
    }

    /**
     * @param isSolid the isSolid to set
     */
    public void setIsSolid(boolean isSolid) {
        this.isSolid = isSolid;
    }
}
