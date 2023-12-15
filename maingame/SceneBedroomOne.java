package com.skillstorm.maingame;

public class SceneBedroomOne extends OpeningScene {
	public SceneBedroomOne() {
		this.sceneId = 2;
		this.title = "Bedroom One";
		this.description = "You stumble into a bedroom.";
		this.eventOptions = new String[] { "A. Investigate under the bed.\n" + "B. Open the box on the nightstand." };
	}

	@Override
	public void sceneExitAction(BaseCharacter playerOne) {
		switch (playerOne.playerChoice) {
		case "A": {
			// stuff
			if (playerOne.getAgility() > 8) {
				System.out.println("safe and agility reward");
				playerOne.gainLevel();
				System.out.println("You move on.");
			} else {
				System.out.println("A rat scurries out and bites you.");
				playerOne.decreaseHp(2);
				System.out.println("You move on.");
			}
		}
			break;
		case "B": {
			// stuff
			if (playerOne.getStrength() > 8) {
				System.out.println("safe and strength reward");
				playerOne.gainLevel();
				System.out.println("You move on.");
			} else {
				System.out.println("Failing to open the box, you break a nail.");
				playerOne.decreaseHp(1);
				System.out.println("You move on.");
			}
		}
			break;
		default: {
			// stuff
			if (playerOne.getStrength() > 8) {
				System.out.println("safe and strength reward");
				playerOne.gainLevel();
				System.out.println("You move on.");
			} else {
				System.out.println("Failing to open the box, you break a nail.");
				playerOne.decreaseHp(1);
				System.out.println("You move on.");
			}
		}
			break;
		}
	}
}
