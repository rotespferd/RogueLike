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

import com.avancet.game.rougelike.creatures.Player;

/**
 *
 * @author Marian Sievers
 */
public class GameObjectFactory {
    
    private static int nextId = 0;
    
    private static int blockSize = 50;
    
    private static String versionNumber = "0.04";
    
    private static String versionCodename = "Belm";  //Codename: A33 Anschlußstellen (siehe Wikipedia)
    
    private static Player player;
    
    public static int getId(){
        nextId++;
        return nextId;
    }
    
    public static int getBlockSize(){
        return blockSize;
    }

    public static String getVersionNumber() {
        return versionNumber;
    }

    public static String getVersionCodename() {
        return versionCodename;
    }

	public static Player getPlayer() {
		return player;
	}

	public static void setPlayer(Player player) {
		GameObjectFactory.player = player;
	}
}
