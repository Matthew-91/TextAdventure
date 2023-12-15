package com.skillstorm.maingame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
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
