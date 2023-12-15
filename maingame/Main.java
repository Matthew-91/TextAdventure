package com.skillstorm.maingame;

public class Main {

	public static void main(String[] args) {
		BaseGame baseGame = new BaseGame();
		baseGame.loadBaseGame();
		//TODO remove testline
//		System.out.println(baseGame.toString());
		baseGame.gameRunner();
		//TODO remove testline
//		baseGame.showPlayerStuff();
		
	}

}
