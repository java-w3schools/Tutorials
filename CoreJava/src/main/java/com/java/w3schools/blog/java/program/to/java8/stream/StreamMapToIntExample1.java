package com.java.w3schools.blog.java.program.to.java8.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMapToIntExample1 {

	public static void main(String[] args) {

		String[] stringArray = { "java", "program", "to", "com", "w3schools" };

		// convert string array to Stream
		Stream<String> stringStream = Stream.of(stringArray);

		IntStream intStream = stringStream.mapToInt(value -> value.length());

		intStream.forEach(s -> System.out.println(s));

	}

}
