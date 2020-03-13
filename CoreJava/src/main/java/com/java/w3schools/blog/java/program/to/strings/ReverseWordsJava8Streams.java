package com.java.w3schools.blog.java.program.to.strings;

import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * Reversing each word in string without loosing its initial order of the words
 * using java 8 stream with functional style.
 * 
 * @author javaprogramto.com
 *
 */
public class ReverseWordsJava8Streams {

	// pattern matches to the given delimiter (" ")
	private static final Pattern pattern = Pattern.compile(" +");

	public static void main(String[] args) {

		System.out.println("Java 8 program : ");
		String input1 = "java pattern and stream api";
		String output1 = reverseWordsWithStringBuilder(input1);
		System.out.println(" output 1 : " + output1);

		String input2 = "reversing using java 8 streams";
		String output2 = reverseWordsWithStringBuilder(input2);
		System.out.println(" output 2 : " + output2);

		String str = String.valueOf(Character.toChars(128140));
		System.out.println("128140 : " + str);

		str = String.valueOf(Character.toChars(128148));
		System.out.println("128148 : " + str);

		str = String.valueOf(Character.toChars(128149));
		System.out.println("128149 : " + str);

		System.out.println("str length : " + str.length());
		System.out.println("str codepoints : " + str.codePoints().count());

		System.out.println("Code point at index 0 : " + str.codePointAt(0));
		System.out.println("Code point at index 1 : " + str.codePointAt(1));

	}

	public static String reverseWordsWithStringBuilder(String input) {

		// step 1: converting input string into stream.
		Stream<String> stream = pattern.splitAsStream(input);

		// step 2: reversing each word.
		Stream<StringBuilder> intermeidateOutput = stream.map(word -> new StringBuilder(word).reverse());

		// step 3: merging all reversed words with empty space " "
		String reversedInput = intermeidateOutput.collect(Collectors.joining(" "));

		return reversedInput;
	}

}
