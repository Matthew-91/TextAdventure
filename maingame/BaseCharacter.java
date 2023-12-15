package com.skillstorm.maingame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BaseCharacter {
	protected int hitPoints;
	protected int strength;
	protected int agility;
	protected int intelligence;
	protected double experience;
	protected double expToLevelUp;
	protected int characterLevel;
	protected String playerChoice;
	protected ArrayList<String> inventory;
//	protected ArrayList<OpeningScene> possibleScenes;
	protected boolean playerLost;
	protected boolean playerWon;
	

	public BaseCharacter() {
		this.playerLost = false;
		this.playerWon = false;
		this.hitPoints = 20;
		this.strength = 4;
		this.agility = 4;
		this.intelligence = 4;
		this.experience = 0;
		this.expToLevelUp = 15;
		this.characterLevel = 1;
		this.playerChoice = "";
		this.inventory = new ArrayList<String>();
//		possibleScenes = new ArrayList<>(Arrays.asList(new SceneFoyer(), new SceneBedroomOne(), new SceneKitchen(), new SceneLibrary(), new SceneBasement()));
//		Collections.shuffle(possibleScenes);
	}

	public int getHitpoints() {
		return hitPoints;
	}

	public void setHitpoints(int hitpoints) {
		this.hitPoints = hitpoints;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	public double getExpToLevelUp() {
		return expToLevelUp;
	}
	
	public int getCharacterLevel() {
		return characterLevel;
	}

	public void setCharacterLevel(int characterLevel) {
		this.characterLevel = characterLevel;
	}
	
	public ArrayList<String> getInventory() {
		return inventory;
	}


	// This method instead of setExperience method because setExperience may be needed for setting
	// experience directly versus calculating it.
	public void gainExperience(double expGain) {
		this.experience += expGain;
		if(this.experience >= this.expToLevelUp) {
			this.experience = this.experience - this.expToLevelUp;
			this.gainLevel();
		}else {
			this.experience += expGain;
		}
	}

	public void gainLevel() {
		this.characterLevel += 1;
		this.hitPoints += hitPoints * 0.2;
		this.strength += strength * 0.1;
		this.agility += agility * 0.1;
		this.intelligence += intelligence * 0.1;
	}
	
	public void decreaseHp(int amountToDecreaseBy) {
		this.hitPoints = this.hitPoints - amountToDecreaseBy;
		if(this.hitPoints <= 0) {
			this.playerLost = true;
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseCharacter other = (BaseCharacter) obj;
		return agility == other.agility && characterLevel == other.characterLevel
				&& Double.doubleToLongBits(experience) == Double.doubleToLongBits(other.experience)
				&& hitPoints == other.hitPoints && intelligence == other.intelligence && strength == other.strength;
	}

	@Override
	public String toString() {
		return "You are a tour guide with a strength of " + this.getStrength() + ", intelligence of "
				+ this.getIntelligence() + ", and an agility of " + this.getAgility() + ". You begin with "
				+ this.getHitpoints() + " hitpoints and " + String.format("%.2f", this.getExperience())
				+ " experience at level " + this.getCharacterLevel() + ".";
	}

//	public OpeningScene getNextScene() {
//		OpeningScene nextScene = this.possibleScenes.get(0);
//		this.possibleScenes.remove(0);
//		return nextScene;
//	}
	
	public void addItem(String newItem) {
		this.inventory.add(newItem);
		
	}
	public boolean checkForItem(String checkingForThis) {
		if(this.inventory.contains(checkingForThis)) {
			return true;
		}else {
			return false;
		}
		
	}
}
