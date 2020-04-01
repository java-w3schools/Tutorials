package com.java.w3schools.blog.java.program.to.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 
 * Java 8 Streams Collectors API.
 * 
 * @version JavaProgramTo.com
 */
public class StringCountVowelsConsonantsJavaCollectors {

	public static void main(String[] args) {

		String input = "This is using Collectors api methods !!!!";

		List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		input = input.toLowerCase();

		IntStream stream = input.chars();

		Map<Boolean, Long> finalResultMap = stream.mapToObj(ch -> (char) ch).filter(ch -> (ch >= 'a' && ch <= 'z'))
				.collect(Collectors.partitioningBy(ch -> vowels.contains(ch), Collectors.counting()));

		System.out.println("Total count of vowels : " + finalResultMap.get(new Boolean(true)));
		System.out.println("Total count of consonants : " + finalResultMap.get(new Boolean(false)));

		System.out.println("finalResultMap map : " + finalResultMap);
	}
}