package com.java.w3schools.string;

public class StringConcatExample {
	public static void main(String[] args) {

		String value1 = "java";
		String value2 = "w3schools";
		System.out.println("Value1 and value2 values before concatenating");
		System.out.println("Value1 : " + value1);
		System.out.println("Value2 : " + value2);

		value2 = value1.concat(value2);

		System.out.println("Value2 after concatenating value1: " + value2);
	}
}