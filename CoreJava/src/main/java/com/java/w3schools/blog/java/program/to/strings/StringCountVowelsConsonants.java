package com.java.w3schools.blog.java.program.to.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * Java Program To Count Vowels and Consonants in a String
 * 
 * @version JavaProgramTo.com
 */
public class StringCountVowelsConsonants {

	public static void main(String[] args) {

		String input = "Welcome To The Java String Programming Article";

		List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		input = input.toLowerCase();

		int countVowels = 0;
		int countCOnsonants = 0;

		for (int index = 0; index < input.length(); index++) {

			char currentChar = input.charAt(index);
			if (vowels.contains(currentChar)) {
				countVowels++;
			} else if (currentChar >= 'a' && currentChar <= 'z') {
				countCOnsonants++;
			}
		}

		System.out.println("Total count of vowels : " + countVowels);
		System.out.println("Total count of consonants : " + countCOnsonants);
	}
}