package com.avancet.game.rougelike.creatures;

import java.awt.Graphics;

import com.avancet.game.rougelike.creatures.misc.HumanClass;
import com.avancet.game.rougelike.creatures.misc.Race;
import com.avancet.game.rougelike.helper.ImageLoader;

public class Player extends Creatures {
	
	private Race race;
	
	private HumanClass mainClass;
	
	protected int[] texPos = {1,0};
	
	public Player(int heightCord, int widthCord){
		super(heightCord, widthCord);
	}
	
	@Override
    protected void paintObject(int w, int h, Graphics g){
    	super.paintObject(w, h, g);
    	//g.drawLine(w * size + 15, h * size + 17, w * size + size, h * size + size);
    	g.drawImage(ImageLoader.getTexture(this.texPos[0], this.texPos[1]), w * size + 15, h * size + 15, null);
    }

}
