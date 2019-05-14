package com.java.w3schools.string;

public class StringConcatExample2 {
	public static void main(String[] args) {

		String string1 = "java";
		String string2 = "-";
		String string3 = "w3schools";
		String string4 = " blog";

		String finalString = string1.concat(string2).concat(string3).concat(string4);

		System.out.println("Concatenating multiple strings: " + finalString);
	}
}



