package com.java.w3schools.blog.string;

public class StringcompareToIgnoreCaseExample1 {
	public static void main(String[] args) {
		String str1 = "java-w3schools";
		String str2 = "JAVA-W3SCHOOLS";
		System.out.println("compareTo Demo: str1.compareTo(str2) : "+str1.compareTo(str2));
		System.out.println("compareToIgnoreCase Demo: str1.compareToIgnoreCase(str2) : "+str1.compareToIgnoreCase(str2));
	}
}

