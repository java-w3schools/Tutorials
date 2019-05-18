package com.java.w3schools.blog.exceptions;

public class UnknownFormatConversionExceptionMethods {

	public static void main(String[] args) {

		try {
			String welcomeNote = String.format("Hello, Mr %# : Welcome to JavaW3schools blog :  ", "Billy");
			System.out.println("Welcome Note : " + welcomeNote);
		} catch (java.util.UnknownFormatConversionException ex) {
			System.out.println("getMessage method value: " + ex.getMessage());
		}
	}
}
