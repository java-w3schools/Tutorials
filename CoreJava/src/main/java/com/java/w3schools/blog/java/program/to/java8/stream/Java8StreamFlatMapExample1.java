package com.java.w3schools.blog.java.program.to.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * List<List<String>> to List<String>
 * 
 * @author Java8Example
 *
 */

public class Java8StreamFlatMapExample1 {

	public static void main(String[] args) {

		List<String> list1 = Arrays.asList("One", "Two", "Three");
		List<String> list2 = Arrays.asList("Four", "Five", "Six", "Seven");
		List<String> list3 = Arrays.asList("Eight", "Nine");

		List<List<String>> listOfLists = Arrays.asList(list1, list2, list3);

		System.out.println("List of Lists before flattening (List<List<String>>) : " + listOfLists);
		System.out.println("List of Lists before flattening size : " + listOfLists.size());

		Stream<String> flatmapStream = listOfLists.stream().flatMap(list -> list.stream());

		List<String> output = flatmapStream.collect(Collectors.toList());

		System.out.println("After Flattening flatMap() output " + output);
		System.out.println("After Flattening flatMap() output size " + output.size());

	}

}
