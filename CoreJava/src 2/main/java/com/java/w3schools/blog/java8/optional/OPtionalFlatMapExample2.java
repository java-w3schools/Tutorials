
package com.java.w3schools.blog.java8.optional;

import java.util.Optional;

/**
 * Java 8 Optional flatMap() Method Example
 * 
 * @author venkatesh
 *
 */
public class OPtionalFlatMapExample2 {

	public static void main(String[] args) {

		Optional<String> nullOptional = Optional.ofNullable(null);
		Optional<String> output = nullOptional.flatMap(value -> Optional.of("No Value"));

		System.out.println("output value : " + output);
	}
}
