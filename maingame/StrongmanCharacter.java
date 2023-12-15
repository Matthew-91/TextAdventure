package com.skillstorm.maingame;

import java.util.ArrayList;

public class StrongmanCharacter extends BaseCharacter{
	public StrongmanCharacter() {
		this.playerLost = false;
		this.playerWon = false;
		this.hitPoints = 20;
		this.strength = 8;
		this.agility = 4;
		this.intelligence = 4;
		// needed for setting - version2.unlikely
//		this.experience = 0;
//		this.expToLevelUp = 15;
		this.characterLevel = 1;
		this.playerChoice = "";
		this.inventory = new ArrayList<String>();
	}
	
	@Override
	public void gainLevel() {
		this.characterLevel += 1;
		this.hitPoints += hitPoints * 0.2;
		this.strength += Math.ceil(strength * 0.2);
	} 
}