package com.java.w3schools.blog.java.program.to.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * String[][] to String<Integer>
 * 
 * @author Java8Example
 *
 */

public class Java8StreamFlatMapExampleArraysString {

	public static void main(String[] args) {

		// Create array.
		String[][] strArray = new String[][] { { "100", "200", "300" }, { "400", "500" },
				{ "600", "700", "800", "900" } };

		// converting array to Stream
		Stream<String[]> strStream = Arrays.stream(strArray);

		// stream<String> using flatMap()
		Stream<String> flatMapStream = strStream.flatMap(array -> Arrays.stream(array));

		// filtering based on a condition.
		Stream<String> filteredStream = flatMapStream.filter(value -> value.endsWith("00"));

		List<String> output = filteredStream.collect(Collectors.toList());

		System.out.println("After Flattening flatMap() output " + output);

	}

}
