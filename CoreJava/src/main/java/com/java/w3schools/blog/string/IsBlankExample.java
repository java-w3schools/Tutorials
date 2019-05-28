package com.java.w3schools.blog.string;

/**
 * Java 11 Strig API isBlank method example
 * 
 * @author Venkatesh
 *
 */
public class IsBlankExample {

	public static void main(String[] args) {

		String input = " java-w3schools ";
		boolean isBlank = input.isBlank();
		System.out.println(isBlank);
		
		String input2 = "";
		isBlank = input2.isBlank();
		System.out.println(isBlank);
		
		String input3 = "   ";
		isBlank = input3.isBlank();
		System.out.println(isBlank);
	}
}

/*Output:
	false
	true
	true
*/