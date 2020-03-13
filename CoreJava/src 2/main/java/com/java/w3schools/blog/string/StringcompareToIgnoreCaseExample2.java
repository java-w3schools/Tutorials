package com.java.w3schools.blog.string;

public class StringcompareToIgnoreCaseExample2 {
	public static void main(String[] args) {

		String str1 = "world"; // lower case
		String str2 = "WORLD"; // Upper cas
		String str3 = "WorlD"; // Both upper and lower cases

		System.out.println("Comparing str1 and str2: " + str1.compareToIgnoreCase(str2));
		System.out.println("Comparing str2 and str3: " + str2.compareToIgnoreCase(str3));
		System.out.println("Comparing str3 and str1: " + str3.compareToIgnoreCase(str1));

		// All these three Comparisions will be treated as values are equal. Because this method ignores the case types. 
	}
}
