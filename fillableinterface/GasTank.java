package com.skillstorm.fillableinterface;

public class GasTank implements Fillable {

	private final double GALLONS;

	private double gas;

	public GasTank(double gallons) {
		this.GALLONS = gallons;
	}

	
	public double getGALLONS() {
		return GALLONS;
	}


	public double getGas() {
		return gas;
	}


	@Override
	public void fill() {
		if (this.gas == GALLONS) {
			System.out.println("You are already full.");
		} else {
			this.gas = GALLONS;
		}

	}

	@Override
	public void empty() {
		if (this.gas == 0) {
			System.out.println("You are already empty.");
		} else {
			this.gas = 0;
		}

	}

	@Override
	public void fill(double quantity) {
		double excess;
		if (this.gas < GALLONS) {
			if (this.gas + quantity > GALLONS) {
				excess = (this.gas + quantity) - GALLONS;
				this.gas = (this.gas + quantity) - excess;
				System.out.printf("You are now full but almost overfilled by %.2f gallons.\n", excess);
			} else {
				this.gas = this.gas + quantity;
			}
		} else {
			System.out.println("You are already full.");
		}

	}

	@Override
	public void empty(double quantity) {
		if (this.gas > 0) {
			if (quantity >= this.gas) {
				this.gas = 0;
			} else {
				this.gas = this.gas - quantity;
			}
		} else {
			System.out.println("You are already empty.");
		}

	}

	@Override
	public String toString() {
		return "This coffee mug can hold " + String.format("%.2f", GALLONS) + " and currently has "
				+ String.format("%.2f", gas) + " ounces.";
	}

}
