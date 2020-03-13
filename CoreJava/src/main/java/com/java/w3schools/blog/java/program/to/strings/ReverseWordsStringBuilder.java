package com.java.w3schools.blog.java.program.to.strings;

/**
 *
 * Reversing each word in string without loosing its initial order of the words.
 * 
 * @author javaprogramto.com
 *
 */
public class ReverseWordsStringBuilder {

	private static final String WHITESPACE_DELIMITER = " ";

	public static void main(String[] args) {

		System.out.println("Examples to reversing each word in a string inplace.");
		String input1 = "Welcome to the JavaProgramTo.com blog";
		String output1 = reverseWordsWithStringBuilder(input1);
		System.out.println(" input 1 : " + input1);
		System.out.println(" output 1 : " + output1);

		String input2 = "This is part of String interview programs";
		String output2 = reverseWordsWithStringBuilder(input2);
		System.out.println(" input 1 : " + input2);
		System.out.println(" output 2 : " + output2);

	}

	public static String reverseWordsWithStringBuilder(String input) {

		StringBuilder reversedFinalOutput = new StringBuilder();

		// splitting the input string by space.
		String[] words = input.split(WHITESPACE_DELIMITER);

		for (String word : words) {

			StringBuilder reversedWord = new StringBuilder();
			for (int i = word.length() - 1; i >= 0; i--) {
				reversedWord.append(word.charAt(i));
			}

			reversedFinalOutput.append(reversedWord).append(WHITESPACE_DELIMITER);

			// to clear the builder obj.
			// reversedWord.setLength(0);
		}

		String finalOutputStr = reversedFinalOutput.toString();

		return finalOutputStr;
	}

}
