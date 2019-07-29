package com.java.w3schools.blog.java8.optional;

import java.util.Optional;

public class OptionalEmptyExample3 {

	public static void main(String[] args) {

		Optional<String> emptyOptional = Optional.empty();

		if (emptyOptional.isEmpty()) {
			System.out.println("emptyOptional is empty");
		}

		System.err.println(emptyOptional.isPresent());

		System.out.println(emptyOptional.get());
	}

}

/**
 * 
 * Output: emptyOptional is empty false Exception in thread "main"
 * java.util.NoSuchElementException: No value present at
 * java.base/java.util.Optional.get(Optional.java:148) at
 * com.java.w3schools.blog.java8.optional.OptionalEmptyExample3.main(OptionalEmptyExample3.java:17)
 */