package com.skillstorm.icecreamshoparraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class TestIceCreamShop {

	public static void main(String[] args) {

		// creating the ice cream shop
		IceCreamShop shopOne = new IceCreamShop();
		// creating ice cream objects
		IceCream iceCreamOne = new IceCream("Chocolate", 2.50);
		IceCream iceCreamTwo = new IceCream("Vanilla", 2.50);
		IceCream iceCreamThree = new IceCream("Swirl", 3.15);
		IceCream iceCreamFour = new IceCream("Superman", 4.15);
		IceCream invalidIceCream = new IceCream("Apple Turnover");
		// adding currently sold flavors to shopOne's flavors array list
		shopOne.getFlavors().add(iceCreamOne);
		shopOne.getFlavors().add(iceCreamTwo);
		shopOne.getFlavors().add(iceCreamThree);
		shopOne.getFlavors().add(iceCreamFour);
		// creating the array lists of ice cream each customer will choose
		ArrayList<IceCream> customerOneIceCream = new ArrayList<>(Arrays.asList(invalidIceCream));
		ArrayList<IceCream> customerTwoIceCream = new ArrayList<>(Arrays.asList(iceCreamOne, iceCreamTwo));
		ArrayList<IceCream> customerThreeIceCream = new ArrayList<>();
		// creating two customer objects
		Customer customerOne = new Customer(customerOneIceCream, "John Seenaw");
		Customer customerTwo = new Customer(customerThreeIceCream, "Despicable Gru");
		Customer customerThree = new Customer(customerTwoIceCream, "Invisible Man");
//		
		// adding customers to shopOne's line
//		shopOne.getCustomerLine().add(customerOne);
		shopOne.getCustomerLine().add(customerTwo);
//		shopOne.getCustomerLine().add(customerThree);
		// testing adding duplicate ice cream flavors
//		customerThree.getIceCream().set(0, null);
//		System.out.println(customerThree.toString());
		
		// testing the method to service a customer
		while (!shopOne.getCustomerLine().isEmpty()) {
			try {
				shopOne.serviceCustomer();
			}catch (IllegalArgumentException e) { 
					System.out.println(e.getMessage());
			}
		}

		System.out.printf("You've earned $%.2f.", shopOne.getAmountEarned());
	}
}
