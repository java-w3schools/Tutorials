package com.java.w3schools.blog.java.program.to.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.codehaus.jackson.map.AnnotationIntrospector.Pair;

/**
 * 
 * Java Program To Count Vowels and Consonants in a String
 * 
 * @version JavaProgramTo.com
 */
public class StringCountVowelsConsonantsJava8 {

	public static void main(String[] args) {

		String input = "ANother input with special characters : ! @ # $ % ^ & * ( ) ";

		List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		input = input.toLowerCase();

		long countVowels = 0;
		long countCOnsonants = 0;

		countVowels = input.chars().filter(curretChar -> vowels.contains((char) curretChar)).count();

		countCOnsonants = input.chars().filter(curretChar -> !vowels.contains((char) curretChar))
				.filter(nonVowelCh -> (nonVowelCh >= 'a' && nonVowelCh <= 'z')).count();

		Pair<Long, Long> result = Pair.of(countVowels, countCOnsonants);

		System.out.println("Total count of vowels : " + countVowels);
		System.out.println("Total count of consonants : " + countCOnsonants);

		System.out.println("Pair object : " + result);
	}
}
