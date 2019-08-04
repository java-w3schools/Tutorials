package com.java.w3schools.blog.java8.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Java 8 Optional equals() Method Example
 * 
 * @author venkatesh
 *
 */
public class OptionalEqualsExample {

	public static void main(String[] args) {

		// Passing String
		Optional<String> optional = Optional.ofNullable("Java8");
		boolean isEqual = optional.equals("Java8");
		System.out.println(isEqual);

		// Passing List
		Optional<String> optional2 = Optional.ofNullable("Java8");
		List<String> list = Arrays.asList("Java8");
		boolean isListEqual = optional2.equals("Java8");
		System.out.println(isListEqual);

		// Passing Optional
		Optional<String> optional3 = Optional.ofNullable("Java8");
		Optional<String> optional4 = Optional.ofNullable("Java8");
		boolean isOptionalEqual = optional3.equals(optional4);
		System.out.println(isOptionalEqual);

		Optional<String> optional6 = Optional.ofNullable("Java8");
		Optional<String> optional7 = Optional.ofNullable("Java12");
		boolean isOptionalNotEqual = optional6.equals(optional7);
		System.out.println(isOptionalNotEqual);

		// Passing Same Optional
		Optional<String> optional5 = Optional.ofNullable("Java8");
		boolean isOptionalSameEqual = optional5.equals(optional5);
		System.out.println(isOptionalSameEqual);

	}

}



/**
Output:
false
false
true
false
true

*/
