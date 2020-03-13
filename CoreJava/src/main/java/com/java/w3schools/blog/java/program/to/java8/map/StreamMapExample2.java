package com.java.w3schools.blog.java.program.to.java8.map;

import java.util.stream.Stream;

/**
 * Java program to find each string length using stream map() function.
 * 
 * @author JavaProgramTo.com
 *
 */
public class StreamMapExample2 {

	public static void main(String[] args) {

		// Creating string stream using Stream.of() method.
		Stream<String> intValues = Stream.of("java", "program", "to", "com", "java-w3schools", "blog", "");

		// multiplication of 5
		Stream<Integer> lengthStream = intValues.map(string -> string.length());

		// iterating final stream
		lengthStream.forEach(output -> System.out.println(output));

	}

}
