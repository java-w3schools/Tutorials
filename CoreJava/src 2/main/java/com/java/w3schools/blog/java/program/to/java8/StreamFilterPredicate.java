package com.java.w3schools.blog.java.program.to.java8;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * Java program to print only odd numbers with predicate using Stream filter()
 * api.
 * 
 * @author JavaProgramTo.com
 *
 */

public class StreamFilterPredicate {

	public static void main(String[] args) {

		// creating a stream from 1 to 10 numbers.
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

		// Custom predicate to check odd number.
		Predicate<Integer> oddPredicate = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {

				if (t % 2 == 1) {
					return true;
				}

				return false;
			}
		};

		// filtering only odd numbers using custom predicate
		List<Integer> oddNumbers = stream.filter(oddPredicate).collect(Collectors.toList());

		// printing
		oddNumbers.forEach(value -> System.out.println(value));

	}

}
