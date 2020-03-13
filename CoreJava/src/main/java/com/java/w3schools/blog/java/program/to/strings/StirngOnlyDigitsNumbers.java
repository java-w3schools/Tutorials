package com.java.w3schools.blog.java.program.to.strings;

/**
 * 
 * Java program using Numeric and ASCII Codes
 * 
 * @author JavaProgramTo.com
 *
 */
public class StirngOnlyDigitsNumbers {

	public static void main(String[] args) {

		String input = "12345";
		System.out.println("12345 contains only digits : " + checkStringOnlyDigitsWithRange(input));

		System.out.println("999b99 contains only digits : " + checkStringOnlyDigitsWithRange("999b99"));

		System.out.println("$123456789 contains only digits : " + checkStringOnlyDigitsWithRange("$123456789"));

	}

	private static boolean checkStringOnlyDigitsWithRange(String input) {

		for (int i = 0; i < input.length(); i++) {

			int digit = (int) input.charAt(i);

			if (!(digit >= 49 && digit <= 57)) {
				return false;
			}
		}

		return true;
	}

}
