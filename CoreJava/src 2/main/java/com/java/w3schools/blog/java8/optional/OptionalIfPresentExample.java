
package com.java.w3schools.blog.java8.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalIfPresentExample {

	public static void main(String[] args) {

		Optional<List<String>> listOptional = Optional.of(Arrays.asList("Rupad", "Mastana", "Jago"));
		listOptional.ifPresent(list -> list.forEach(value -> System.out.println(value)));

		Optional<String> nullOptional = Optional.ofNullable(null);
		nullOptional.ifPresent(value -> System.out.println("The null value is " + value));
		System.out.println("----------");
		Optional<String> statement = Optional.of("this is example program on ifPresent method.");
		statement.ifPresent(value -> System.out.println(value.toUpperCase()));

	}
}

/**
 * Output:
 * Rupad
Mastana
Jago
----------
THIS IS EXAMPLE PROGRAM ON IFPRESENT METHOD.

*/