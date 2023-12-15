package com.skillstorm.maingame;

public class SceneFoyer extends OpeningScene {
	public SceneFoyer() {
		this.sceneId = 1;
		this.title = "Foyer";
		this.description = "You are in a large foyer. You hear a sound in a kitchen, "
				+ "but the front door is just a few feet away.";
		this.eventOptions = new String[] { "A. Investigate the sound.\n" + "B. Rush to the front door." };
	}

	@Override
	public void sceneExitAction(BaseCharacter playerOne) {
		switch (playerOne.playerChoice) {
		case "A": {
			// stuff
			if (playerOne.getIntelligence() > 8) {
				System.out.println("safe and intelligence reward");
				playerOne.gainLevel();
				System.out.println("You notice a tile inside the doorway is slightly raised and wisely step over it.");
				System.out.println("You move on.");
			} else if (playerOne.getAgility() > 8) {
				System.out.println(
						"You hear a click as your foot touches the first kitchen tile, but you move fast enough to avoid the trap.");
				System.out.println("You move on.");
			} else {
				System.out.println("You step into the kitchen and suddenly feel a sharp pain in your side.");
				playerOne.decreaseHp(4);
				System.out.println("You move on.");
			}
//			return playerOne.getNextScene();
		}break;
		case "B": {
			// stuff
			System.out.println(
					"You open the front door, but something you can't make out throws you back into the foyer. You bolt up from the floor and run into the nearest room.");
			playerOne.decreaseHp(4);
//			return playerOne.getNextScene();
		}break;
		default: {
			// stuff
			System.out.println(
					"You open the front door, but something you can't make out throws you back into the foyer. You bolt up from the floor and run into the nearest room.");
			playerOne.decreaseHp(4);
//			return playerOne.getNextScene();
			}break;
		}
	}
}
