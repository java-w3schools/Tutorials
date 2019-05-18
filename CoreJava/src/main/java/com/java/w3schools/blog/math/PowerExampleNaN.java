package com.java.w3schools.blog.math;

/**
 * Program to work with NaN exponent with pow method.
 * 
 * @author java-w3school
 *
 */
public class PowerExampleNaN {
	public static void main(String[] args) {
		powNaNExponent(12);
	}

	/**
	 * Method to see if the exponent is NaN what will be the output and how pow
	 * method behaves.
	 * 
	 * @param baseValue
	 */
	private static void powNaNExponent(double baseValue) {
		// Declaring base and exponenet variable and values
		double base = baseValue;
		double exponent = Double.NaN;

		// setting output to 1 by default.
		double output = Math.pow(baseValue, exponent);

		System.out.println(base + " power of " + exponent + " is " + output);
	}
}
