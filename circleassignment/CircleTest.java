package com.skillstorm.circleassignment;

public class CircleTest {

	public static void main(String[] args) {
		Circle circleOne = new Circle();
		System.out.println(circleOne.toString());
		
		Circle circleTwo = new Circle (5);
		System.out.println(circleTwo.toString());
		
		// Wanted to confirm this logic error could happen since 
		// my methods are accessing instance properties and not arguments
		// that are passed in
		circleTwo.circumference = circleOne.calculateCircumference();
		System.out.println(circleTwo.circumference);
		// Using the associated object's method means it will
		// have access to the correct radius so now my circumference
		// calculation is correct
		circleTwo.circumference = circleTwo.calculateCircumference();
		System.out.println(circleTwo.circumference);
		
		circleTwo.area = circleTwo.calculateArea();
		System.out.println(circleTwo.area);

	}

}
