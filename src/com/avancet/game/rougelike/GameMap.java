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
    
    public final int BLOCKSIZE = GameObjectFactory.getBlockSize();
    
    public GameMap(int width, int height){
        super();
        this.width = width;
        this.height = height;
        this.world = new GameWorld(this.width, this.height);
        init();
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        g.drawRect(5, 5, 10 + this.height * BLOCKSIZE + 10, 10 + this.width * BLOCKSIZE + 10); //+10 an jeder Seite wegen Abstand
        
        for(int w = 0; w < world.getWorld().length;w++){
            for(int h = 0; h < world.getWorld()[w].length; h++){
                this.world.getWorld()[w][h].paint(g);
                //g.drawRect(w*BLOCKSIZE+15, h*BLOCKSIZE+15, BLOCKSIZE, BLOCKSIZE);
                //Später ersetzen durch Zeichenmethode der einzelnen Blocks. ALs Parameter Position übergeben, wie oben.
            }
        }
    }
    
    private void init() {
        for(int widthP = 0; widthP < world.getWorld().length; widthP++){
            for(int heightP = 0; heightP < world.getWorld()[widthP].length; heightP++){
                
                world.getWorld()[widthP][heightP] = ((heightP + widthP) % 2) > 0 ?  new PhysicalObject(heightP,widthP) : new WallBlock(heightP, widthP);
                
                
                world.getWorld()[widthP][heightP].setVisible(true);
            }
        }
//        Block b = new Block(2,3);
//        b.setBackgroundColor(Color.RED);
//        b.setVisible(true);
//        world.getWorld()[2][3] = b;
    }
    
}
