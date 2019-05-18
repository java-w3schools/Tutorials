package com.java.w3schools.blog.string.programs.insertion;

public class StringInsertion {

	public static void main(String[] args) {
		String output = insertStringAtPosition("java blog", 3, " w3schools");
		System.out.println(output);

	}

	/**
	 * Insert a String into another String in Java using normal approach
	 * 
	 * Url: http://java-w3schools.blogspot.com/
	 * 
	 * @param originalString
	 * @param position
	 * @param toBeInserted
	 * @return
	 */
	public static String insertStringAtPosition(String originalString, int position, String toBeInserted) {
		int startIndex = 0;
		int endIndex = originalString.length();
		String newString = "";

		for (int i = startIndex; i < endIndex; i++) {
			// Insert the original string character into the new string
			newString += originalString.charAt(i);

			if (i == position) {
				// Insert the string to be inserted into the new string
				newString += toBeInserted;
			}
		}

		return newString;
	}

}
