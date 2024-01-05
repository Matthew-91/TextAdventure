package com.skillstorm.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// PART 1 which uses a comparator
		List<Athlete> athletes = new ArrayList<>(8);
		AthleteWinComparator winComparator = new AthleteWinComparator();
		
		athletes.add(new Athlete("Jack Nicklaus", 75, 595));
		athletes.add(new Athlete("Lindsey Vonn", 82, 395));
		athletes.add(new Athlete("Mikaela Shiffrin", 82, 232));
		athletes.add(new Athlete("Novak Djokovic", 92, 280));
		athletes.add(new Athlete("Rafael Nadal", 92, 304));
		athletes.add(new Athlete("Roger Federer", 103, 367));
		athletes.add(new Athlete("Serena Williams", 73, 240));
		// Number of Woods' total events is based on the news clip, not the code snippet.
		athletes.add(new Athlete("Tiger Woods", 82, 371));
		
//		for(Athlete a : athletes) {
//			System.out.printf("%s's win rate is %.3f.\n",a.getName(), a.calculateWinPercentage());
//		}
		
		Collections.sort(athletes, winComparator.reversed());
		
		System.out.println("In descending order, the win rates are: ");
		for(Athlete a : athletes) {
			System.out.printf("%s at %.3f.\n",a.getName(), a.calculateWinPercentage());
		}
		
		// PART 2 which uses a comparable
		List<AthleteComparable> bonus = new ArrayList<>(4);
		bonus.add(new AthleteComparable("Sean Carter", 1, 2));
		bonus.add(new AthleteComparable("Mikaela Shiffrin", 82, 232));
		bonus.add(new AthleteComparable("Mystery Girl", 3, 5));
		bonus.add(new AthleteComparable("Mystery Guy", 7, 10));
		
		Collections.sort(bonus, Collections.reverseOrder());
		
		System.out.println("In descending order, the arguably greater athletes are: ");
		for(AthleteComparable a : bonus) {
			System.out.printf("%s with %d win(s) (win rate of %.3f).\n", 
					a.getName(), a.getCareerWins(), a.calculateWinPercentage());
		}
	}
}
