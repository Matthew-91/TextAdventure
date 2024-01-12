package com.skillstorm.petsstream;

import java.util.Objects;

public class Pet {
	private String name;
	private int age;

	public Pet() {

	}

	public Pet(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

//	@Override
//	public int hashCode() {
//		int result = 11;
//		if(name != null) {
//			result = 31 * result + name.hashCode();
//		}
//		
//		return result;
//	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "This pet is " + name + " and they are age " + age;
	}

}
