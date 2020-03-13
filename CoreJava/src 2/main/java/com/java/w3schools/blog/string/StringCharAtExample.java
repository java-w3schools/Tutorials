package com.java.w3schools.blog.string;

public class StringCharAtExample {
	public static void main(String[] args) {
		int count = 0;
		String input = "abbbccbbbc";
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'b') {
				count++;
			}
		}
		System.out.println("No. of occurances of b character is : " + count);
	}
}


