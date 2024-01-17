package com.skillstorm.dateassignment;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test {

	public static void main(String[] args) {
		Person person1 = new Person("Sarah", LocalDate.of(2006, 9, 6) );
		System.out.println(person1.toString());
		
		
//		ZonedDateTime s = ZonedDateTime.of(2024, 2, 12, 13, 30, 0, 0, ZoneId.systemDefault());
//		ZonedDateTime e = ZonedDateTime.of(2024, 2, 12, 14, 45, 0, 0, ZoneId.systemDefault());
//		Appointment exam = new Appointment(s, e);
		Appointment exam = new Appointment(ZonedDateTime.of(2024, 2, 12, 13, 30, 0, 0, ZoneId.systemDefault()), 
				ZonedDateTime.of(2024, 2, 12, 14, 45, 0, 0, ZoneId.systemDefault()));
		
		exam.alert();

	}

}
