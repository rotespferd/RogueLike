package com.avancet.game.rougelike.creatures;

import java.awt.Graphics;

import com.avancet.game.rougelike.basic.GameObjectFactory;
import com.avancet.game.rougelike.helper.GameLogger;
import com.avancet.game.rougelike.helper.TextureStorage;

public class Blober extends Creatures {

	public Blober(int heightCord, int widthCord) {
		super(heightCord, widthCord);
		setBasicData("Blober", 1, 8);
		setAttributes(5, 1, 2);
		setVisible(true);
		setSolid(true);
	}

	public void collisionAction() {
		GameLogger.getLogger().info("Blober was attacked");
		GameObjectFactory.getPlayer().attack(this);
		defend(GameObjectFactory.getPlayer());
	}

	protected void paintObject(Graphics g) {
		g.drawImage(TextureStorage.getTexture("Blober"), this.getCordW() * size
				+ 15, this.getCordH() * size + 15, null);
	}

}
