package com.skillstorm.programmercustomclass;

import java.util.Arrays;

public class Programmer {
	private String name;
	private String currentCompany;
	private String[] knownLanguages;

	public Programmer() {
		this.knownLanguages = new String[10];
	}

	public Programmer(String name, String currentCompany, String language) {
		this.name = name;
		this.currentCompany = currentCompany;
		this.knownLanguages = new String[10];
		this.knownLanguages[0] = language;
	}

	public Programmer(String name, String currentCompany, String[] languages) {
		this.name = name;
		this.currentCompany = currentCompany;
		this.knownLanguages = new String[10];
		for (int i = 0; i < languages.length; i++) {
			if (!(languages[i].equals("") || languages[i] == null)) {
				this.knownLanguages[i] = languages[i];
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCurrentCompany() {
		return currentCompany;
	}

	public void setCurrentCompany(String currentCompany) {
		this.currentCompany = currentCompany;
	}

	public String[] getKnownLanguages() {
		return knownLanguages;
	}

	public void setKnownLanguages(String language) {
		if (!language.equals("") && language != null) {
			String tempArray[] = Arrays.copyOf(this.knownLanguages, this.knownLanguages.length + 1);
			tempArray[tempArray.length - 1] = language;
			this.knownLanguages = tempArray;
		}
	}

	public void setKnownLanguages(String[] knownLanguages) {
		for (int i = 0; i < knownLanguages.length; i++) {
			if (!knownLanguages[i].equals("") && knownLanguages[i] != null) {
				this.knownLanguages[i] = knownLanguages[i];
			}
		}
	}

	@Override
	public String toString() {
		return " The programmer " + this.name + " works at " + this.currentCompany
				+ " and knows the following languages: " + Arrays.toString(knownLanguages) + ".";
	}

	@Override
	public boolean equals(Object obj) {
		Programmer other = (Programmer) obj;
		return this.name == other.name;
	}
}
