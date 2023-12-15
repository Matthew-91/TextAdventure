package com.skillstorm.maingame;

public class EndScenePit extends OpeningScene {
	public EndScenePit() {
		this.sceneId = 6;
		this.title = "Pit";
		this.description = "The floor suddenly gives way and you feel yourself falling. After a few "
				+ "seconds you land with a splash in a cold room. You barely have time to register a "
				+ "metal door before a giant creature charges at you.";
		this.eventOptions = new String[] { "A. Rush to the door and try to open it.\n" + "B. Face the beast!" };
	}

	public void sceneExitAction(BaseCharacter playerOne) {
		//quick win - reactive this line for a key
		playerOne.addItem("Key");
		switch (playerOne.playerChoice) {
		case "A": {
			// stuff
			if (playerOne.inventory.contains("Key")) {
				System.out.println("The door is locked but remembering the key you found, you manage"
						+ " to unlock the door and escape.");
				playerOne.playerWon = true;
			} else if (playerOne.inventory.contains("Pattern")) {
				System.out.println("There's a keypad next to the door's handle! Intuitively, you punch in the "
						+ "pattern you found earlier and escape safely.");
				playerOne.playerWon = true;
			} else {
				System.out.println("You fight with the door as the beast crashes toward you. "
						+ "You have no way to unlock it. Before you can turn around, everything goes " + "dark.");
				playerOne.playerLost = true;
			}
		}
			break;
		case "B": {
			// stuff
			System.out.println("The last thing you feel cannot be described. And now you're not alive to do so.");
			playerOne.playerLost = true;
		}
			break;
		default: {
			// stuff
			if (playerOne.inventory.contains("Key")) {
				System.out.println("The door is locked but remembering the key you found, you manage"
						+ " to unlock the door and escape.");
				playerOne.playerWon = true;
			} else if (playerOne.inventory.contains("Pattern")) {
				System.out.println("There's a keypad next to the door's handle! Intuitively, you punch in the "
						+ "pattern you found earlier and escape safely.");
				playerOne.playerWon = true;
			} else {
				System.out.println("You fight with the door as the beast crashes toward you. "
						+ "You have no way to unlock it. Before you can turn around, everything goes " + "dark.");
				playerOne.playerLost = true;
			}
		}
			break;
		}
	}
}
