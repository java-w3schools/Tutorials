package com.java.w3schools.blog.java8.stream.intstream;

import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 * Java 8 IntStream boxed() Method Example
 * 
 * @author venkateshn
 *
 */
public class BoxedExample {

	public static void main(String[] args) {

		// Creating a IntStream from values 10 to 14. End index is exlusive.
		IntStream intStream = IntStream.range(10, 15);

		// calling boxed() method on intStream
		Stream<Integer> streamInt = intStream.boxed();

		streamInt.forEach(value -> System.out.println(value));
		//streamInt.forEach(System.out::println);

		// iterator.

		IntStream evenNmbers = IntStream.of(2, 4, 6, 8, 10);
		Stream<Integer> evenStream = evenNmbers.boxed();

		Iterator<Integer> integerValues = evenStream.iterator();
		integerValues.forEachRemaining(value -> System.out.println("Even Number : " + value));
	}

}
