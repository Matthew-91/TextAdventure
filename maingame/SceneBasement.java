package com.skillstorm.maingame;

public class SceneBasement extends OpeningScene {
	public SceneBasement() {
		this.sceneId = 5;
		this.title = "Basement";
		this.description = "The basement is dimly lit, but it is relatively clean, with a simple table near the center, "
				+ "a closet to the side, and a colorful chest in the corner." + "It seems almost...pleasant.";
		this.eventOptions = new String[] { "A. Look inside the chest.", "B. Take a brief rest at the table.",
				"C. It's just a closet..." };
	}

	@Override
	public void sceneExitAction(BaseCharacter playerOne) {
		switch (playerOne.playerChoice) {
		case "A": {
			// stuff
			if (playerOne.getAgility() > 10) {
				System.out.println("safe and agility reward");
				System.out.println(
						"You notice the head of small teddybear tilt off to the side. A key is there"
						+ " where its stuffing should be. Curious, you take the key.");
				System.out.println("You move on.");
				playerOne.addItem("Key");
			} else {
				System.out.println("You find nothing and decide you shouldn't stay here long.");
				System.out.println("You move on.");

			}
//			return playerOne.getNextScene();
		}break;
		case "B": {
			// stuff
			if (playerOne.getIntelligence() > 10) {
				System.out.println("safe and intelligence reward");
				System.out.println(
						"At first, it looks like the table is scratched, but after a few seconds, "
						+ "you notice a pattern of numbers.");
				System.out.println("You move on.");
				playerOne.addItem("Pattern");
			} else {
				System.out.println("You try, but there is no rest here.");
				System.out.println("You move on.");

			}
//			return playerOne.getNextScene();
		}break;
		case "C": {
			// stuff
			if (playerOne.getStrength() > 10) {
				System.out.println(
						"Something inhuman charges at you: You react half in fear, half on instinct, "
						+ "then it lies still at your feet.");
				System.out.println(
						"Staring at the horror, you notice it clutching something. A key. You pocket "
						+ "the key.");
				System.out.println("You move on.");
				playerOne.addItem("Key");
			} else {
				System.out.println(
						"As you get closer to the closet, you hear guttural sounds from within. "
						+ "You decide it's time to leave. Now.");
				System.out.println("You move on.");

			}
//			return playerOne.getNextScene();
		}break;
		default: {
			// stuff
			if (playerOne.getStrength() > 10) {
				System.out.println(
						"Something inhuman charges at you: You react half in fear, half on instinct, "
						+ "then it lies still at your feet.");
				System.out.println(
						"Staring at the horror, you notice it clutching something. A key. You pocket the key.");
				System.out.println("You move on.");
				playerOne.addItem("Key");
			} else {
				System.out.println(
						"As you get closer to the closet, you hear guttural sounds from within. You "
						+ "decide it's time to leave. Now.");
				System.out.println("You move on.");
			}
//			return playerOne.getNextScene();
			}break;
		}
	}
}
