package com.skillstorm.icecreamshoparraylist;

import java.util.ArrayList;
import java.util.Objects;

public class Customer {
	//private IceCream iceCream;
	private ArrayList<IceCream> iceCream = new ArrayList<>();
	private String name;

	public Customer() {
	}

	public Customer(IceCream iceCream, String name) {
		this.iceCream.add(iceCream);
		this.name = name;
	}
	public Customer(String name) {
		this.iceCream = null;
		this.name = name;
	}
	public Customer(ArrayList<IceCream> iceCream, String name) {
		this.iceCream.addAll(iceCream);
		this.name = name;
	}

	public ArrayList<IceCream> getIceCream() {
		return iceCream;
	}

	public void setIceCream(ArrayList<IceCream> iceCream) {
		this.iceCream = iceCream;
	}
	
	public void addIceCream(IceCream iceCream) {
		this.iceCream.add(iceCream);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// not sure the toLowerCase will work as i am intending. verify.
	@Override
	public String toString() {
		return name + " ordered " + Objects.toString(this.iceCream, "You haven't picked yet!").toLowerCase();
	}
}
