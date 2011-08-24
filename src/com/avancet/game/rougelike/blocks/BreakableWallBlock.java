package com.avancet.game.rougelike.blocks;

import java.awt.Color;
import java.awt.Graphics;

import com.avancet.game.rougelike.helper.ImageLoader;

public class BreakableWallBlock extends WallBlock {
	
	protected int[] texPos = {0,1};

	public BreakableWallBlock(int heightCord, int widthCord) {
		super(heightCord, widthCord);
		this.backgroundColor = Color.CYAN;
		this.isSolid = true;
	}
	
	public void breakWall(){
		this.isSolid = false;
		this.backgroundColor = Color.DARK_GRAY;
	}
	
	@Override
    protected void paintObject(int w, int h, Graphics g){
    	super.paintObject(w, h, g);
    	//g.drawLine(w * size + 15, h * size + 17, w * size + size, h * size + size);
    	g.drawImage(ImageLoader.getTexture(this.texPos[0], this.texPos[1]), w * size + 15, h * size + 15, null);
    }

}
