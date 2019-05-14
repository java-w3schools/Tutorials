package com.java.w3schools.math;

/**
 * Program to print the power for the given base and exponent using while loop
 * 
 * @author java-w3school
 *
 */
public class PowerExample {
	public static void main(String[] args) {
		powerOfANumberForLoop(10, 3);
		powerOfANumberForLoop(6, 3);
		powerOfANumberForLoop(15, 3);
	}

	/**
	 * Prints the power of the given combination using for loop.
	 * 
	 * @param baseValue
	 * @param exponentValue
	 */
	private static void powerOfANumberForLoop(int baseValue, int exponentValue) {
		// Declaring base and exponenet variable and values
		int base = baseValue;
		int exponent = exponentValue;

		// setting output to 1 by default.
		long output = 1;

		int actualExponent = exponent;

		// for loop until exponent becomes 0
		for (; exponent != 0; --exponent) {
			output *= base;
		}

		System.out.println(base + " power of " + actualExponent + " is " + output);
	}
}
