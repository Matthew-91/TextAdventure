package com.skillstorm.maingame;

import java.util.Scanner;

public abstract class BaseScene {
	protected int sceneId;
	protected String title;
	protected String description;
	protected String[] eventOptions;
//	protected String playerChoice;

	public int getSceneId() {
		return sceneId;
	}

	public void setSceneId(int sceneId) {
		this.sceneId = sceneId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

//	public String getPlayerChoice() {
//		return playerChoice;
//	}
//
//	public void setPlayerChoice(String playerChoice) {
//		this.playerChoice = playerChoice;
//	}

	public void sceneStartAction() {
//		Scanner inputPlayerChoice = new Scanner(System.in);

		System.out.println(description);

		for (String option : this.eventOptions) {
			System.out.println(option);
		}

//		String choiceContainer = this.validLetterChecker(inputPlayerChoice.nextLine());
//		this.playerChoice = validLetterChecker().toUpperCase();

//		inputPlayerChoice.close();
	}

	public String validLetterChecker(Scanner inputPlayerChoice) {
		
		
		boolean flag = true;
		String choiceContainer = "";
		
		if (this.sceneId == 5) {
			while (flag) {
				choiceContainer = inputPlayerChoice.nextLine();
				if (choiceContainer.equalsIgnoreCase("A") || choiceContainer.equalsIgnoreCase("B")
						|| choiceContainer.equalsIgnoreCase("C")) {
					flag = false;
				} else {
					System.out.println("Please input a choice's corresponding letter.");
				}
			}
		} else {
			while (flag) {
				choiceContainer = inputPlayerChoice.nextLine();
				if (choiceContainer.equalsIgnoreCase("A") || choiceContainer.equalsIgnoreCase("B")) {
					flag = false;

				} else {
					System.out.println("Please input a choice's corresponding letter.");
				}
			}
		}
		
		
		return choiceContainer;
	}
}
