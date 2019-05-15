package com.java.w3schools.array.programs;

/**
 * Java program to find all palindromes in a given range (min, max)
 * 
 * @author java-w3schools
 *
 */
public class PalindromesEx {

	public static void main(String[] args) {
		int min = 100;
		int max = 1500;

		printPal(min, max);
	}

	/**
	 * Returns true if the given num is palindrome
	 * 
	 * @param num
	 * @return
	 */
	private static boolean isPalindrome(int num) {
		// Reversing a number
		int reverse = 0;
		for (int i = num; i > 0; i /= 10)
			reverse = reverse * 10 + i % 10;

		// If num and reverse are same, then num is palindrome
		return num == reverse;
	}

	/**
	 * Prints palindrome between min and max
	 * 
	 * @param min
	 * @param max
	 */
	static void printPal(int min, int max) {
		for (int i = min; i <= max; i++)
			if (isPalindrome(i))
				System.out.print(i + " ");
	}
}
