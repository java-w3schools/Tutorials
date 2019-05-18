package com.java.w3schools.blog.map.hashmap.iterate;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

public class HashMapIterateExamples {

	public static void main(String[] args) {

		// Input map
		Map<String, String> hashMap = new HashMap<>();
		hashMap.put("Map", "HashMap");
		hashMap.put("Set", "Hashset");
		hashMap.put("List", "ArrayList");

		// Method 1: entrySet()
		for (Map.Entry<String, String> entry : hashMap.entrySet()) {
			System.out.println(
					"Key(Interface) = " + entry.getKey() + ", Value(Implementation class) = " + entry.getValue());
		}

		System.out.println("-----------------------------------------------------");

		// Method 2: keyset() and values()
		// Retrieving only keys
		for (String interfaceName : hashMap.keySet()) {
			System.out.println("Key(Interface): " + interfaceName);
		}

		// Retrieving only values
		for (String ImplementationClassName : hashMap.values()) {
			System.out.println("Value(Implementation class): " + ImplementationClassName);
		}

		System.out.println("-----------------------------------------------------");

		// Method 3: entrySet() Iterator

		Set<Entry<String, String>> entrySet = hashMap.entrySet();
		Iterator<Entry<String, String>> iterator = entrySet.iterator();

		while (iterator.hasNext()) {
			Entry<String, String> entry = iterator.next();
			System.out.println(
					"Key(Interface) = " + entry.getKey() + ", Value(Implementation class) = " + entry.getValue());
		}

		System.out.println("-----------------------------------------------------");

		// Method 4: Lamda Map.forEach()

		hashMap.forEach((k, v) -> System.out.println("Key(Interface) = " + k + ", Value(Implementation class) = " + v));

		System.out.println("-----------------------------------------------------");

		// Method 5: Stream API - Multiple lines of code.

		Stream<Entry<String, String>> entriesStream = hashMap.entrySet().stream();
		entriesStream.forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));

		System.out.println("-----------------------------------------------------");

		// Method 5: Stream API Single Line code.

		hashMap.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));

		// Method 6: Get Key and Search for it's value

		System.out.println("-----------------------------------------------------");
		for (String key : hashMap.keySet()) {
			String value = hashMap.get(key);
			System.out.println(key + " - " + value);
		}
	}

}
