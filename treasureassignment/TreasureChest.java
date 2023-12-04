package com.skillstorm.treasureassignment;

import java.util.Arrays;

public class TreasureChest {
	private double weightInLbs;
	private double height;
	private double length;
	private double width;
	private boolean isLocked;
	private Treasure[] contents;

	public TreasureChest() {

		this.weightInLbs = (Math.random() + 0.01) * 30;
		this.height = (Math.random() + 0.01) * 15;
		this.length = (Math.random() + 0.01) * 20;
		this.width = (Math.random() + 0.01) * 15;
		this.isLocked = true;
		this.contents = new Treasure[(int) (Math.random() + 0.01) * 5];
	}

	public TreasureChest(boolean isLocked, Treasure[] contents) {
		this();
		this.isLocked = isLocked;
		this.contents = contents;
	}

	/**
	 * @return the weightInLbs
	 */
	public double getWeightInLbs() {
		return weightInLbs;
	}

	/**
	 * @param weightInLbs the weightInLbs to set
	 */
	public void setWeightInLbs(double weightInLbs) {
		this.weightInLbs = weightInLbs;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * @return the isLocked
	 */
	public boolean getIsLocked() {
		return isLocked;
	}

	/**
	 * @param isLocked the isLocked to set
	 */
	public void setIsLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}

	/**
	 * @return the contents
	 */
	public Treasure[] getContents() {
		if (this.isLocked == false) {
			return this.contents;
		} else {
			return null;
		}
	}

	/**
	 * @param contents to set
	 */
	public void setContents(Treasure[] contents) {
		if (this.isLocked == false) {
			this.contents = contents;
		}
	}

	public String toString() {
		if (this.isLocked == false) {
			return " You estimate the treasure chest weighs " + String.format("%.2f", weightInLbs) + " pounds, is "
					+ String.format("%.2f", height) + " inches tall, is " + String.format("%.2f", length)
					+ " inches long, and is " + String.format("%.2f", width)
					+ " inches wide. After opening the lid, you find " + Arrays.toString(contents) + ".";
		} else {
			return " You estimate the treasure chest weighs " + String.format("%.2f", weightInLbs) + " pounds, is "
					+ String.format("%.2f", height) + " inches tall, is " + String.format("%.2f", length)
					+ " inches long, and is " + String.format("%.2f", width)
					+ " inches wide. You still haven't found a way to unlock it.";
		}
	}

}
