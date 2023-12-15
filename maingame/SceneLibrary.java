package com.skillstorm.maingame;

public class SceneLibrary extends OpeningScene {
	public SceneLibrary() {
		this.sceneId = 4;
		this.title = "Library";
		this.description = "A soft glow radiates from a chandelier overhead and you see books "
				+ "covering most of the walls in this room. A hooded figure, undisturbed by your "
				+ "arrival, sits in a chair.";
		this.eventOptions = new String[] { "A. Try to ignore the figure and examine the bookshelves.\n"
				+ "B. Approach the figure and say, \"Hello.\"" };
	}

	@Override
	public void sceneExitAction(BaseCharacter playerOne) {
		switch (playerOne.playerChoice) {
		case "A": {
			// stuff
			if (playerOne.getIntelligence() < 8) {
				System.out.println("safe and reward");
				playerOne.gainLevel();
				System.out.println("You're more interested in what is behind the books than the books themselves. "
						+ "You find something interesting.");
				System.out.println("You move on.");
			} else {
				System.out
						.println("You've read many of these books before and quickly tire of viewing the collection.");
				System.out.println("You move on.");
			}
		}
			break;
		case "B": {
			// stuff
			if (playerOne.getIntelligence() > 8) {
				System.out.println("safe and intelligence reward");
				playerOne.gainLevel();
				System.out.println(
						"You recognize a book next to the figure and quote a popular line. The figure raises its hand, offering a small gift.");
				System.out.println("You move on.");
			} else {
				System.out.println("Even after prompting it multiple times, the figure doesn't budge.");
				System.out.println("You move on.");
			}
		}
			break;
		default: {
			// stuff
			if (playerOne.getIntelligence() > 8) {
				System.out.println("safe and intelligence reward");
				playerOne.gainLevel();
				System.out.println(
						"You recognize a book next to the figure and quote a popular line. The figure raises its hand, offering a small gift.");
				System.out.println("You move on.");
			} else {
				System.out.println("Even after prompting it multiple times, the figure doesn't budge.");
				System.out.println("You move on.");
			}
		}
			break;
		}
	}
}
