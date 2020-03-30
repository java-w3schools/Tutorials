package com.java.w3schools.blog.exceptions;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AvoidConcurrentModificationHashMapException {

	public static void main(String[] args) {
		// ConcurrentHashMap example
		Map<Integer, String> numbers = new ConcurrentHashMap<Integer, String>();

		numbers.put(1, "One");
		numbers.put(2, "Two");
		numbers.put(3, "Three");
		numbers.put(4, "Four");

		Iterator<Integer> safeIterator = numbers.keySet().iterator();

		while (safeIterator.hasNext()) {

			int n = safeIterator.next();

			if (n > 2) {
				numbers.put(n + 100, "Modified");
			}
			System.out.print(n + " ");

		}

		System.out.println("\nModifed list : " + numbers.keySet());
	}

}
