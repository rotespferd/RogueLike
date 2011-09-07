package com.avancet.game.rougelike.creatures;

import java.awt.Graphics;

import com.avancet.game.rougelike.basic.PhysicalObject;
import com.avancet.game.rougelike.helper.TextureStorage;

public class Creatures extends PhysicalObject {
	
	private String name;
	
	private int age;
	
	private int health;
	
	//Stärke
	private int strength;

	//Intelligenz
	private int intelligence;
	
	//Beweglichkeit;
	private int mobility;
	
	public Creatures(int heightCord, int widthCord){
		super(heightCord, widthCord);
	}
	
	public void paint(Graphics g){
		if(this.isVisible()) paintObject(g);
		else g.drawImage(TextureStorage.getTexture("Block"), this.getCordW() * size + 15, this.getCordH() * size + 15, null);
	}
	
	protected void paintObject(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	public void attack(Creatures enemy){
		enemy.health -= this.strength;
		enemy.testHealth();
		enemy.attack(this);
	}
	
	public void defend(Creatures attacker){
		
	}
	
	public void testHealth(){
		if(this.health <= 0){
			this.setVisible(false);
			this.setSolid(false);
		}
	}
	
	public void setAttributes(int strength, int intelligence, int mobility){
		this.strength = strength;
		this.intelligence = intelligence;
		this.mobility = mobility;
	}
	
	public void setBasicData(String name, int age, int health){
		this.name = name;
		this.age = age;
		this.health = health;
	}
}
