package com.avancet.game.rougelike.helper;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class GameLogger {
	
	private static Logger logger = null;

	public static Logger getLogger(){
		if(logger == null){
			logger  = Logger.getLogger(GameLogger.class);
			PropertyConfigurator.configureAndWatch("config/log4j.properties", 2000);
			logger.info("GameLogger is initialized.");
		}
		return logger;
	}
}
