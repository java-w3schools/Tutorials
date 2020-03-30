package com.java.w3schools.blog.exceptions;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class AvoidConcurrentModificationException {

	public static void main(String[] args) {

		List<Integer> numbers = new CopyOnWriteArrayList<Integer>();

		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		numbers.add(400);
		numbers.add(500);

		Iterator<Integer> safeIterator = numbers.iterator();

		while (safeIterator.hasNext()) {

			int n = safeIterator.next();

			if (n > 300) {
				numbers.add(n + 1);
			}
			System.out.print(n + " ");

		}

		System.out.println("\nModifed list : " + numbers);

	}

}
