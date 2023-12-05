package com.skillstorm.fillableinterface;

public class FillableTests {

	public static void main(String[] args) {
		Fillable gasTankByReference = new GasTank(16);
		Fillable coffeeMugByReference = new CoffeeMug(12);

		System.out.println(gasTankByReference);
		System.out.println(coffeeMugByReference);

		gasTankByReference.empty();
		coffeeMugByReference.empty();
		gasTankByReference.empty(2.2);
		coffeeMugByReference.empty(3.2);

		gasTankByReference.fill();
		coffeeMugByReference.fill();

		System.out.println(gasTankByReference);
		System.out.println(coffeeMugByReference);

		GasTank gasTank = new GasTank(18);
		CoffeeMug coffeeMug = new CoffeeMug(8);

		gasTank.fill(20);
		coffeeMug.fill(20);

		System.out.println(gasTank);
		System.out.println(coffeeMug);

		gasTank.empty(2);
		coffeeMug.empty(1);

		System.out.println(gasTank);
		System.out.println(coffeeMug);
		
		gasTank.empty();
		coffeeMug.empty();
		
		System.out.println(gasTank);
		System.out.println(coffeeMug);

	}

}
