package com.skillstorm.maingame;

import java.util.ArrayList;

public class ProfessorCharacter extends BaseCharacter{
	public ProfessorCharacter() {
		this.playerLost = false;
		this.playerWon = false;
		this.hitPoints = 20;
		this.strength = 4;
		this.agility = 4;
		this.intelligence = 8;
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
		this.intelligence += Math.ceil(intelligence * 0.2);
	}
}
