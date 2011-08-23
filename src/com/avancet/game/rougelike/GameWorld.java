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
package com.avancet.game.rougelike;

import com.avancet.game.rougelike.basic.GameObject;
import com.avancet.game.rougelike.basic.PhysicalObject;

/**
 *
 * @author Marian Sievers
 */
public class GameWorld {
   
    private PhysicalObject[][] world;
    
    public GameWorld(int width, int height){
        world = new PhysicalObject[height][width];
    }
    
    public GameWorld(){
    	
    }

    /**
     * @return the world
     */
    public PhysicalObject[][] getWorld() {
        return world;
    }

    /**
     * @param world the world to set
     */
    public void setWorld(PhysicalObject[][] world) {
        this.world = world;
    }
}
