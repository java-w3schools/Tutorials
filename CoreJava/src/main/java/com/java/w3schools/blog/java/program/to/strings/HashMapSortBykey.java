package com.java.w3schools.blog.java.program.to.strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSortBykey {

	public static void main(String[] args) {

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

		TreeMap<Integer, Integer> treeMap = new TreeMap<>(idAges);

		Set<Entry<Integer, Integer>> set = treeMap.entrySet();

		Iterator<Entry<Integer, Integer>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Entry<Integer, Integer> entry = iterator.next();
			System.out.println("Key : " + entry.getKey() + " - Value - " + entry.getValue());
		}

	}

}
