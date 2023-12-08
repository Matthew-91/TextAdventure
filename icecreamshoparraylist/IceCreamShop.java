package com.skillstorm.icecreamshoparraylist;

import java.util.ArrayList;

public class IceCreamShop {

	private String name;
	private double amountEarned;
	private ArrayList<IceCream> flavors; // Are the flavors available at a given store
	private ArrayList<Customer> customerLine;

	public IceCreamShop() {
		this.flavors = new ArrayList<>();
		this.customerLine = new ArrayList<>();
		this.name = "Undecided Name";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmountEarned() {
		return amountEarned;
	}

	public void setAmountEarned(double amountEarned) {
		this.amountEarned = amountEarned;
	}

	public ArrayList<IceCream> getFlavors() {
		return flavors;
	}

	public void setFlavors(ArrayList<IceCream> flavors) {
		this.flavors = flavors;
	}

	public ArrayList<Customer> getCustomerLine() {
		return customerLine;
	}

	public void setCustomerLine(ArrayList<Customer> customerLine) {
		this.customerLine = customerLine;
	}

	// BROKEN!!!
	public void serviceCustomer() throws IllegalArgumentException {
		if (customerLine.get(0).getIceCream() == null || customerLine.get(0).getIceCream().isEmpty()) {
			customerLine.remove(0);
			throw new IllegalArgumentException("You haven't chosen anything.");
		} 
		
		for (IceCream iceCream : customerLine.get(0).getIceCream()) {
			if (iceCream == null) {
				customerLine.remove(0);
				throw new IllegalArgumentException("Please choose an icecream...We need the money.");
			} 
			if (!this.flavors.contains(iceCream)) {
				customerLine.remove(0);
				throw new IllegalArgumentException("We don't have that flavor. Try our Durian icecream!");
			}else{
				amountEarned += iceCream.getPrice();
				customerLine.remove(0);
				System.out.println("Thanks, come again!");
			}
		}
	}

	public void addCustomer(Customer c) {
		this.customerLine.add(c);
	}
	
	//mayb change to only compare flavor names to avoid dupes with different costs
	public void addFlavor(IceCream flavor) {
		if (this.flavors.contains(flavor)) {
			System.out.println("We already have that flavor.");
		} else {
			this.flavors.add(flavor);
		}
	}
	
	// verify
	public void removeFlavor(IceCream flavor) {
		this.flavors.remove(flavor);
		System.out.printf("Alright, we will no longer sell %s.", flavor.getFlavor());
	}

}
