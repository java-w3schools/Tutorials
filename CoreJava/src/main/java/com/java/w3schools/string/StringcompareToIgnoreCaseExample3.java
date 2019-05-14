package com.java.w3schools.string;

public class StringcompareToIgnoreCaseExample3 {
	public static void main(String[] args) {

		String value1 = "Onee"; // String 1
		String value2 = "One"; // String 2

		System.out.println("Comparing value1 and value2 using  compareToIgnoreCase(): " + value1.compareToIgnoreCase(value2));
		System.out.println("Comparing value1 and value2 using compareTo(): " + value1.compareTo(value2));
	}
}
