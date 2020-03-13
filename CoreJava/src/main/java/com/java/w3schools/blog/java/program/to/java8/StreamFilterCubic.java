package com.java.w3schools.blog.java.program.to.java8;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * Java program to find odd numbers and print its cubic values.
 * 
 * @author JavaProgramTo.com
 *
 */

public class StreamFilterCubic {

	public static void main(String[] args) {

		// creating a stream from 1 to 10 numbers.
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

		// filtering only odd numbers using custom predicate and generating square
		// numbers.
		List<Integer> oddNumbers = stream.filter(n -> n % 2 == 1).map(value -> value * value * value)
				.collect(Collectors.toList());

		// printing
		oddNumbers.forEach(value -> System.out.println(value));

	}

}
