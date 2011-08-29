package com.avancet.game.rougelike.gui;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.avancet.game.rougelike.helper.GameLogger;

public class HelpWindow extends JFrame {
	
	private String helpText;
	
	public HelpWindow(){
		super("Help");
		GameLogger.getLogger().info("Create HelpWindow");
		
		setSize(200, 400);
		
		this.helpText = "This is a random help test. Please replace this with real help-text.";
		
		JPanel helpPanel = new JPanel();
		helpPanel.setLayout(new FlowLayout());
		
		JTextArea helpTextArea = new JTextArea();
		helpTextArea.setText(helpText);
		helpPanel.add(helpTextArea);
		
		getContentPane().add(helpPanel);
		setVisible(true);
	}

}
