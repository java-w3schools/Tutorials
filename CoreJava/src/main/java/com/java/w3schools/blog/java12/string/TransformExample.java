package com.java.w3scools.blog.java12.string;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TransformExample {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();

		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Avvacado");
		fruits.add("Papaya");

		List<String> newFruitsList = fruits.stream().map(s -> s.transform(str -> str + " Halwa"))
				.collect(Collectors.toList());

		System.out.println(newFruitsList);
	}

}
