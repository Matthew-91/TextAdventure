package com.skillstorm.comparablecomparator;

import java.util.Comparator;

public class AthleteWinComparator implements Comparator<Athlete>{
	@Override
	public int compare(Athlete a1, Athlete a2) {
		if(a1.calculateWinPercentage() == a2.calculateWinPercentage()) {
			return 0;
		}else if(a1.calculateWinPercentage() > a2.calculateWinPercentage()) {
			return 1;
		} else {
			return -1;
		}
	}

}
