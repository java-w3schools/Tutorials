package com.java.w3schools.blog.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * Collections.sort() example to sort List of Strngs.
 * 
 * @author JavaProgramTo.com
 *
 */
public class CollectionSortIntegersExample {

	public static void main(String[] args) {

		List<Integer> primeNumbers = new ArrayList<>();

		primeNumbers.add(19);
		primeNumbers.add(7);
		primeNumbers.add(37);
		primeNumbers.add(59);
		primeNumbers.add(23);

		System.out.println("List of integer prime numnbers before sorting : ");

		Iterator<Integer> it = primeNumbers.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		//Collections.sort(primeNumbers);
		Collections.sort(primeNumbers, Collections.reverseOrder());

		System.out.println("List of integer prime numnbers after sorting :");

		it = primeNumbers.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
