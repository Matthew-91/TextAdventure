package com.skillstorm.countlettersinsentence;

import java.util.HashMap;

public class LetterCounter {
	public static void main(String[] args) {
		String sentence1 = "The quick brown fox jumps over the lazy dog.";
		String sentence2 = "Testing 1 2 3 4 ... testing 1 2 3 4";
		
		System.out.println("First Sentence: " + countLetters(sentence1));
		System.out.println("Second Sentence: " + countLetters(sentence2));
		
	}
	
	public static HashMap<Character, Integer> countLetters(String str) {
	    // str.split(\\s) is another good string and regex combination
		HashMap<Character, Integer> letterCounter = new HashMap<>();
	    for(Character c : str.replaceAll("\\p{P}|\\s|\\d", "").toLowerCase().toCharArray()) {
	    	if(letterCounter.containsKey(c)) {
	    		Integer tempCount = letterCounter.get(c);
	    		letterCounter.replace(c, tempCount + 1);
	    	}else {
	    		letterCounter.put(c, 1);
	    	}
	    }
	    
	    return letterCounter;
	    
	}
}
