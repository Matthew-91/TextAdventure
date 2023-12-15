package com.skillstorm.maingame;

public class EndSceneGreenhouse extends OpeningScene {
	public EndSceneGreenhouse() {
		this.sceneId = 7;
		this.title = "Greenhouse";
		this.description = "You step into a greenhouse that stretches almost 50 meters before bending "
				+ "around a corner. You hear the door behind you suddenly lock. "
				+ "The door is locked and noxious gas begins to fill the air. You have to move fast.";
		this.eventOptions = new String[] { "A. Just run in hopes there's an exit around the corner "
				+ "at the far end.\n" + "B. Try to break the glass." };
	}

	public void sceneExitAction(BaseCharacter playerOne) {
		switch (playerOne.playerChoice) {
		case "A": {
			// stuff
			if (playerOne.hitPoints>10) {
				System.out.println("You round the corner and see an exit just a little further away. "
						+ "You make it outside and get sick, but at least you're alive.");
				playerOne.playerWon = true;
			}else {
				System.out.println("You choke to death before you make it to the corner.");
				playerOne.playerLost = true;
			}
		}break;
		case "B": {
			// stuff
			if (playerOne.strength>10) {
				System.out.println("You have to hit the glass multiple times, but it does shatter. You escape.");
				playerOne.playerWon = true;
			}else {
				System.out.println("You pound helplessly at the glass. Your blows begin to get weaker. Everything goes black.");
				playerOne.playerLost = true;
			}
		}break;
		default: {
			// stuff
			if (playerOne.hitPoints>10) {
				System.out.println("You round the corner and see an exit just a little further away. "
						+ "You make it outside and get sick, but at least you're alive.");
				playerOne.playerWon = true;
			}else {
				System.out.println("You choke to death before you make it to the corner.");
				playerOne.playerLost = true;
			}
			}break;
		}
	}
}
