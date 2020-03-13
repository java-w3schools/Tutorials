package com.java.w3schools.blog.string;

public class StringEqualsExample {
	public static void main(String[] args) {
		String input1 = "hello";
		String input2 = "world";
		String input3 = "hello";
		
		// input 1 and 2 
		if (input1.equals(input2)) {
			System.out.println("Both input 1 and input 2 are matched");
		} else {
			System.out.println("input 1 and input 2 are not same");
		}

		// input 1 and 3 
		if (input1.equals(input3)) {
			System.out.println("Both input 1 and input 3 are matched");
		} else {
			System.out.println("input 1 and input 3 are not same");
		}
	}
}
