package com.java.w3schools.blog;

public class StringIsBlankExample {

	public static void main(String[] args) {

		// 1. Empty
		String java11Str1 = "";
		System.out.println("java11 string 1 is blank :: " + java11Str1.isBlank());
		
		//2. Single white space
		String java11Str2 = " ";
		System.out.println("java11 string 2 is blank :: " + java11Str2.isBlank());
		
		//3. Multiple white spaces
		String java11Str3 = "   ";
		System.out.println("java11 string 3 is blank :: " + java11Str3.isBlank());
		
		//4. With value
		String java11Str4 = "hello";
		System.out.println("java11 string 4 is blank :: " + java11Str4.isBlank());
		
		String java11Str5 = "world";
		if(!java11Str5.equals("") || java11Str5.trim().length() != 0) {
			System.out.println("String is non empty");
		}
	}
}
