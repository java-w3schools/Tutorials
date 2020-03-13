package com.java.w3schools.blog.java.program.to.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Java Program To Find First Non-Repeated Character In String
 * 
 * @author JavaProgramTo.com
 *
 */
public class StringnonRepeatedProgram {

	public static void main(String[] args) {

		withlinkedHashMap("abcabd");

	}

	/**
	 * Using hashmap to store the each char as key and its count as value in it.
	 * 
	 * @param value
	 */
	private static void withHashMap(String value) {

		// Creating map instnace
		Map<Character, Integer> countsByChar = new HashMap<>();

		// converting string to char array
		char[] chars = value.toCharArray();

		//
		for (char c : chars) {

			if (countsByChar.get(c) == null) {
				countsByChar.put(c, 1);
			} else {
				countsByChar.put(c, countsByChar.get(c) + 1);
			}
		}

		boolean found = false;
		for (Entry<Character, Integer> entry : countsByChar.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println("First non repeated char : " + entry.getKey());
				found = true;
			}
		}

		if (!found) {
			System.out.println("No non repeating char");
		}

	}

	/**
	 * Using LinkedHashMap to store the each char as key and its count as value in it.
	 * 
	 * @param value
	 */
	private static void withlinkedHashMap(String value) {

		// Creating map instnace
		Map<Character, Integer> countsByChar = new LinkedHashMap<>();

		// converting string to char array
		char[] chars = value.toCharArray();

		//
		for (char c : chars) {

			if (!countsByChar.containsKey(c)) {
				countsByChar.put(c, 1);
			} else {
				countsByChar.put(c, countsByChar.get(c) + 1);
			}
		}

		boolean found = false;
		for (Entry<Character, Integer> entry : countsByChar.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println("First non repeated char : " + entry.getKey());
				found = true;
			}
		}

		if (!found) {
			System.out.println("No non repeating char");
		}

	}

}
