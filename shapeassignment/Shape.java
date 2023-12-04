package com.skillstorm.shapeassignment;

public class Shape {

	private boolean isOneD;
	private boolean isTwoD;
	private boolean isThreeD;
	private String color;

	public Shape() {
		setIsTwoD(true);
	}

	public Shape(String dimension, String color) {
		if (!(dimension == null || color == null)) {
			this.color = color;

			switch (dimension) {
			case "1d":
				setIsOneD(true);
				break;
			case "2d":
				setIsTwoD(true);
				break;
			case "3d":
				setIsThreeD(true);
				break;
			default:
				setIsTwoD(true);
			}
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	public boolean getIsOneD() {
		return isOneD;
	}

	public void setIsOneD(boolean isOneD) {
		this.isOneD = isOneD;
	}

	public boolean getIsTwoD() {
		return isTwoD;
	}

	public void setIsTwoD(boolean isTwoD) {
		this.isTwoD = isTwoD;
	}

	public boolean getIsThreeD() {
		return isThreeD;
	}

	public void setIsThreeD(boolean isThreeD) {
		this.isThreeD = isThreeD;
	}

	public void doStuff() {
		System.out.printf("This shape is the color .", color);
	}

	@Override
	public String toString() {
		if (!(color == null)) {
			return "This shape is the color " + color + ".";
		} else
			return "This shape is colorless.";
	}
}
