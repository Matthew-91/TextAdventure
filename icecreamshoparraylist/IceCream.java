package com.skillstorm.icecreamshoparraylist;

import java.util.Objects;

public class IceCream {
	private String flavor;
	private double price;

	public IceCream() {
	}

	public IceCream(String flavor, double price) {
		this.flavor = flavor;
		this.price = price;
	}
	public IceCream(String flavor) {
		this.flavor = flavor;
		this.price = 1;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "This is " + flavor + " icecream, which costs " + String.format("$%.2f", price) + ".";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IceCream other = (IceCream) obj;
		return Objects.equals(flavor, other.flavor);
	}
	
	
}