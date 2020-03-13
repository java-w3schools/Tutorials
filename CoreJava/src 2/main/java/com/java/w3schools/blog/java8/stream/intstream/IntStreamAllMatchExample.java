package com.java.w3schools.blog.java8.stream.intstream;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 * Java 8 IntStream allMatch() Method Example
 * 
 * @author venkateshn
 *
 */
public class IntStreamAllMatchExample {

	public static void main(String[] args) {
		// Even numbers test.
		IntStream evenStream = IntStream.of(10, 20, 30, 40, 50, 60);
		IntPredicate intPredicate = value -> value % 2 == 0;

		boolean isAllEven = evenStream.allMatch(intPredicate);

		System.out.println("Are all values of Int Stream are even ? " + isAllEven);

		// Number divisible by 5
		IntStream divisibleStream = IntStream.of(10, 20, 30, 40, 50, 60, 77);
		IntPredicate divisible5Predicate = value -> value % 5 == 0;

		boolean isAlldivisibleby5 = divisibleStream.allMatch(divisible5Predicate);

		System.out.println("All are values are divided by 5 : " + isAlldivisibleby5);

		// If IntStream is empty?

		IntStream emptyStream = IntStream.empty();

		IntPredicate predicate = number -> number > 0;

		boolean emptyFlag = emptyStream.allMatch(predicate);
		System.out.println("Empty stream allmatch value : " + emptyFlag);

	}

}
