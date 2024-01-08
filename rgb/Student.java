package com.skillstorm.rgb;

import java.util.Objects;

public class Student {
	public static int numberOfStudents;
	private String firstName;
	private String lastName;
	private int studentId;
	
	public Student() {
		this.studentId = numberOfStudents + 1;
		numberOfStudents++;
	}
	public Student(String firstName, String lastName) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public static int getNumberOfStudents() {
		return numberOfStudents;
	}

	public static void setNumberOfStudents(int numberOfStudents) {
		Student.numberOfStudents = numberOfStudents;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getStudentId() {
		return studentId;
	}

	@Override
	public String toString() {
		return "There are " + numberOfStudents + " and " + firstName + lastName + " is student " + studentId + ".";
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, studentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return firstName == other.firstName && lastName == other.lastName && studentId == other.studentId;
	}
	
}
