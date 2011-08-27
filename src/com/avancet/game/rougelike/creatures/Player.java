package com.avancet.game.rougelike.creatures;

import java.awt.Graphics;

import com.avancet.game.rougelike.GameMap;
import com.avancet.game.rougelike.blocks.Block;
import com.avancet.game.rougelike.creatures.misc.HumanClass;
import com.avancet.game.rougelike.creatures.misc.Race;
import com.avancet.game.rougelike.helper.GameLogger;
import com.avancet.game.rougelike.helper.ImageLoader;
import com.avancet.game.rougelike.helper.TextureStorage;

public class Player extends Creatures {
	
	private Race race;
	
	private HumanClass mainClass;
	
	public Player(int heightCord, int widthCord){
		super(heightCord, widthCord);
		GameLogger.getLogger().info("Init the player with name=" + this.getName());
	}
	
	public void paint(Graphics g){
		if(this.isVisible()) paintObject(g);
	}
	
    private void paintObject(Graphics g){
    	//g.drawLine(w * size + 15, h * size + 17, w * size + size, h * size + size);
    	g.drawImage(TextureStorage.getTexture("Player"), this.getCordW() * size + 15, this.getCordH() * size + 15, null);
    }
	
	public void movePlayer(String direction, GameMap map){
		if("UP".equals(direction)) validateAndMovePlayer(map, this.getCordW(), this.getCordH() - 1);
		else if("DOWN".equals(direction)) validateAndMovePlayer(map, this.getCordW(), this.getCordH() + 1);
		else if("RIGHT".equals(direction)) validateAndMovePlayer(map, this.getCordW() + 1, this.getCordH());
		else if("LEFT".equals(direction)) validateAndMovePlayer(map, this.getCordW() - 1, this.getCordH());
	}
	
	private void validateAndMovePlayer(GameMap map, int newW, int newH){
		
		if(newW < 0 || newH < 0) return;
		if(map.getGameWorld().getWorldElement(newH, newW) instanceof Block){
			if(((Block) map.getGameWorld().getWorldElement(newH, newW)).isIsSolid()) return;
		}
		this.setCordH(newH);
		this.setCordW(newW);
		
		System.out.println("Move Player!");
		
	}

}
