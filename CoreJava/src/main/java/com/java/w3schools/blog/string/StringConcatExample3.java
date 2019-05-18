package com.java.w3schools.blog.string;

public class StringConcatExample3 {
	public static void main(String[] args) {

		String string1 = "java-w3schools";
		String finalString = "blogspot.com".concat(string1);
		System.out.println("Concatenating at begining of existing string: " + finalString);

	}
}