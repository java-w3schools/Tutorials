package com.java.w3schools.blog.java.program.to.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * Integer[][] to List<Integer>
 * 
 * @author Java8Example
 *
 */

public class Java8StreamFlatMapExampleArrays2 {

	public static void main(String[] args) {

		// Create array.
		Integer[][] intArray = new Integer[][] { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };

		// converting array to Stream
		Stream<Integer[]> stream = Arrays.stream(intArray);

		// stream<Integer> using flatMap()
		Stream<Integer> intStream = stream.flatMap(array -> Arrays.stream(array));

		List<Integer> output = intStream.collect(Collectors.toList());

		System.out.println("After Flattening flatMap() output " + output);

	}

}
