package com.java.w3schools.string;

public class StringEndswithExample {
	public static void main(String[] args) {
		String input1 = "java";
		String input2 = "w3schools";
		String input3 = "java-w3schools.blogspot.com";
		
		System.out.println("input1.endsWith(\"va\") :: "+input1.endsWith("va"));
		System.out.println("input2.endsWith(\"schools\") :: "+input2.endsWith("schools"));
		System.out.println("input2.endsWith(\"blogspot.com\") :: "+input3.endsWith("blogspot.com"));
	}
}
