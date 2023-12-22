package com.skillstorm.maingame;

import java.util.Scanner;

public class MainController {

	public static void main(String[] args) {
		
		//TODO refactor to remove scanner handling from Main
		Scanner inputPlayerChoice = new Scanner(System.in);
		boolean replay = false;
		do {
			BaseGame baseGame = new BaseGame();
			baseGame.loadBaseGame();
			baseGame.gameRunner(inputPlayerChoice);
			replay = baseGame.replayForWinners(inputPlayerChoice);
		} while(replay);
		
		inputPlayerChoice.close();
	}

}
