package com.java.w3scools.blog.string.programs;

public class StringInsertionUsingStringBuffer {

	public static void main(String[] args) {
		String output = insertStringAtPositionUsingStringBuffer("java blog", 3, " w3schools");
		System.out.println(output);

	}

	/**
	 * Insert a String into another String in Java using StringBuffer class insert
	 * method.insert method takes offset value which is the index where the new
	 * string to be inserted and the string toBeInserted.
	 * 
	 * Url: http://java-w3schools.blogspot.com/
	 * 
	 * @param originalString
	 * @param position
	 * @param toBeInserted
	 * @return
	 */
	public static String insertStringAtPositionUsingStringBuffer(String originalString, int position,
			String toBeInserted) {

		StringBuffer buffer = new StringBuffer(originalString);
		buffer.insert(position + 1, toBeInserted);
		String newString = buffer.toString();

		return newString;
	}
}
