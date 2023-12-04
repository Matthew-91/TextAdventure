package com.skillstorm.programmercustomclass;

public class ProgrammerTest {

	public static void main(String[] args) {
		Programmer programmerOne = new Programmer();
		System.out.println(programmerOne.toString());
		
		programmerOne.setName("Sarah");
		programmerOne.setKnownLanguages("");
		programmerOne.setKnownLanguages("Python");
		System.out.println(programmerOne.toString());
		
		String[] programmerTwoKnownLanguages = {"Python", "Java", "C Sharp", "Javascript"};
		Programmer programmerTwo = new Programmer("Jon Seenaw", "Invisible Inc.", programmerTwoKnownLanguages);
		System.out.println(programmerTwo.toString());
		
		System.out.println(programmerTwo.equals(programmerOne));

	}

}