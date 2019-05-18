package com.java.w3schools.blog.string;

public class StringcodePointAtExample2 {
	public static void main(String[] args) {

		String input = "JAVA-W3SCHOOLS";

		for (int i = 0; i < input.length(); i++) {
			System.out.println("Code point value at index " + i + " is " + input.codePointAt(i));
		}
	}
}
