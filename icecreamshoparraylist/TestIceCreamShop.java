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
		IceCream invalidIceCream = new IceCream("AppleTurnover");
		// adding currently sold flavors to shopOne's flavors array list
		shopOne.addFlavor(iceCreamOne);
		shopOne.addFlavor(iceCreamTwo);
		shopOne.addFlavor(iceCreamThree);
		shopOne.addFlavor(iceCreamFour);
		// creating the array lists of ice cream each customer will choose
		ArrayList<IceCream> customerOneIceCream = new ArrayList<>(Arrays.asList(iceCreamThree));
		ArrayList<IceCream> customerTwoIceCream = new ArrayList<>(
				Arrays.asList(iceCreamOne, iceCreamTwo, iceCreamFour));
		// exception
		ArrayList<IceCream> customerThreeIceCream = new ArrayList<>(Arrays.asList(invalidIceCream));
		// exception
		ArrayList<IceCream> customerFourIceCream = new ArrayList<>(Arrays.asList(iceCreamOne, iceCreamTwo));
		// exception
		ArrayList<IceCream> customerFiveIceCream = new ArrayList<>();
		// creating customer objects
		Customer customerOne = new Customer(customerOneIceCream, "John Seenaw");
		Customer customerTwo = new Customer(customerTwoIceCream, "Despicable Gru");
		Customer customerThree = new Customer(customerThreeIceCream, "Invisible Man");
		Customer customerFour = new Customer(customerFourIceCream, "Fred Flintstone");
		Customer customerFive = new Customer(customerFiveIceCream, "Ted Basso");
		customerFour.getIceCream().set(0, null);
		// adding customers to shopOne's customer line
		shopOne.addCustomer(customerOne);
		shopOne.addCustomer(customerTwo);
		shopOne.addCustomer(customerThree);
		shopOne.addCustomer(customerFour);
		shopOne.addCustomer(customerFive);

		// testing adding duplicate ice cream flavors
		// shopOne.addFlavor(iceCreamOne);

		// testing removing an ice cream flavor
		// shopOne.removeFlavor(iceCreamOne);

		// testing the method to service a customer
		int counter = shopOne.getCustomerLine().size();
		for (int i = 0; i < counter; i++) {
			try {
				System.out.println(shopOne.getCustomerLine().get(0).toString());
				shopOne.serviceCustomer();

			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}

		
		System.out.printf("You've earned $%.2f.\n", shopOne.getAmountEarned());

		// broken!!!
//		while (!shopOne.getCustomerLine().isEmpty()) {
//			try {
//				shopOne.serviceCustomer();
//				shopOne.getCustomerLine().remove(0);
//			}catch (IllegalArgumentException e) { 
//					System.out.println(e.getMessage());
//			}
//		}
	}
}
