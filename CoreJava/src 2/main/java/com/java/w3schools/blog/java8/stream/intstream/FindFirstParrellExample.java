package com.java.w3schools.blog.java8.stream.intstream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * 
 * Java 8 empyt IntStream findFirst() Method Example
 * 
 * @author venkateshn
 *
 */

public class FindFirstParrellExample {

	public static void main(String[] args) {
		IntStream values = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).parallel();
		OptionalInt optionalInt = values.filter(value -> value % 2 == 0).findFirst();

		if (optionalInt.isPresent()) {
			System.out.println("First value is " + optionalInt.getAsInt());
		} else {
			System.out.println("First value is not present because stream is blank.");
		}

	}
}
