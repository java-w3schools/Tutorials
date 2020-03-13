package com.java.w3schools.blog.java.program.to.java8.map;

import java.util.stream.Stream;

/**
 * Java program to convert into uppercase using stream map() function.
 * 
 * @author JavaProgramTo.com
 *
 */
public class StreamMapExample3 {

	public static void main(String[] args) {

		// Creating string stream using Stream.of() method.
		Stream<String> intValues = Stream.of("java", "program", "to", "com", "java-w3schools", "blog", "");

		// upper case stream
		Stream<String> uppercaseStream = intValues.map(string -> string.toUpperCase());

		// iterating final stream
		uppercaseStream.forEach(output -> System.out.println(output));

	}

}
