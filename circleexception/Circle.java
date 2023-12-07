package com.skillstorm.circleexception;

public class Circle {
	private double radius;
	private double diameter;
	private double circumference;
	private double area;

	public Circle() {
		this.radius = 1;
		this.diameter = this.calculateDiameter();
		this.circumference = this.calculateCircumference();
		this.area = this.calculateArea();
	}

	public Circle (double radius) throws InvalidSizeException {
		if(radius <= 0) {
			throw new InvalidSizeException("Invalid radius input.");
		}else {
			this.radius = radius;
			this.diameter = this.calculateDiameter();
			this.circumference = this.calculateCircumference();
			this.area = this.calculateArea();
		}
	}

	
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if(radius <= 0) {
			throw new InvalidSizeException("Invalid radius input.");
		}else {
			this.radius = radius;
		}
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		if(diameter <= 0) {
			throw new InvalidSizeException("Invalid diameter input.");
		}else {
			this.diameter = diameter;
		}
	}

	public double getCircumference() {
		return circumference;
	}

	public void setCircumference(double circumference) {
		if(circumference <= 0) {
			throw new InvalidSizeException("Invalid circumference input.");
		}else {
			this.circumference = circumference;
		}
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		if(area <= 0) {
			throw new InvalidSizeException("Invalid area input.");
		}else {
			this.area = area;
		}
	}

	/**
	 * method to calculate radius
	 * 
	 * @param diameter
	 * @return radius calculated value
	 */
	public double calculateRadius() {
		return diameter / 2;
	}

	/**
	 * method to calculate radius
	 * 
	 * @param radius
	 * @return diameter calculated value
	 */
	public double calculateDiameter() {
		return radius * 2;
	}

	/**
	 * method to calculate radius
	 * 
	 * @param radius
	 * @return circumference calculated value
	 */
	public double calculateCircumference() {
		return 2 * Math.PI * radius;
	}

	/**
	 * method to calculate radius
	 * 
	 * @param radius
	 * @return area calculated value
	 */
	public double calculateArea() {
		if(this.radius <= 0) {
			System.out.println("Please set or calculate your radius first.");
			return 0;
		} else {
			return Math.PI * Math.pow(radius, 2);
		}
	}

	@Override
	public String toString() {
		return "Circle with radius of " + radius + ", diameter of " + diameter + ", circumference of " + circumference
				+ ", and an area of " + area + ".";
	}
}