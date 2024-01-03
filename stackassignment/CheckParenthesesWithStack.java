package com.skillstorm.stackassignment;

import java.util.LinkedList;

public class CheckParenthesesWithStack {

	public boolean isBalanced(String expression) {
		LinkedList<Character> parenthesis = new LinkedList<>();
		
		// this solution from josh holland
		for (int i = 0; i < expression.length(); i++) {
            Character c = expression.charAt(i);
            // if opening parenthesis, push to stack
            if (c == '(') {
                // push opening parenthesis onto the stack
                parenthesis.push(c);
            } else if (c == ')') {
                if (parenthesis.isEmpty()) {
                    return false;
                }
                // if c is a ')' we pop the opening parenthesis from the stack because it had a
                // matching
                // closing parenthesis
                parenthesis.pop();
            }
        }
        // if the stack is empty after iterating through the expression characters, this
        // will return true,
        // indicating that we had an even/balanced amount of opening and closing
        // parenthesis
        return parenthesis.isEmpty();
		
//		int leftCount = 0;
//		int rightCount = 0;
//
//		for (int i = 0; i < expression.length(); i++) {
//			parenthesis.push(expression.toCharArray()[i]);
//		}
//		
//		
//		while(!parenthesis.isEmpty()) {
//			if (parenthesis.peek() == '(') {
//				parenthesis.pop();
//				leftCount++;
//			}else if (parenthesis.peek() == ')') {
//				parenthesis.pop();
//				rightCount++;
//			}else {
//				parenthesis.pop();
//			}
//		}
//		return leftCount == rightCount;
	}
}
