package com.skillstorm.shapeassignment;

public class Square extends Shape {
	private double area;
	private double length;
	private double width;

	public Square() {
		super();
		this.setColor("your favorite color");
	}

	public Square(double length, double width) {
		super("2d", "blue");
		this.length = length;
		this.width = width;
		this.area = this.calcArea();
	}
	
	public double getArea() {
		return area;
	}

	public void setArea() {
		this.area = this.calcArea();
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double calcArea() {
		return this.length * this.width;
	}

	@Override
	public void doStuff() {
		System.out.printf("This shape is the color .", this.getColor());
		this.calcArea();
		System.out.printf("This area is %d.2 units^2.", this.area);
	}

	@Override
	public String toString() {
		return "This is a " + this.getColor() + " square with a length of " + String.format("%.2f", length) + ", width of " 
	+ String.format("%.2f", width) + " and an area of " + String.format("%.2f", area) + ".";
	}

}
