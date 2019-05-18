package com.java.w3schools.blog.string.programs.insertion;

public class StringInsertionUsingStringBuffer {

	public static void main(String[] args) {
		String originalStringValue = "java blog";
		String newStringToBeinserted =" w3schools";
		String output = insertStringAtPositionUsingStringBuffer(originalStringValue, 3, newStringToBeinserted);
		System.out.println("originalStringValue :"+originalStringValue);
		System.out.println("newStringToBeinserted :"+newStringToBeinserted);
		System.out.println("Final String : "+output);

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

/*Output:
	
	originalStringValue :java blog
	newStringToBeinserted : w3schools
	Final String : java w3schools blog
*/
