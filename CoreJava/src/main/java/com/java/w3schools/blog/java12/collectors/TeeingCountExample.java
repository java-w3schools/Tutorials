package com.java.w3schools.java12.collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.summingDouble;
import static java.util.stream.Collectors.teeing;

import java.util.stream.Stream;

public class TeeingCountExample {

	public static void main(String[] args) {

		// Converting 1 to 10 numbers into Stream integer array.
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// Calling teeing method.
		Double average = stream.collect(teeing(summingDouble(i -> i), counting(), (sum, n) -> sum / n));

		System.out.println("Average of first 10 numbers: " + average);
	}

}
