package com.avancet.game.rougelike.creatures;

import com.avancet.game.rougelike.basic.PhysicalObject;

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
	
	public void attack(Creatures enemy){
		
	}
	
	public void defend(Creatures attacker){
		
	}
	
	public void setAttributes(int strength, int intelligence, int mobility){
		this.strength = strength;
		this.intelligence = intelligence;
		this.mobility = mobility;
	}
	
	public void setBasicData(String name, int age){
		this.name = name;
		this.age = age;
	}
}
