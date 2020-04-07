package com.java.w3schools.blog.treemap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class TreeMapSortByValue {
	public static void main(String args[]) {

		// TreeMap sorting
		TreeMap<String, String> treemap = new TreeMap<String, String>();

		treemap.put("3 IN", "India");
		treemap.put("1 US", "United States");
		treemap.put("2 AUS", "Australia");
		treemap.put("5 PAK", "Pakistan");
		treemap.put("4 UK", "United Kingdom");

		System.out.println("Treemap before sorting : " + treemap);

		// sort treemap by values
		Map sortedMap = sortByValues(treemap);

		System.out.println("Treemap after sorting : " + sortedMap);

		// HashMap sorting
		Map<String, String> hashMapObject = new HashMap<String, String>();

		hashMapObject.put("1", "One");
		hashMapObject.put("2", "Two");
		hashMapObject.put("3", "Three");
		hashMapObject.put("4", "Four");
		hashMapObject.put("5", "FIve");

		System.out.println("HashMap before sorting : " + hashMapObject);

		// sort treemap by values
		Map sortedHashMap = sortByValues(hashMapObject);

		System.out.println("HashMap after sorting : " + sortedHashMap);

		// java 8 sorting

		Map<String, String> java8HashMapApproach = hashMapObject.entrySet().stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		System.out.println("Java 8 HashMap : " + java8HashMapApproach);

		Map<String, String> java8TreeMapApproach = treemap.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		System.out.println("Java 8 TreeMap : " + java8TreeMapApproach);
	}

	public static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map) {

		// custom comparator based don values.
		Comparator<K> valueComparator = new Comparator<K>() {
			public int compare(K k1, K k2) {
				V v1 = map.get(k1);
				V v2 = map.get(k2);
				int compare = v1.compareTo(v2);
				if (compare == 0) {
					return 1;
				} else {
					return compare;
				}

			}
		};

		// Creating a new TreeMap
		Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
		sortedByValues.putAll(map);
		return sortedByValues;
	}
}