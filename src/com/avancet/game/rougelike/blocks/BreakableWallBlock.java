package com.avancet.game.rougelike.blocks;

import java.awt.Color;

public class BreakableWallBlock extends WallBlock {

	public BreakableWallBlock(int heightCord, int widthCord) {
		super(heightCord, widthCord);
		this.backgroundColor = Color.CYAN;
		this.isSolid = true;
	}
	
	public void breakWall(){
		this.isSolid = false;
		this.backgroundColor = Color.DARK_GRAY;
	}

}
