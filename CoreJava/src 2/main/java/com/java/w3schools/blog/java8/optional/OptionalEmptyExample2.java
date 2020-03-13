package com.java.w3schools.blog.java8.optional;

import java.util.Optional;

public class OptionalEmptyExample2 {

	public static void main(String[] args) {

		Optional<String> emptyOptional = Optional.empty();
		if (emptyOptional.toString().equals("Optional.empty")) {
			System.out.println("Created Optinal is empty. No value in it.");
		}

	}

}

/*
 * Output: Created Optinal is empty. No value in it.
 */