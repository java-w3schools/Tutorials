package com.java.w3schools.blog.java.program.to.java8;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * Java program to find the valid ages.
 * 
 * @author JavaProgramTo.com
 *
 */

public class StreamFilterExample {

	public static void main(String[] args) {

		Predicate<Integer> ageValidation = a -> a > 18;

		boolean output = ageValidation.test(10);
		System.out.println(output);

		// creating a stream with different ages.
		Stream<Integer> ageStream = Stream.of(10, 20, 3, 40, 50, 6, 70, 80, 9, 0);

		// Custom predicate to check the age is above 18.
		Predicate<Integer> agePredicate = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {

				if (t > 18) {
					return true;
				}

				return false;
			}
		};

		// filtering only valid ages using custom predicate and adding them into a list.
		List<Integer> validAgeList = ageStream.filter(agePredicate).collect(Collectors.toList());

		// printing
		validAgeList.forEach(value -> System.out.println(value));

	}

}
