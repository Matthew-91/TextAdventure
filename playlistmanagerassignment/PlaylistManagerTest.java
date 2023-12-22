package com.skillstorm.playlistmanagerassignment;

public class PlaylistManagerTest {

	public static void main(String[] args) {
		PlaylistManager<String> pM = new PlaylistManager<String>();
		
		pM.addSong("This Song");
		pM.addSong("That Song");
		pM.addSong("A Song");
		
//		pM.playSong();
		
		pM.displayPlaylist();

	}

}
