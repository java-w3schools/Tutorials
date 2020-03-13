package com.java.w3schools.blog.java.program.to.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * Java program to print only odd numbers using Stream filter() api.
 * 
 * @author JavaProgramTo.com
 *
 */

public class StreamFilterLambda {

	public static void main(String[] args) {

		// creating a stream from 1 to 10 numbers.
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

		// fitering only odd numbers
		List<Integer> oddNumbers = stream.filter(num -> num % 2 == 1).collect(Collectors.toList());

		// printing
		oddNumbers.forEach(value -> System.out.println(value));

	}

}
