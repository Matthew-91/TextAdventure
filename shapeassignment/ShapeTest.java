package com.skillstorm.shapeassignment;

public class ShapeTest {

	public static void main(String[] args) {
		Shape shapeOne = new Shape();
		Shape shapeTwo = new Shape("1d", "green");
		System.out.println(shapeOne);
		System.out.println(shapeTwo);
		
		Square squareOne = new Square();
		Square squareTwo = new Square(4.5, 2.3);
		System.out.println(squareOne);
		System.out.println(squareTwo);
		
		squareOne.setLength(4.3);
		squareOne.setWidth(9.3);
		squareOne.calcArea();

		System.out.println(squareOne);

	}

}
