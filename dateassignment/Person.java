package com.skillstorm.dateassignment;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Objects;

public class Person {
	private String name;
	private LocalDate dateOfBirth;
	
	public Person() {
	}
	
	public Person(String name, LocalDate dateOfBirth) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = LocalDate.parse(dateOfBirth);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		int result = 11;
		if(name != null) {
			result = 31 * result + name.hashCode();
		}
		if(name != null) {
			result = 31 * result + dateOfBirth.hashCode();
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
		return Objects.equals(name, other.name) && Objects.equals(dateOfBirth, other.dateOfBirth);
	}
	
	@Override
	public String toString() {
		return name + " was born " 
	+ Objects.toString(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(dateOfBirth)) 
	+ " and is " + Period.between(dateOfBirth, LocalDate.now()).getYears() + " years old.";
	}
	
}
