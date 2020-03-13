package com.java.w3schools.blog.java8.stream.intstream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * 
 * Java 8 IntStream findFirst() Method Example
 * 
 * @author venkateshn
 *
 */
public class IntStreamFindFirstExample {

	public static void main(String[] args) {

		IntStream values = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		OptionalInt firstValue = values.findFirst();

		if (firstValue.isPresent()) {
			System.out.println("first value : " + firstValue.getAsInt());
		} else {
			System.out.println("No value is present");
		}

	}

}
