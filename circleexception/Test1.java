package com.skillstorm.circleexception;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// test1: test to see if two exceptions are thrown or if first end the code
		// block
//		try {
//			Circle circleOne = new Circle();
//			Circle circleTwo = new Circle(5);
//			Circle circleThree = new Circle(-5);		
//			// only one exception is thrown since code stops at previous line
//			//System.out.println("right after first exception");
//			Circle circleFour = new Circle(0);
//		} catch(InvalidSizeException e) {
//			System.out.println(e.getMessage());
//		}

//		// test2: testing behavior without the try catch block
//		Scanner radiusInput = new Scanner(System.in);
//		double radius;
//		System.out.println("Input your radius, then press Enter.");
//		radius = radiusInput.nextDouble();
//		Circle circleFour = new Circle(radius);
//		System.out.println(circleFour.toString());

		// test3: testing behavior with try catch block
		Scanner radiusInput = new Scanner(System.in);
		double radius;

		System.out.println("Input your radius, then press Enter.");
		try {
			radius = radiusInput.nextDouble();
			Circle circleFour = new Circle(radius);
			System.out.println(circleFour.toString());
		} catch (InvalidSizeException e) {
			System.out.println(e.getMessage());

		} finally {
			radiusInput.close();
		}

		System.out.println("Made it to the last line of code.");

	}

}
