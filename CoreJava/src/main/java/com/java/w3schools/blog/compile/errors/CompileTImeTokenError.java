package com.java.w3schools.blog.compile.errors;

/**
 * Compile time error simulation example program.
 * 
 * @author Venkatesh
 *
 */
public class CompileTImeTokenError {

	// compile time error code. This code commented. Please uncommnet to see the
	// actual problem.

	/*
	 * String[] plaintext = new String[26]; for(int i = 0;i<26;i++) {
	 * System.out.println("Welcome to Java-w3schools blog"); }
	 */

	// Fix 1
	public static void main(String[] args) {
		String[] plaintext = new String[26];
		for (int i = 0; i < 26; i++) {
			System.out.println("Welcome to Java-w3schools blog");
		}
	}

	// Fix 2
	public boolean print() {
		String[] plaintext = new String[26];
		for (int i = 0; i < 26; i++) {
			System.out.println("Welcome to Java-w3schools blog");
		}
		return true;
	}

	// Fix 3
	{
		String[] plaintext = new String[26];
		for (int i = 0; i < 26; i++) {
			System.out.println("Welcome to Java-w3schools blog");
		}
	}
}
