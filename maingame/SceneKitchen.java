package com.skillstorm.maingame;

public class SceneKitchen extends OpeningScene{
	
	public SceneKitchen() {
		this.sceneId = 3;
		this.title = "Kitchen";
		this.description = "In the kitchen, you see dishes with stains you'd rather not guess the origins of,"
				+ " and rotten food strewn around.";
		this.eventOptions = new String[] { "A. Look through the garbage on the counter for something useful.\n"
				+ "B. Open the refrigerator." };
	}
	
	@Override
	public void sceneExitAction(BaseCharacter playerOne) {
		switch (playerOne.playerChoice) {
		case "A": {
			// stuff
			if (playerOne.getIntelligence() > 8) {
				System.out.println("safe and intelligence reward");
				playerOne.gainLevel();
				System.out.println(
						"Amongst all the rot, you somehow manage to find something medicinal.");
				System.out.println("You move on.");
				
			} else {
				System.out.println(
						"Sifting quickly, you accidentally slice your hand on broken dishware. A fruitless search.");
				playerOne.decreaseHp(2);
				System.out.println("You move on.");
			}
//			return playerOne.getNextScene();
		}break;
		case "B": {
			// stuff
			if (playerOne.getStrength() > 8) {
				System.out.println(
						"You shrink back at what you find. You immediately slam it shut.");
				System.out.println("You move on.");
				
			} else {
				System.out.println(
						"Something shatters in your mind. You don't even remember stepping away from the refrigerator.");
				playerOne.decreaseHp(3);
				System.out.println("You move on.");
			}
//			return playerOne.getNextScene();

		}break;
		default: {
			// stuff
			if (playerOne.getStrength() > 8) {
				System.out.println(
						"You shrink back at what you find. You immediately slam it shut.");
				System.out.println("You move on.");
				
			} else {
				System.out.println(
						"Something shatters in your mind. You don't even remember stepping away from the refrigerator.");
				playerOne.decreaseHp(3);
				System.out.println("You move on.");
			}
//			return playerOne.getNextScene();
			}break;
		}
	}
}
