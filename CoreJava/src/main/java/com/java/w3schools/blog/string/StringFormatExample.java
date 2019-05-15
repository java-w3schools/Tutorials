package com.java.w3schools.string;

public class StringFormatExample {
	public static void main(String[] args) {

		String blogName = "Java-W3schools blog";

		String format1 = String.format("String methods on website %s ", blogName);
		System.out.println("String formatted value: " + format1);

		// Float format
		String format2 = String.format("String methods on website %f9 ", 12.345f);
		System.out.println("Float formatted string value: " + format2);

	}
}