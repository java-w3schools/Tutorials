package com.java.w3schools.blog.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapExamples {

	public static void main(String[] args) {

		// creating map
		HashMap<String, String> map = new HashMap<>();

		// with preallocated capacity
		HashMap<String, String> mapWithCapacity = new HashMap<>(200);

		// From already existing map
		HashMap<String, String> mapFromExistingMap = new HashMap<>(map);

		// with capacity and load factor
		HashMap<String, String> mapWithFactor = new HashMap<>(100, 0.5f);

		// creating map
		HashMap<String, String> idNamesMap = new HashMap<>();

		idNamesMap.put("100", "Jhon");
		idNamesMap.put("200", "Paul");
		idNamesMap.put("300", "Tina");
		idNamesMap.put("400", "Chunn");
		idNamesMap.put("500", "menoj");

		System.out.println("idNamesMap : " + idNamesMap);
		HashMap<String, String> newIdNamesMap = new HashMap<>();
		newIdNamesMap.put("600", "Zumba");
		newIdNamesMap.putAll(idNamesMap);

		System.out.println("newIdNamesMap : " + newIdNamesMap);

		String value1 = newIdNamesMap.get("200");
		System.out.println("value 1 : " + value1);

		String value2 = newIdNamesMap.get("300");
		System.out.println("value 2 : " + value2);

		String value3 = newIdNamesMap.get("600");
		System.out.println("value 3 : " + value3);

		String nullValue = newIdNamesMap.get("800");
		System.out.println("nullValue : " + nullValue);

		String defaultValueNotFound = newIdNamesMap.getOrDefault("800", "Eight Hundread");
		System.out.println("Get default vaue example key not found: " + defaultValueNotFound);

		String defaultValueFound = newIdNamesMap.getOrDefault("400", "Four Hundread");
		System.out.println("Get default vaue example : " + defaultValueFound);

		String nullkeyValue = newIdNamesMap.get(null);
		System.out.println("nullkeyValue : " + nullkeyValue);

		String removedValueForkey500 = newIdNamesMap.remove("500");
		System.out.println("Removed value for the key 500 : " + removedValueForkey500);

		String removedValueForkey1000 = newIdNamesMap.remove("1000");
		System.out.println("Removed value for key 1000 : " + removedValueForkey1000);

		// newIdNamesMap.clear();

		int size = newIdNamesMap.size();

		System.out.println("Size after calling clear() method : " + size);

		boolean key500exists = idNamesMap.containsKey("500");
		boolean key900exists = idNamesMap.containsKey("900");

		System.out.println("key 500 exists : " + key500exists);
		System.out.println("key 900 exists : " + key900exists);

		boolean valueZumbaexists = idNamesMap.containsKey("Zumba");
		boolean valueBalajiexists = idNamesMap.containsKey("Balaji");

		System.out.println("value Zumba exists : " + valueZumbaexists);
		System.out.println("value Balaji exists : " + valueBalajiexists);

		Set<String> keysSet = newIdNamesMap.keySet();
		System.out.println("keysSet : " + keysSet);

		newIdNamesMap.put("1000", "google");
		System.out.println("Checking modifications in keysSet : " + keysSet);

		Collection<String> valuesCollection = newIdNamesMap.values();
		System.out.println("values  : " + valuesCollection);

		newIdNamesMap.put("2000", "bing");
		System.out.println("Checking modifications in Collection: " + valuesCollection);

		// compute examples.

		String returnedValue = newIdNamesMap.compute("300",
				(k, v) -> (v == null ? "value is null" : "key " + k + " value is : " + v));

		System.out.println("compute returnedValue : " + returnedValue);

		String returnedValueNull = newIdNamesMap.compute("8900",
				(k, v) -> (v == null ? "value is null" : "key " + k + " value is : " + v));

		System.out.println("compute returnedValue for key 8900 : " + returnedValueNull);

		System.out.println("map values after calling compute(): " + newIdNamesMap);

		String returnedValueKeyPresent = newIdNamesMap.computeIfPresent("400", (k, v) -> (v + " updated"));

		System.out.println("returnedValueKeyPresent : " + returnedValueKeyPresent);

		String returnedValueKeyNotPresent = newIdNamesMap.computeIfAbsent("4500", (k) -> ("4500 added"));

		System.out.println("returnedValueKeyPresent : " + returnedValueKeyNotPresent);

		System.out.println("Chages to original map : " + newIdNamesMap);

		HashMap<Integer, String> freshMap = new HashMap<>();

		freshMap.put(100, "Jhon");
		freshMap.put(200, "Paul");
		freshMap.put(300, "Tina");
		freshMap.put(400, "Chunn");
		freshMap.put(500, "menoj");

		freshMap.replace(500, "500");
		freshMap.replace(700, "700");

		System.out.println("freshMap : " + freshMap);

		freshMap.replace(100, "Jhon", "100");
		freshMap.replace(200, "Jhon", "200");

		System.out.println("freshMap : " + freshMap);

		freshMap.replaceAll((k, v) -> k + v);

		System.out.println("freshMap : " + freshMap);

		freshMap.forEach((k, v) -> System.out.println("key : " + k + ", value : " + v));

	}

}
