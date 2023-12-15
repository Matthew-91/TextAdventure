package com.skillstorm.maingame;

public class OpeningScene extends BaseScene {

	public OpeningScene() {
		this.sceneId = 1;
		this.title = "Tomb";
		this.description = "You wake up in a dimly lit room. You see a door to your right, "
				+ "and you think you see a staircase ahead. Neither of which matter because "
				+ "you are tied to a slab of stone.";
		this.eventOptions = new String[] {
				"A. You try to finesse your way out of the bonds.\n" + "B. You pull at the ropes at hard as you can." };
	}

	public void sceneExitAction(BaseCharacter playerOne) {
		switch (playerOne.playerChoice) {

		case "A": {
			// stuff
			if (playerOne.getAgility() > 8 || playerOne.getIntelligence() > 8) {
				System.out.println("You manage to loosen one knot, and the rest soon follow.");
				playerOne.gainLevel();
				// TODO use a helper function to determine this message based on hp <= 0 or
				// still alive
				System.out.println("You move on.");
			} else {
				System.out.println("You eventually get the knots undone but it took you far too long.");
				System.out.println("You move on.");
			}
		}
			break;

		case "B": {
			// stuff
			if (playerOne.getStrength() > 8) {
				System.out.println("You tear through the rope with minimal effort.");
				playerOne.gainLevel();
				System.out.println("You move on.");
			} else {
				System.out.println("But all you do is hurt yourself. You calm down to work the knots. "
						+ "Eventually you get free.");
				playerOne.decreaseHp(2);
				System.out.println("You move on.");
			}

		}
			break;
		default: {
			// stuff
			if (playerOne.getStrength() > 8) {
				System.out.println("You tear through the rope with minimal effort.");
				playerOne.gainLevel();
				System.out.println("You move on.");
			} else {
				System.out.println("But all you do is hurt yourself. You calm down to work the knots. "
						+ "Eventually you get free.");
				playerOne.decreaseHp(2);
				System.out.println("You move on.");
			}
		}
			break;
		}
	}

}
