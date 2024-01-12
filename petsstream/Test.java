package com.skillstorm.petsstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Person> petOwners = new ArrayList<>();
		Person p1 = new Person("James");
		Person p2 = new Person("Sarah");
		Person p3 = new Person("Omar");
		petOwners.add(p1);
		petOwners.add(p2);
		petOwners.add(p3);
		Pet pet1 = new Pet("A", 1);
		Pet pet2 = new Pet("B", 1);
		Pet pet3 = new Pet("C", 4);
		p1.setPets(Arrays.asList(pet1, pet2, pet3));
		Pet pet4 = new Pet("D", 3);
		Pet pet5 = new Pet("E", 5);
		p2.setPets(Arrays.asList(pet4, pet5));
		Pet pet6 = new Pet("F", 4);
		p3.setPets(Arrays.asList(pet6));
		
		int mostPets = petOwners.stream().map(per -> per.getPets().size())
				.peek(x -> System.out.println(x)).reduce(0, (x, y) -> {return Math.max(x, y);});
		System.out.println("Most pets owned is: " + mostPets);

	}

}
