package com.java.w3schools.string;

public class StringContainsExample {
	public static void main(String[] args) {

		String value1 = "Welcome to java-w3schools blog";
		String value2 = "w3schools";
		String value3 = "java";
		String value4 = "venkatesh";

		System.out.println("value1 : "+value1);
		System.out.println("value2 : "+value2);
		System.out.println("value3 : "+value3);

		// We will search now value2 is present in value1.
		System.out.println("Value1 contains value2 : " + value1.contains(value2));
		
		// We will search now value3 is present in value1.
		System.out.println("Value1 contains value3 : " + value1.contains(value3));
		
		// We will search now value4 is present in value1.
		System.out.println("Value1 contains value4 : " + value1.contains(value4));
	}
}