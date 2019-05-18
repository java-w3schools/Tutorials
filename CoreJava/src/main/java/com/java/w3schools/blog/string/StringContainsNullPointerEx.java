package com.java.w3schools.blog.string;

public class StringContainsNullPointerEx {
	public static void main(String[] args) {

		String input = "Michael Jackson Became The King Of Pop";

		if (input.contains("King")) {
			System.out.println("Yes, Michael Jackson is The King Of Pop");
		} else {
			System.out.println("Noone will say Michael Jackson is not The King Of Pop");
		}
	}
}