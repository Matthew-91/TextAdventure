package com.skillstorm.circleassignment;

public class Circle {
	double radius;
	double diameter;
	double circumference;
	double area;
	
	/**
	 * default constructor
	 */
	public Circle() {
		this.radius = 1;
		this.diameter = 1;
		this.circumference = 1;
		this.area = 1;
	}
	
	/**
	 * constructor when instantiated with a radius.
	 * for learning purposes, circumference and area are not
	 * calculated and assigned at construction
	 * @param radius
	 */
	public Circle (double radius) {
		this();
		this.radius = radius;
		this.diameter = radius * 2;
	}
	
	/**
	 * method to calculate radius
	 * @param diameter
	 * @return radius
	 */
	public double calculateRadius() {
		return diameter/2;
	}
	/**
	 * method to calculate radius
	 * @param radius
	 * @return diameter
	 */
	public double calculateDiameter() {
		return radius * 2;
	}
	/**
	 * method to calculate radius
	 * @param radius
	 * @return circumference
	 */
	public double calculateCircumference() {
		return 2 * Math.PI * radius;
	}
	/**
	 * method to calculate radius
	 * @param radius
	 * @return area
	 */
	public double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	/**
	 * string generator of all fields
	 * @return string of all fields
	 */
	public String toString() {
		return "Circle [radius=" + radius + ", diameter=" + diameter + ", circumference=" + circumference + ", area="
				+ area + "]";
	}
}
