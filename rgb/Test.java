package com.skillstorm.rgb;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
//		Color c1 = new Color();
//		Color c2 = new Color();
//		System.out.println(c1);
//		System.out.println(c2);
//		System.out.println(c1.equals(c2));
//		System.out.println(c1.hashCode());
//		System.out.println(c2.hashCode());

	}

}
