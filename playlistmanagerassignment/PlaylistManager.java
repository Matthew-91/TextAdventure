package com.skillstorm.playlistmanagerassignment;

import java.util.LinkedList;
import java.util.ListIterator;

public class PlaylistManager<T> {
	private LinkedList<T> playlist;
	private ListIterator<T> songSelector;
	
	public PlaylistManager() {
		this.playlist = new LinkedList<T>();
//		this.songSelector = playlist.listIterator();
	}
	
	public void addSong(T songName) {
		if(songName == null || songName.toString().trim().isEmpty()) {
			System.out.println("You did not add a song name.");
		}else if(playlist.add(songName)) System.out.println("Successfully added \"" 
			+ songName + "\" to the playlist.");
	}
	
	public void playSong() {
		if(!playlist.isEmpty()) {
			this.songSelector = playlist.listIterator();
			System.out.println("Playing \"" + songSelector.next() + "\".");
//			songSelector.next();
//			System.out.println(playlist.listIterator().next());;
//			playlist.listIterator().next();
//			System.out.println(playlist.listIterator().next());;
//			System.out.println(this.songSelector.next());
			
		}
//		this.songSelector = playlist.listIterator();
	}
	
	public void displayPlaylist() {
		if(!playlist.isEmpty()) {
			System.out.printf("There are %d songs in this playlist.", playlist.size());
		}
	}
	
}
