package com.java.w3schools.blog.java.program.to.strings;

/**
 * 
 * Java program using Character.isDigit(ch) method.
 * 
 * @author JavaProgramTo.com
 *
 */
public class StirngOnlyDigitsNumbersMatches {

	public static void main(String[] args) {

		String input = "12345";
		System.out.println("12345 contains only digits : " + checkStringOnlyDigitsIsDigit(input));

		System.out.println("999b99 contains only digits : " + checkStringOnlyDigitsIsDigit("999b99"));

		System.out.println("$123456789 contains only digits : " + checkStringOnlyDigitsIsDigit("$123456789"));

	}

	private static boolean checkStringOnlyDigitsIsDigit(String input) {

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (!Character.isDigit(ch)) {
				return false;
			}
		}

		return true;
	}

}
