package com.java.w3schools.blog.java.program.to.java8.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectorsCountingExample {

	public static void main(String[] args) {

		long strCount = Stream
							  .of("Java", "program", "to", "com", "java-w3schools")
							  .collect(Collectors.counting());
		System.out.printf("There are %d strings in the stream %n", strCount);

		long numbersCount = Stream
								.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
								.collect(Collectors.counting());
		System.out.printf("There are %d numbers in the stream %n", numbersCount);

		long evenCount = Stream
								.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
								.filter(i -> i % 2 == 0)
								.collect(Collectors.counting());
		System.out.printf("Even numbers count: "+evenCount);
	}
}
