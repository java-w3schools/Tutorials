package com.java.w3schools.blog.java8.optional;

import java.util.Optional;

public class OptionalEmptyExample {

	public static void main(String[] args) {

		Optional<String> emptyOptional = Optional.empty();
		System.out.println("Checking optinal value : " + emptyOptional);
	}

}

/*
 * Output: Checking optinal value : Optional.empty
 */