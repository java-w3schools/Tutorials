package com.java.w3schools.blog.exceptions;

public class UnknownFormatConversionException {

	public static void main(String[] args) {
		String name = "Jhon";
		int age = 20;

		String formatedStr = String.format("Name : %s, Age : %d", name, age);
		System.out.println("formatedStr : " + formatedStr);

		String welcomeNote = String.format("Hello, Mr %# : Welcome to JavaW3schools blog :  ", "Billy");
		System.out.println("Welcome Note : " + welcomeNote);
	}
}
