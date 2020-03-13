package com.java.w3schools.blog.java.program.to.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMapToIntExample2 {

	public static void main(String[] args) {

		List<Integer> lengths = new ArrayList<>();

		String[] stringArray = { "java", "program", "to", "com", "w3schools" };

		// convert string array to Stream
		Stream<String> stringStream = Stream.of(stringArray).peek(StreamMapToIntExample2::doSleeo);

		IntStream intStream = stringStream.mapToInt(value -> value.length());

		intStream.forEach(lengths::add);

		lengths.forEach(n -> System.out.println(n));

	}

	private static void doSleeo(String value) {

		try {
			System.out.println("Sleeping for a second");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
