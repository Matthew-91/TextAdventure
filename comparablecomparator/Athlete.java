package com.skillstorm.comparablecomparator;

import java.util.Objects;

public class Athlete {
	private String name;
	private int careerWins;
	private int careerEvents;
	
	public Athlete() {
		
	}
	
	public Athlete(String name, int careerWins, int careerEvents) {
		this.name = name;
		this.careerWins = careerWins;
		this.careerEvents = careerEvents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCareerWins() {
		return careerWins;
	}

	public void setCareerWins(int careerWins) {
		this.careerWins = careerWins;
	}

	public int getCareerEvents() {
		return careerEvents;
	}

	public void setCareerEvents(int careerEvents) {
		this.careerEvents = careerEvents;
	}
	
	public double calculateWinPercentage() {
		return (double) this.careerWins / this.careerEvents;
	}

	@Override
	public int hashCode() {
		return Objects.hash(careerEvents, careerWins, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Athlete other = (Athlete) obj;
		return careerEvents == other.careerEvents && careerWins == other.careerWins && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Athlete [name=" + name + ", careerWins=" + careerWins + ", careerEvents=" + careerEvents + "]";
	}
	
}
