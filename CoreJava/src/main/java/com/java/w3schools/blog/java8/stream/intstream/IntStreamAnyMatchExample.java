package com.java.w3schools.blog.java8.stream.intstream;

import java.util.stream.IntStream;

/**
 * 
 * Java 8 IntStream anyMatch() Method false Example
 * 
 * @author venkateshn
 *
 */
public class IntStreamAnyMatchExample {

	public static void main(String[] args) {

		IntStream intStream = IntStream.iterate(1, i -> i + 1).limit(10);
		boolean isAnyMatch = intStream.anyMatch(value -> value > 5);
		System.out.println(" Any value is matched to the given predicate conditon ? " + isAnyMatch);

		intStream = IntStream.iterate(100, i -> i + 1).limit(10);
		isAnyMatch = intStream.anyMatch(value -> value > 500);
		System.out.println(
				"Predicate to value is greater than 500. Is any value is matched to this predicate :  " + isAnyMatch);

		// IntStream is empty
		IntStream emptyStream = IntStream.empty();
		boolean isDivisibleBy4 = emptyStream.anyMatch(value -> value % 4 == 0);
		System.out.println("isDivisibleBy4 for empty stream : " + isDivisibleBy4);
	}

}
