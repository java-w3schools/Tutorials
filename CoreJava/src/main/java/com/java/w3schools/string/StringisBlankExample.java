package com.java.w3schools.string;

public class StringisBlankExample {
	public static void main(String[] args) {
		// String 1 - null string - no value assigned
		String nullString = null;

		// String 2
		String valueString = "value string";

		// printing values
		System.out.println("nullString :: " + nullString);
		System.out.println("valueString :: " + valueString);

		// Use case : Using if condition.

		if (nullString == null || nullString.isEmpty()) {
			System.out.println("nullString is null or blank");
		} else {
			System.out.println("nullString is having some value");
		}

		if (valueString == null || valueString.isEmpty()) {
			System.out.println("valueString is null or blank");
		} else {
			System.out.println("valueString is having some value");
		}

	}
}
