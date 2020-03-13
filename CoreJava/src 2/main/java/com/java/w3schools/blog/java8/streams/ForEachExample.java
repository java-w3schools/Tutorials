package com.java.w3schools.blog.java8.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * forEach() method example on List and Map *
 * 
 * @author venkateshn
 *
 */
public class ForEachExample {

	public static void main(String[] args) {

		// Creating List

		List<String> fruits = new ArrayList<>();
		fruits.add("Orange");
		fruits.add("Jack Fruit");
		fruits.add("Mango");
		fruits.add("Apple");

		// List - Normal for loop

		for (String fruit : fruits) {
			System.out.println("Fruit name: " + fruit);
		}

		System.out.println("--------------------------");
		// List - Normal for loop - to print even number index fruits.

		for (int i = 0; i < fruits.size(); i++) {

			if (i % 2 == 0) {
				System.out.println(fruits.get(i));
			}
		}

		System.out.println("--------------------------");

		fruits.forEach(fruit -> System.out.println("Foreach fruIT : " + fruit));

		// Creating Hashset
		Set<String> countriesSet = new HashSet();
		countriesSet.add("USA");
		countriesSet.add("Canada Fruit");
		countriesSet.add("Australia");
		countriesSet.add("India");

		System.out.println("------------------------");

		// Set - Iterator

		Iterator<String> iterator = countriesSet.iterator();

		while (iterator.hasNext()) {
			System.out.println("Set iterator : " + iterator.next());
		}

		// Set forEach

		countriesSet.forEach(str -> System.out.println("Java 8 Set forEach " + str));

		// Example Creating Map

		Map<String, Integer> countryStatesCountMap = new HashMap<>();
		countryStatesCountMap.put("USA", 45);
		countryStatesCountMap.put("India", 25);
		countryStatesCountMap.put("Pakistan", 10);

		// Map normal way

		for (Map.Entry<String, Integer> entry : countryStatesCountMap.entrySet()) {
			System.out.println("Country name : " + entry.getKey() + " States Count : " + entry.getValue());
		}

		countryStatesCountMap.forEach((k, v) -> System.out.println("Key " + k + " , Value : " + v));

		// Java 8 Stream.forEach() Example

		// List Stream forEach Example
		fruits.stream().forEach(value -> System.out.println(value));
		
		// Set Stream forEach Example
		countriesSet.stream().forEach(country -> System.out.println(country));
	}

}
