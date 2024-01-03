package com.skillstorm.stackassignment;

import java.util.LinkedList;

public class ReverseStringWithStack {
	
	public String reverse(String str) {
	    LinkedList<Character> chars = new LinkedList<>();
	    String reversedString = "";
	    
	    for(int i = 0; i < str.length(); i++) {
	    	chars.push(str.toCharArray()[i]);
	    }
	    
	    while(!chars.isEmpty()) {
	    	reversedString += chars.pop();
	    }
	    
	    return reversedString;
	    
	}

}
