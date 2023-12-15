package com.skillstorm.maingame;

import java.util.ArrayList;

public class GymnastCharacter extends BaseCharacter{
	public GymnastCharacter() {
		this.playerLost = false;
		this.playerWon = false;
		this.hitPoints = 20;
		this.strength = 4;
		this.agility = 8;
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
		this.agility += Math.ceil(agility * 0.2);
	}
}