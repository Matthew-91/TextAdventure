package com.skillstorm.comparablecomparator;

import java.util.Objects;

public class AthleteComparable implements Comparable<AthleteComparable> {
	private String name;
	private int careerWins;
	private int careerEvents;

	public AthleteComparable() {

	}

	public AthleteComparable(String name, int careerWins, int careerEvents) {
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
		AthleteComparable other = (AthleteComparable) obj;
		return careerEvents == other.careerEvents && careerWins == other.careerWins && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Athlete [name=" + name + ", careerWins=" + careerWins + ", careerEvents=" + careerEvents + "]";
	}

	@Override
	public int compareTo(AthleteComparable a) {
		if(this.getCareerEvents() > 30 && a.getCareerEvents() > 30) {
			if(this.calculateWinPercentage() > a.calculateWinPercentage()) {
				return 1;
			}else if(this.calculateWinPercentage() < a.calculateWinPercentage()) {
				return -1;
			}else {
				return 0;
			}
		}else {
			if(this.getCareerWins() > a.getCareerWins()) {
				return 1;
			}else if(this.getCareerWins() < a.getCareerWins()) {
				return -1;
			}else {
				return 0;
			}
		}
	}
}
