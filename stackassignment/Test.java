package com.skillstorm.stackassignment;

public class Test {

	public static void main(String[] args) {
		// Part 1
		ReverseStringWithStack reverser = new ReverseStringWithStack();
		String testString = "Everything the light touches";
		
		System.out.println(reverser.reverse(testString));
		System.out.println(testString);
		
		
		// Part 2
		CheckParenthesesWithStack parentheses = new CheckParenthesesWithStack();
		String testExpression = "(())";
		String testExpression2 = "(())))))";
		
		System.out.println(parentheses.isBalanced(testExpression));
		System.out.println(parentheses.isBalanced(testExpression2));

	}

}
