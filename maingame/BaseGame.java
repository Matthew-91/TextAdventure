package com.skillstorm.maingame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BaseGame {

	private OpeningScene startingScene;
	private OpeningScene currentScene;
	protected ArrayList<OpeningScene> possibleScenes;
	protected ArrayList<OpeningScene> possibleEnds;

	private BaseCharacter playerOne;

	public BaseGame() {

	}

	public void loadBaseGame() {
		playerOne = new BaseCharacter();
		startingScene = new OpeningScene();
		currentScene = startingScene;
		possibleScenes = new ArrayList<>(Arrays.asList(new SceneFoyer(), new SceneBedroomOne(), new SceneKitchen(),
				new SceneLibrary(), new SceneBasement()));
		Collections.shuffle(possibleScenes);
		possibleEnds = new ArrayList<>(Arrays.asList(new EndScenePit(), new EndSceneGreenhouse()));
		Collections.shuffle(possibleEnds);
	}

	public void gameRunner(Scanner inputPlayerChoice) {
		greetGamer();
		pickYourCharacter(playerOne, inputPlayerChoice);

		do {
			currentScene.sceneStartAction();
			playerOne.playerChoice = currentScene.validLetterChecker(inputPlayerChoice).toUpperCase();
			currentScene.sceneExitAction(playerOne);
			currentScene = getNextScene();
		} while (!playerOne.playerLost && !playerOne.playerWon);

		System.out.println("The End.");

	}

	public boolean replayForWinners(Scanner inputPlayerChoice) {
		boolean flag = false;
		
		if (playerOne.playerWon) {
			System.out.println("Would you like to play again?\n Select 'A' to play again or 'B' to quit.");
			playerOne.playerChoice = currentScene.validLetterChecker(inputPlayerChoice).toUpperCase();

			if (playerOne.playerChoice.equals("A")) {
				flag = true;
			} else {
				flag = false;
			}
		}
		return flag;
	}

	public void greetGamer() {
		System.out.println("Welcome to Andreville.\n");
	}

	public OpeningScene getNextScene() {
		OpeningScene nextScene = new OpeningScene();
		;
		if (!this.possibleScenes.isEmpty()) {
			nextScene = this.possibleScenes.get(0);
			this.possibleScenes.remove(0);
		} else {
			nextScene = this.possibleEnds.get(0);
		}

		return nextScene;
	}

	public void pickYourCharacter(BaseCharacter playerOne, Scanner inputPlayerChoice) {
		System.out.println("Please choose your class: \nA. Gymnast\nB. Professor\nC. Strongman");
		playerOne.playerChoice = currentScene.validLetterChecker(inputPlayerChoice).toUpperCase();
		if (playerOne.playerChoice.equals("A")) {
			playerOne = new GymnastCharacter();
		} else if (playerOne.playerChoice.equals("B")) {
			playerOne = new ProfessorCharacter();
		} else {
			playerOne = new StrongmanCharacter();
		}

	}

	@Override
	public String toString() {
		return "BaseGame [startingScene=" + startingScene + ", currentScene=" + currentScene + ", possibleScenes="
				+ possibleScenes + ", possibleEnds=" + possibleEnds + ", playerOne=" + playerOne + "]";
	}

}
