package com.java.w3schools.blog.java8.optional;

import java.util.Optional;

/**
 * Java 8 Optional ofNullable() Method Example
 * 
 * @author Venkatesh
 *
 */
public class OptionalOfNullableExample {

	public static void main(String[] args) {

		// A non-null value is passed
		Optional<String> indiaOptional = Optional.ofNullable(getValue("India"));
		System.out.println("indiaOptional : " + indiaOptional);

		// A null value is passed
		Optional<String> usOptional = Optional.ofNullable(getValue("United States"));
		System.out.println("usOptional : " + usOptional);

		System.out.println(indiaOptional.isPresent());
		System.out.println(usOptional.isPresent());
	}

	private static String getValue(String key) {

		if ("India".equals(key)) {
			return "Delhi";
		} else if ("Australia".equals(key)) {
			return "Sidney";
		}

		return null;
	}

}

/*
indiaOptional : Optional[Delhi]
usOptional : Optional.empty
true
false
*/