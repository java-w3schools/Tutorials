package com.java.w3schools.blog.string.programs;

public class RemoveVowelsReplaceAll {

	public static void main(String[] args) {

		String content = "You are reading a Java program to delete vowels in a given string";
		String output = removeVowels(content);
		System.out.println("ReplaceAll: removing vowels: " + output);
	}

	/**
	 * Replaces all vowels with empty string.
	 * 
	 * @param content
	 * @return
	 */
	private static String removeVowels(String content) {
		return content.replaceAll("[aeiouAEIOU]", "");
	}

}
