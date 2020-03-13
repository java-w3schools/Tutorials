package com.java.w3schools.blog.string.programs.insertion;

public class StringInsertionUsingSubstring {

	public static void main(String[] args) {
		String output = insertStringAtPositionUsingSubString("java blog", 3, " w3schools");
		System.out.println(output);

	}

	/**
	 * Insert a String into another String in Java using String class substring
	 * method.
	 * 
	 * Url: http://java-w3schools.blogspot.com/
	 * 
	 * @param originalString
	 * @param position
	 * @param toBeInserted
	 * @return
	 */
	public static String insertStringAtPositionUsingSubString(String originalString, int position,
			String toBeInserted) {

		String first = originalString.substring(0, position + 1);
		String middle = toBeInserted;
		String last = originalString.substring(position + 1, originalString.length());
		
		String newString = first + middle + last;

		return newString;
	}

}
