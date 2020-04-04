package com.java.w3schools.blog.linkedhashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapExample {

	public static void main(String[] args) {

		// creating LinkedHashMap way
		LinkedHashMap<Integer, String> way1 = new LinkedHashMap<>();

		// way 2
		LinkedHashMap<Integer, String> way2 = new LinkedHashMap<>(25);

		// way 3
		LinkedHashMap<Integer, String> way3 = new LinkedHashMap<>(way2);

		// way 4
		LinkedHashMap<Integer, String> way4 = new LinkedHashMap<>(50, 0.5f);

		// way 5
		LinkedHashMap<Integer, String> way5 = new LinkedHashMap<>(75, 0.75f, false);

		// Adding values to LinkedHashMap
		System.out.println("\nput example");
		way5.put(111, "One");
		way5.put(222, "Two");
		way5.put(333, "Three");
		way5.put(444, "Four");
		way5.put(555, "Five");

		String value111 = way5.get(111);
		System.out.println("value of key 111 : " + value111);

		// getOrDefault example
		System.out.println("\ngetOrDefault example");
		String valueDefault = way5.getOrDefault(5000, "No Key Found");
		System.out.println("get default value : " + valueDefault);

		String value333 = way5.compute(333, (k, v) -> (v + " - " + k));
		System.out.println("compute example : " + value333);

		// containsKey example
		System.out.println("\ncontainsKey example");
		boolean key555Present = way5.containsKey(555);
		System.out.println("555 key present : " + key555Present);

		// forEach example
		System.out.println("\nforEach example");
		way5.forEach((key, value) -> System.out.println("key - " + key + ", Value - " + value));

		// containsValue example
		System.out.println("\ncontainsValue example");
		System.out.println(way5.containsValue("Five"));

		// entrySet example
		System.out.println("\nentrySet example");
		Set<Entry<Integer, String>> s = way5.entrySet();

		Iterator<Entry<Integer, String>> it = s.iterator();

		while (it.hasNext()) {
			Entry<Integer, String> e = it.next();
			System.out.println(e.getKey() + " ---- " + e.getValue());
		}

		// keySet example
		System.out.println("\nkeySet example");
		Set<Integer> keySet = way5.keySet();

		Iterator<Integer> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			System.out.println(keyIterator.next());
		}

		// replaceAll example
		System.out.println("\n replaceAll example");
		way5.replaceAll((k, v) -> (k + v));
		System.out.println(way5);
		
		
		
		// clear() example
		way5.clear();
		System.out.println(way5.size());

		
	}

}
