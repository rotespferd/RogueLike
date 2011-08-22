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
package com.avancet.game.rougelike.helper;

import com.avancet.game.rougelike.GameWorld;
import java.io.File;

/**
 *
 * @author Marian Sievers
 */
public class MapLoader {
    
    public static GameWorld getGameWorldFromFIle(String filename){
        GameWorld world = null;
        
        File mapFIle = new File("res/" + filename);
        
        return world;
    }
    
}
