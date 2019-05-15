package com.java.w3schools.string;

public class StringisEmptyExample {
	public static void main(String[] args) {

		String area = "new york";

		// Checking area is empty or not.
		boolean isBlank = area.isBlank();
		
		System.out.println("Is area "+area+" empty : "+isBlank);

		// If string has no character.
		String noArea = "";
		isBlank = noArea.isBlank();
		System.out.println("is noArea empty : "+isBlank);
		
		// If string has no character.
		String noAreaSpaces = "  ";
		isBlank = noAreaSpaces.isBlank();
		System.out.println("is noAreaSpaces empty : "+isBlank);
		
		System.out.println("\nString noAreaSpaces size :: "+noAreaSpaces.length());

	}
}
