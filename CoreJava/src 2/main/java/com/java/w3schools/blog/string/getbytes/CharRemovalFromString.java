package com.java.w3schools.blog.string.getbytes;

public class CharRemovalFromString {

	public static void main(String[] args) {
		String string = "Jhonny Jhonny Yes Papa";

		// replace method
		String newString = string.replace("n", "");
		System.out.println("newString: " + newString);

		// removing all spaces
		String removeAllSpaces = string.replace(" ", "");
		System.out.println("removeAllSpaces: " + removeAllSpaces);

		// StringBuilder
		StringBuilder builder = new StringBuilder("Jhonny Jhonny Yes Papa");
		builder.deleteCharAt(2);
		String builderString = builder.toString();
		System.out.println("builderString: " + builderString);

		// substring
		String newSubString = string.substring(0, 2) + string.substring(3, string.length());
		System.out.println("newSubString: " + newSubString);

		// Reg expression
		String regexString = string.replaceFirst("(?s)(.{2}).(.*)", "$1$2");
		System.out.println("regexString: " + regexString);

		// removing all lower case letters
		String removeLowecase = string.replaceAll("([a-z])", "");
		System.out.println("removeLowecase: " + removeLowecase);

	}

}
/*
Output:
	
	newString: Jhoy Jhoy Yes Papa
	removeAllSpaces: JhonnyJhonnyYesPapa
	builderString: Jhnny Jhonny Yes Papa
	newSubString: Jhnny Jhonny Yes Papa
	regexString: Jhnny Jhonny Yes Papa
	removeLowecase: J J Y P
*/
