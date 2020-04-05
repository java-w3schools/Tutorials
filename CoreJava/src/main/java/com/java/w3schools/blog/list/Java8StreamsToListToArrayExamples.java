package com.java.w3schools.blog.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Java8StreamsToListToArrayExamples {

	public static void main(String[] args) {

		List<String> fruites = new ArrayList<>();
		fruites.add("kiwi");
		fruites.add("jack fruit");
		fruites.add("apple");
		fruites.add("Mango");
		fruites.add("Strawberry");

		Stream<String> stream = fruites.stream();

		String[] fruitesArray = stream.toArray(String[]::new);

		for (String fruit : fruitesArray) {
			System.out.println(fruit);
		}

		String[] lamdaArray = fruites.stream().toArray(n -> new String[n]);
		for (String fruit : lamdaArray) {
			System.out.println(fruit);
		}

	}

}
