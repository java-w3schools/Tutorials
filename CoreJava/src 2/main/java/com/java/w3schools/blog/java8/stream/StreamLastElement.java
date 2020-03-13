package com.java.w3schools.blog.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamLastElement {

	public static void main(String[] args) {

		List<String> values = new ArrayList<>();
		values.add("First");
		values.add("Second");
		values.add("Third");
		values.add("Fourth");
		values.add("Last");

		Optional<String> lastOptional = values.stream().reduce((str1, str2) -> str2);
		String lastValue = lastOptional.get();
		System.out.println("last value using reduce api: " + lastValue);

		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Kiwi");
		fruits.add("Sapota");
		fruits.add("BlueBerry");

		long noOfValues = fruits.stream().count();

		Stream<String> skippedStream = fruits.stream().skip(-1);
		Optional<String> lastFruit = skippedStream.findFirst();
		String lastFruitFromList = lastFruit.get();
		System.out.println("Last fruit from the list : " + lastFruitFromList);
		
		
	}

}
