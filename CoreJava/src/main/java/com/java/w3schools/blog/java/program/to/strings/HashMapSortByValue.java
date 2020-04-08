package com.java.w3schools.blog.java.program.to.strings;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSortByValue {

	private static <K, V> HashMap sortByValues(HashMap<K, V> map) {

		// creating LinkedList object
		List<Entry<K, V>> linkedList = new LinkedList<>(map.entrySet());

		// sorting based on the values.
		Collections.sort(linkedList, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
			}
		});

		// First created LinkHashMap which preserves the insertion order.
		HashMap sortedHashMap = new LinkedHashMap();

		// Iterating over linkedList
		for (Iterator it = linkedList.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();

			// adding key, value pair to the map.
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		// returning the sorted map.
		return sortedHashMap;
	}

	public static void main(String[] args) {
		// Creating HashMap with id as key and age as value.
		HashMap<Integer, Integer> idAges = new HashMap<>();

		idAges.put(103, 24);
		idAges.put(104, 35);
		idAges.put(102, 20);
		idAges.put(107, 23);
		idAges.put(105, 45);
		idAges.put(101, 18);

		Set<Entry<Integer, Integer>> entrieset = idAges.entrySet();

		Iterator<Entry<Integer, Integer>> it = entrieset.iterator();

		System.out.println("HashMap before sorting by key : ");
		while (it.hasNext()) {
			Entry<Integer, Integer> entry = it.next();
			System.out.println("Key : " + entry.getKey() + " - Value - " + entry.getValue());
		}

		System.out.println();
		System.out.println("HashMap after sorting by key : ");

		Map<Integer, Integer> sortedMap = sortByValues(idAges);

		Set<Entry<Integer, Integer>> set = sortedMap.entrySet();

		Iterator<Entry<Integer, Integer>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Entry<Integer, Integer> entry = iterator.next();
			System.out.println("Key : " + entry.getKey() + " - Value - " + entry.getValue());
		}

	}

}
