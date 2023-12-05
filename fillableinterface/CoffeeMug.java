package com.skillstorm.fillableinterface;

public class CoffeeMug implements Fillable {

	// max volume
	private final double OUNCES;
	// amount coffee mug currently has inside it
	private double coffee;

	public CoffeeMug(double ounces) {
		super();
		OUNCES = ounces;
	}

	public double getOUNCES() {
		return OUNCES;
	}

	public double getCoffee() {
		return coffee;
	}

	@Override
	public void fill() {
		if (this.coffee == OUNCES) {
			System.out.println("You are already full.");
		} else {
			this.coffee = OUNCES;
		}

	}

	@Override
	public void empty() {
		if (this.coffee == 0) {
			System.out.println("You are already empty.");
		} else {
			this.coffee = 0;
		}

	}

	@Override
	public void fill(double quantity) {
		double excess;
		if (this.coffee < OUNCES) {
			if (this.coffee + quantity > OUNCES) {
				excess = (this.coffee + quantity) - OUNCES;
				this.coffee = (this.coffee + quantity) - excess;
				System.out.printf("You are now full but almost overfilled by %.2f ounces.\n", excess);
			} else {
				this.coffee = this.coffee + quantity;
			}
		} else {
			System.out.println("You are already full.");
		}

	}

	@Override
	public void empty(double quantity) {
		if (this.coffee > 0) {
			if (quantity >= this.coffee) {
				this.coffee = 0;
			} else {
				this.coffee = this.coffee - quantity;
			}
		} else {
			System.out.println("You are already empty.");
		}

	}

	@Override
	public String toString() {
		return "This coffee mug can hold " + String.format("%.2f", OUNCES) + " and currently has "
				+ String.format("%.2f", coffee) + " ounces.";
	}

}
