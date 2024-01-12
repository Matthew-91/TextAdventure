package com.skillstorm.petsstream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
	private String name;
	private List<Pet> pets;
	
	public Person() {
		pets = new ArrayList<>();
	}
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}
	
	@Override
	public int hashCode() {
		int result = 11;
		if(name != null) {
			result = 31 * result + name.hashCode();
		}
		if(pets != null) {
			result = 31 * result + pets.hashCode();
		}
		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name) && Objects.equals(pets, other.pets);
	}
	
	@Override
	public String toString() {
		return "This person is " + name + " and they have the following pets: " + Objects.toString(pets);
	}
	
}
