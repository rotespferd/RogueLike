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

import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.avancet.game.rougelike.basic.GameObjectFactory;

/**
 *
 * @author Marian Sievers
 */
public class GameWindow extends JFrame {
    
    private GameMap map;
    
    public GameWindow(){
        super("RougeLike");
        map = new GameMap("map2");
        
        JPanel gamePanel = new JPanel();
        gamePanel.setLayout(new BoxLayout(gamePanel,BoxLayout.Y_AXIS));
        //setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,800);   //momentan statisch, besser dynamisch
        
        JLabel gameLabel = new JLabel("RougeLike 0.01");
        gameLabel.setSize(50, 20);
        gamePanel.add(gameLabel);
        
        gamePanel.add(map);
        getContentPane().add(gamePanel);
        setVisible(true);
        
        addKeyListener(new GameKeyListener(GameObjectFactory.getPlayer(), map, this));
    }
    
}
