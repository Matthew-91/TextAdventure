package com.skillstorm;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class OrderStringsBySizeUsingLambda {

	public static void main(String[] args) {
		List<String> sortMe = new LinkedList<String>(Arrays.asList("cow", "supercalifragilisticexspialidocious", "valentinian", "a"));
//		sortMe.add("supercalifragilisticexspialidocious");
//		sortMe.add("valentinian");
//		sortMe.add("a");
//		sortMe.add("cow");
		System.out.println(sortMe);
		Collections.sort(sortMe, (x1, x2) -> {return x1.length() - x2.length();});
		System.out.println(sortMe);

	}

}
