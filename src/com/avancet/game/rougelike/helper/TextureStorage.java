package com.avancet.game.rougelike.helper;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class TextureStorage {
	
	private final static int MAXH = 3;
	private final static int MAXW = 4;
	
	private static HashMap<String, Image> texStore = null;
	
	public static Image getTexture(String name){
		Image tex = null;
		
		if(texStore == null){
			GameLogger.getLogger().info("Load texture into HashMap");
			loadTexture();
		}
		tex = texStore.get(name);
		return tex;
	}
	
	private static void loadTexture(){
		
		//Datei erstellen: Blockname=posw,posh
		
		String[][] code = loadTexCodeFile("res/texture/textureCode.code");
		
		for(int h = 0; h < MAXH; h++){
			for(int w = 0; w < MAXW; w++){
				
			}
		}
	}
	
	private static String[][] loadTexCodeFile(String filename){
		String[][] out = new String[MAXW+MAXH][3];
		File codeFile = new File(filename);
		
		GameLogger.getLogger().info("Loading file with tex-code");
		FileReader reader = null;
		try {
			reader = new FileReader(codeFile);
		} catch (FileNotFoundException e) {
			GameLogger.getLogger().warn("Could not read file " + filename,e);
		}
		BufferedReader buffer = new BufferedReader(reader);
		
		GameLogger.getLogger().info("Read the tex-code");
		String next = null;
		int line = 0;
		try {
			while((next = buffer.readLine()) != null){
				String[] theLine = next.split("=");
				out[line][0] = theLine[0];
				out[line][1] = theLine[1].split(",")[0];
				out[line][2] = theLine[1].split(",")[1];
				GameLogger.getLogger().debug(out[line][0] + out[line][1] + out[line][2]);
				line++;
			}
		} catch (IOException e) {
			GameLogger.getLogger().warn("Error with IO",e);
		}
		
		return out;
	}

}
