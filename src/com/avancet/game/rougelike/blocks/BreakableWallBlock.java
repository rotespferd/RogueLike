package com.avancet.game.rougelike.blocks;

import java.awt.Color;
import java.awt.Graphics;

import com.avancet.game.rougelike.helper.GameLogger;
import com.avancet.game.rougelike.helper.ImageLoader;
import com.avancet.game.rougelike.helper.TextureStorage;

public class BreakableWallBlock extends WallBlock {
	
	private String code = "BreakableWallBlock";

	public BreakableWallBlock(int heightCord, int widthCord) {
		super(heightCord, widthCord);
		this.backgroundColor = Color.CYAN;
		this.isSolid = true;
	}
	
	public void breakWall(){
		this.isSolid = false;
		this.code = "BreakableWallBlockBroken";
		GameLogger.getLogger().info("Break the wall");
	}
	
	@Override
    protected void paintObject(int w, int h, Graphics g){
    	super.paintObject(w, h, g);
    	//g.drawLine(w * size + 15, h * size + 17, w * size + size, h * size + size);
    	g.drawImage(TextureStorage.getTexture(this.code), w * size + 15, h * size + 15, null);
    }

}
