package com.java.w3schools.blog.string;

public class StringcodePointAtExample {
	public static void main(String[] args) {

		String input = "VENKATESH";
		int value = input.codePointAt(4);
		System.out.println("Code point value at index 4 is "+value);
	}
}
