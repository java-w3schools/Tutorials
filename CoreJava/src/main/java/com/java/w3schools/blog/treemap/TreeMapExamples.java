package com.java.w3schools.blog.treemap;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExamples {

	public static void main(String[] args) {
		Map<Integer, String> treeMap = new TreeMap<>();

		treeMap.put(300, "Three Hundred");
		treeMap.put(400, "Four Hundred");
		treeMap.put(100, "One Hundred");
		treeMap.put(200, "Two Hundred");

		System.out.println("sorted treemap : " + treeMap);

		Map<Integer, Float> reverseOrder = new TreeMap<>(Collections.reverseOrder());

		reverseOrder.put(300, 300f);
		reverseOrder.put(400, 400f);
		reverseOrder.put(100, 100f);
		reverseOrder.put(200, 200f);

		System.out.println("Desending order of treemap : " + reverseOrder);

	}

}
