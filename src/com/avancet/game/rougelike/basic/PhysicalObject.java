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
package com.avancet.game.rougelike.basic;

import java.awt.Color;
import java.awt.Graphics;

import com.avancet.game.rougelike.helper.GameLogger;

/**
 *
 * @author Marian Sievers
 */
public class PhysicalObject extends GameObject implements Visible {

    private boolean visible;
    private String name;
    protected boolean isSolid;
    
    private int cordH;
    private int cordW;
    
    protected int size = GameObjectFactory.getBlockSize();

    public PhysicalObject() {
        super();
    }
    
    public PhysicalObject(int heightCord, int widthCord){
        super();
        this.cordH = heightCord;
        this.cordW = widthCord;
    }
    
    public void collisionAction(){
    	
    }

    @Override
    public void paint(Graphics g) {
        if (isVisible()) {
            this.paintObject(getCordW(), getCordH(), g);
        } else {
            this.erase(getCordW(), getCordH(),g);
        }
    }

    protected void paintObject(int w, int h, Graphics g) {
        //just temporary
        g.drawRect(w * size + 15, h * size + 15, size, size);
        GameLogger.getLogger().warn("Create a PhysicalObject with id=" + this.getId());
    }

    protected  void erase(int w, int h, Graphics g) {
        System.out.println("not yet implemented");
    }

    public String toString() {
        return "PhysicalObject: id=" + this.getId() + " visible= " + this.visible;
    }

    /**
     * @return the visible
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * @param visible the visible to set
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the cordH
     */
    public int getCordH() {
        return cordH;
    }

    /**
     * @param cordH the cordH to set
     */
    public void setCordH(int cordH) {
        this.cordH = cordH;
    }

    /**
     * @return the cordW
     */
    public int getCordW() {
        return cordW;
    }

    /**
     * @param cordW the cordW to set
     */
    public void setCordW(int cordW) {
        this.cordW = cordW;
    }

	public boolean isSolid() {
		return isSolid;
	}

	public void setSolid(boolean isSolid) {
		this.isSolid = isSolid;
	}
}
