package com.java.w3schools.blog.string;

public class StringcontentEqualsExample2 {
	public static void main(String[] args) {
		
		String string1 = "One"; // This is String 1
		String string2 = "Two"; // This is String 2
		String string3 = "Three"; // This is String 3

		StringBuilder builder1 = new StringBuilder("One"); // This is StringBuilder 1
		StringBuilder builder2 = new StringBuilder("Two"); // This is StringBuilder 1
		StringBuilder builder3 = new StringBuilder("Three"); // This is StringBuilder 1

		// invoking contentEquals(StringBuilder sb) method

		boolean result1 = string1.contentEquals(builder1);
		System.out.println("Result of comparing conents of string1 with builder1 : " + result1);

		boolean result2 = string2.contentEquals(builder2);
		System.out.println("Result of comparing conents of string2 with builder2 : " + result2);

		boolean result3 = string3.contentEquals(builder3);
		System.out.println("Result of comparing conents of string3 with builder3 : " + result3);

		boolean result4 = string1.contentEquals(builder3);
		System.out.println("Result of comparing conents of string1 with buffer3 : " + result4);
	}
}