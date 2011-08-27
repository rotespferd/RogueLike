package com.avancet.game.rougelike.helper;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.avancet.game.rougelike.basic.GameObjectFactory;

public class ImageLoader {
	
	private static File textureFile = new File("res/texture/block.png");
	
	private static BufferedImage buffImg = null;
	
	public static Image getTexture(int posH, int posW){
		Image tex = null;
		
		if(!textureFile.exists()) GameLogger.getLogger().warn("File " + textureFile.getName() + " does not exist");
		
		try {
			GameLogger.getLogger().info("Read the texture-file");
			if(buffImg == null) buffImg = ImageIO.read(textureFile);
			tex = cropImage(buffImg, posH, posW);
		} catch (IOException e) {
			GameLogger.getLogger().error("There is a IOException", e);
		}
		
		
		return tex;
	}
	
	private static Image cropImage(BufferedImage img, int posH, int posW){
		GameLogger.getLogger().debug("Cropping the texture with height=" + posH + " and width=" + posW);
		Image returnImg = null;
		
		int size = GameObjectFactory.getBlockSize();
		
		//unter Link nachlesen: http://www.java-forum.org/awt-swing-swt/81034-bild-zuschneiden-cropping-cutting-clipping.html
		CropImageFilter filter = new CropImageFilter(posW * size, posH * size, size, size);
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		returnImg = tk.createImage(new FilteredImageSource(img.getSource(), filter));
		
		return returnImg;
	}

}
