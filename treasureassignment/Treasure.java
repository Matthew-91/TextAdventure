package com.skillstorm.treasureassignment;


public class Treasure {
	private String name;
	private String description;
	private double value; // worth in dollars

	public Treasure() {
		this.name = "Moldy bread";
		this.description = "This looks stale...";
		this.value = 0.50;
	}

	public Treasure(String name, String description, double value) {
		this.name = name;
		this.description = description;
		this.value = value;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the value
	 */
	public double getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(double value) {
		this.value = value;
	}

	public String toString() {
		return " You see a " + name + ". " + description + ". It is probably worth " + String.format("$%.2f", value) + ".";
		}

}
