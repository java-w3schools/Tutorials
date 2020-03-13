package com.java.w3schools.blog.string;

public class StringIsNumeric {

	public static void main(String[] args) {
		boolean containsDigit = false;
		String input = "12abc45";
		if (input != null && !input.isEmpty()) {
			for (char c : input.toCharArray()) {
				containsDigit = Character.isDigit(c);
				if (!containsDigit) {
					break;
				}
			}
		}

		if (containsDigit) {
			System.out.println(input + " is a Number");
		} else {
			System.out.println(input + " is not a Number");
		}
	}

}
