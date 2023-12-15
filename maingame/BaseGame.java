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
	
	public BaseGame(){
		
	}
	
	public void loadBaseGame(){
		playerOne = new BaseCharacter();
		startingScene = new OpeningScene();
		currentScene = startingScene;
		possibleScenes = new ArrayList<>(Arrays.asList(new SceneFoyer(), new SceneBedroomOne(), 
				new SceneKitchen(), new SceneLibrary(), new SceneBasement()));
		Collections.shuffle(possibleScenes);
		possibleEnds = new ArrayList<>(Arrays.asList(new EndScenePit(), new EndSceneGreenhouse()));
		Collections.shuffle(possibleEnds);
	}

	public void gameRunner() {
		Scanner inputPlayerChoice = new Scanner(System.in);
		
		do
		{
//			// TODO redundant line to maybe delete
//			System.out.println(currentScene.description);
			// TODO redundant line to maybe delete
//			System.out.println(Arrays.toString(currentScene.eventOptions).replaceAll("\\[|\\]", ""));
			//TODO reintroduce code
//			System.out.println(playerOne.toString());
			currentScene.sceneStartAction();
			playerOne.playerChoice = currentScene.validLetterChecker(inputPlayerChoice).toUpperCase();
			currentScene.sceneExitAction(playerOne);
			currentScene = getNextScene();
		} while (!playerOne.playerLost && !playerOne.playerWon);
		
		System.out.println("The End.");
		inputPlayerChoice.close();
	}
	
	//TODO remove test method
	public void showPlayerStuff() {
		
		System.out.println(playerOne.playerChoice);
	}
	
	public OpeningScene getNextScene() {
		OpeningScene nextScene = new OpeningScene();;
		if(!this.possibleScenes.isEmpty()) {
			nextScene = this.possibleScenes.get(0);
			this.possibleScenes.remove(0);
		}else {
			nextScene = this.possibleEnds.get(0);
		}
		
		return nextScene;
	}

	@Override
	public String toString() {
		return "BaseGame [startingScene=" + startingScene + ", currentScene=" + currentScene + ", possibleScenes="
				+ possibleScenes + ", possibleEnds=" + possibleEnds + ", playerOne=" + playerOne + "]";
	}
	
	
}
