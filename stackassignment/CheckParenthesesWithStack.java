package com.skillstorm.stackassignment;

import java.util.LinkedList;

public class CheckParenthesesWithStack {

	public boolean isBalanced(String expression) {
		LinkedList<Character> parenthesis = new LinkedList<>();
		int leftCount = 0;
		int rightCount = 0;

		for (int i = 0; i < expression.length(); i++) {
			parenthesis.push(expression.toCharArray()[i]);
		}
		while(!parenthesis.isEmpty()) {
			if (parenthesis.peek() == '(') {
				parenthesis.pop();
				leftCount++;
			}else if (parenthesis.peek() == ')') {
				parenthesis.pop();
				rightCount++;
			}else {
				parenthesis.pop();
			}
		}
		return leftCount == rightCount;
	}
}
