package com.java.w3schools.string;

public class StringCopyValueOfExample {
	public static void main(String[] args) {

		char[] c = { 'j', 'a', 'v', 'a' };
		String str = String.copyValueOf(null);

		System.out.println("Copy of array as String : " + str);
	}
}
