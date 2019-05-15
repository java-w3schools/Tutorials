package com.java.w3schools.string.programs;

import java.util.ArrayList;
import java.util.List;

public class RemoveVowelsExample {

	public static void main(String[] args) {

		String content = "Hello, Welcome to Java-w3schools blog";
		String output = deleteVowels(content);
		System.out.println("String after removing vowels: " + output);
	}

	/**
	 * Deletes all vowels from the given string.
	 * 
	 * @param content
	 * @return
	 */
	private static String deleteVowels(String content) {

		List<Character> al = new ArrayList<Character>();
		// Adding vowels to arraylist.
		al.add('a');
		al.add('e');
		al.add('i');
		al.add('o');
		al.add('u');
		
		StringBuffer sb = new StringBuffer(content);
		for (int i = 0; i < sb.length(); i++) {
			if (al.contains(sb.charAt(i))) {
				sb.replace(i, i + 1, "");
				i--;
			}
		}
		return sb.toString();
	}

}
