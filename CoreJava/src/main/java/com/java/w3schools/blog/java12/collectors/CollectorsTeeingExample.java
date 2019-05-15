package com.java.w3schools.java12.collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsTeeingExample {

	public static void main(String[] args) {
		// Returns a Collector that concatenates the input elements,separated by the
		// specified delimiter, in encounter order.
		Collector<CharSequence, ?, String> joiningCollector = Collectors.joining("-");

		// Returns a Collector that accumulates the input elements into anew List.
		Collector<String, ?, List<String>> listCollector = Collectors.toList();

		Collector<String, ?, String[]> teeingCollector = Collectors.teeing(joiningCollector, listCollector,
				(joinedString, stringsList) -> {
					ArrayList<String> list = new ArrayList<>(stringsList);
					list.add(joinedString);
					String[] array = list.toArray(new String[0]);
					return array;
				});
		String[] words = Stream.of("Java", "W3schools", "blog").collect(teeingCollector);
		System.out.println("Output of Collector teeing method in String[] Array : " + Arrays.toString(words));
	}

}
