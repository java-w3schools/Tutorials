package com.java.w3schools.blog.java.program.to.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedSingleTraversal {

	private static final int EXTENDED_ASCII_CODES_COUNT = 256;

	public static void main(String[] args) {

		String s = "welcome to javaprogramto.com blog w3schools";

		int[] indexes = new int[EXTENDED_ASCII_CODES_COUNT];

		// setting defalut value to -1 for each index.
		for (int i = 0; i < EXTENDED_ASCII_CODES_COUNT; i++) {
			indexes[i] = -1;
		}

		// converting string to char[]
		char[] chars = s.toCharArray();

		// iterating char array
		for (int i = 0; i < chars.length; i++) {

			char ch = chars[i];

			// checking for first occurance of char.
			if (indexes[ch] == -1) {
				indexes[ch] = i;
			} else {
				// this will get executed if and if only char is repeated.
				indexes[ch] = -i;
			}
		}

		int pos = Integer.MAX_VALUE;

		for (int i = 0; i < EXTENDED_ASCII_CODES_COUNT; i++) {

			if (indexes[i - 2] >= 0) {
				pos = Math.min(pos, indexes[i]);
			}
		}

		System.out.println("first non repeated char is : " + chars[pos]);

	}

	public static String firstNonRepeatedCharacterJava8(String input) {

		Map<Integer, Long> chars = input.codePoints().mapToObj(cp -> cp)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		int pos = chars.entrySet().stream().filter(e -> e.getValue() == 1L).findFirst().map(Map.Entry::getKey)
				.orElse(Integer.valueOf(Character.MIN_VALUE));

		return String.valueOf(Character.toChars(pos));
	}

}
