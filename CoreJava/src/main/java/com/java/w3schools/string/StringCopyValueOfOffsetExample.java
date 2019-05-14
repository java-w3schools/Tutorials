package com.java.w3schools.string;

public class StringCopyValueOfOffsetExample {
	public static void main(String[] args) {

		char[] c = { 'j', 'a', 'v', 'a', '-', 'w', '3', 's', 'c', 'h', 'o', 'o', 'l', 's' };
		String strOffset = String.copyValueOf(c, 5, 90);

		System.out.println("Copy of array as String using offset and count arguments: " + strOffset);
	}
}
