package com.java.w3schools.string.join;

public class StringStripExample {
	public static void main(String[] args) {

		String input = "   hello   ";
		System.out.println("Input string length : " + input.length());
		String stripStr = input.stripTrailing();
		System.out.println("Stripped string length : " + stripStr.length());
		System.out.println("Input String :"+input);
		System.out.println("Output String :"+stripStr);
	}
}
