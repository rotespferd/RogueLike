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

import com.avancet.game.rougelike.blocks.WallBlock;
import com.avancet.game.rougelike.basic.GameObjectFactory;
import com.avancet.game.rougelike.basic.PhysicalObject;
import com.avancet.game.rougelike.blocks.Block;
import com.avancet.game.rougelike.creatures.Player;
import com.avancet.game.rougelike.helper.GameLogger;
import com.avancet.game.rougelike.helper.MapLoader;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Marian Sievers
 */
public class GameMap extends JPanel {
    
    private GameWorld world;
    
    private int width;
    
    private int height;
    
    private String mapName;
    
    public final int BLOCKSIZE = GameObjectFactory.getBlockSize();
    
    //Manuell anlegen
    public GameMap(int width, int height){
        super();
        GameLogger.getLogger().info("Create GameMap with width=" + this.width + "and height=" + this.height);
        this.width = width;
        this.height = height;
        this.world = new GameWorld(this.width, this.height);
    }
    
    //Aus Datei auslesen
    public GameMap(String mapName){
    	super();
    	GameLogger.getLogger().info("Create GameMap with file=" + this.mapName);
    	this.mapName = mapName;
    	init();
    	this.width = this.world.getWorld().length;
    	this.height = this.world.getWorld()[0].length;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        GameLogger.getLogger().info("Start painting the GameMap");
        g.drawRect(5, 5, 10 + this.height * BLOCKSIZE + 10, 10 + this.width * BLOCKSIZE + 10); //+10 an jeder Seite wegen Abstand
        
        for(int h = 0; h < world.getWorld().length;h++){
            for(int w = 0; w < world.getWorld()[h].length; w++){
            	this.world.getWorldElement(h, w).paint(g);
                //this.world.getWorld()[w][h].paint(g);
                //g.drawRect(w*BLOCKSIZE+15, h*BLOCKSIZE+15, BLOCKSIZE, BLOCKSIZE);
                //Später ersetzen durch Zeichenmethode der einzelnen Blocks. ALs Parameter Position übergeben, wie oben.
            }
        }
        GameLogger.getLogger().info("Paint the player");
        GameObjectFactory.getPlayer().paint(g);
        GameLogger.getLogger().info("End painting the GameMap.");
    }
    
    private void init() {
    	GameLogger.getLogger().info("Init with loading from file");
        this.world = MapLoader.getGameWorldFromFIle(this.mapName + ".map");
        GameLogger.getLogger().info("Init the player");
        Player player = new Player(1, 1);
        player.setVisible(true);
        GameObjectFactory.setPlayer(player);
    }
    
    public GameWorld getGameWorld(){
    	return this.world;
    }
    
}
