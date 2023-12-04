package com.skillstorm.treasureassignment;

public class TreasureTest {

	public static void main(String[] args) {
		TreasureChest chestOne = new TreasureChest();
		System.out.println(chestOne.toString());
		
		Treasure itemOne = new Treasure();
		System.out.println(itemOne.toString());
		Treasure itemTwo = new Treasure("Golden Coffee Mug", "As if coffee wasn't already the greatest thing in the world", 1000);
		Treasure[] contentsOfChestTwo = {itemOne, itemTwo};
		TreasureChest chestTwo = new TreasureChest(false, contentsOfChestTwo);
		System.out.println(chestTwo.toString());

	}

}
