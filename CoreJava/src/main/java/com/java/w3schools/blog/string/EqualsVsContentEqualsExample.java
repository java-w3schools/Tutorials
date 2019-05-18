package com.java.w3schools.blog.string;

public class EqualsVsContentEqualsExample {
	public static void main(String[] args) {

		String string1 = "Hello"; // This is String 1
		String string2 = "Hello"; // This is String 2

		StringBuffer buffer1 = new StringBuffer("Hello"); // This is StringBuffer
		StringBuilder builder1 = new StringBuilder("Hello"); // This is StringBuilder

		// 1. Comparing String with String using equals method.

		boolean result1 = string1.equals(string2);
		System.out.println("Comparing String with String using equals method : " + result1);

		// 2. Comparing String with StringBuffer using equals method.

		boolean result2 = string1.equals(buffer1);
		System.out.println("Comparing String with StringBuffer using equals method : " + result2);

		// 3. Comparing String with String using contentEquals method.

		boolean result3 = string1.contentEquals(string2);
		System.out.println("Compare String with String using contentEquals method : " + result3);
		
		// 4. Comparing String with StringBuffer using contentEquals method.
		
		boolean result4 = string1.contentEquals(buffer1);
		System.out.println("Comparing String with StringBuffer using contentEquals method : " + result4);
		
		// 5. Compare String with StringBuilder using contentEquals method.
		
		boolean result5 = string1.contentEquals(builder1);
		System.out.println("Compare String with StringBuilder using contentEquals method : " + result5);
	}
}