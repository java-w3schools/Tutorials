package com.java.w3schools.blog.java.program.to.strings;

import java.util.stream.IntStream;

/**
 * 
 * Java program using Java 8 Streams + IntStream
 * 
 * @author JavaProgramTo.com
 *
 */
public class StirngOnlyDigitsNumbersJava8 {
	private static final String PATTERN = "[0-9]+";

	public static void main(String[] args) {

		String input = "12345";
		System.out.println("12345 contains only digits : " + checkStringOnlyDigitsIsDigit(input));

		System.out.println("999b99 contains only digits : " + checkStringOnlyDigitsIsDigit("999b99"));

		System.out.println("$123456789 contains only digits : " + checkStringOnlyDigitsIsDigit("$123456789"));

	}

	private static boolean checkStringOnlyDigitsIsDigit(String input) {

		IntStream intStream = input.chars();
		boolean isMatched = intStream.anyMatch(ch -> Character.isDigit(ch));

		return isMatched;

	}

}
