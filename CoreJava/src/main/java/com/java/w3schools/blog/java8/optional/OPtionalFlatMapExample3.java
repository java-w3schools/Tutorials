package com.java.w3schools.blog.java8.optional;

import java.util.Optional;

/**
 * Java 8 Optional flatMap() Method Example
 * 
 * @author venkatesh
 *
 */
public class OPtionalFlatMapExample3 {

	public static void main(String[] args) {

		Optional<String> optional1 = Optional.of("Hello Java 8");
		Optional<Optional<String>> optional2 = Optional.of(optional1);
		Optional<Optional<Optional<String>>> optional3 = Optional.of(optional2);

		System.out.println("optional3 value : " + optional3);

		Optional<String> output = optional3.flatMap(value -> value.flatMap(v -> {
			if (v.get().contains("Java 8")) {
				return Optional.of("Yes, Java 8 is found.");
			}
			return Optional.empty();
		}));

		System.out.println("output value : " + output);
	}
}
