package com.java.w3schools.string;

public class StringConcatExample4 {
	public static void main(String[] args) {

		String str3 = "hello";
		String str4 = "";
		str3 = str3.concat(str4);
		System.out.println("If second string length is 0: " + str3);
		System.out.println("str3.equals(str4) :: " + str3.equals(str4));
	}
}