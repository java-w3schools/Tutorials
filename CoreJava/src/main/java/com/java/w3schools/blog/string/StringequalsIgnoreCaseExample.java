package com.java.w3schools.string;

public class StringequalsIgnoreCaseExample {
	public static void main(String[] args) {

		String str1 = "java";
		String str2 = "w3schools";

		String str3 = "JAVA";
		String str4 = "W3Schools";

		System.out.println("Comparing str1 and str3 using method equalsIgnoreCase : " + str1.equalsIgnoreCase(str3));
		System.out.println("Comparing str2 and str4 using method equalsIgnoreCase : " + str2.equalsIgnoreCase(str4));
	}
}