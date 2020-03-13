package com.java.w3schools.blog.java.program.to;

/**
 * 
 * Program to add two binary numbers in java
 * 
 * @author venkateshn
 *
 */
public class AddBinaryNumbers {

	public static void main(String[] args) {

		// two binary numbers
		long binaryNumber1 = 10101, binaryNumber2 = 10001;

		// i represents the index of the finalSumOutput array.
		int i = 0;
		
		// carry which is to hold the value of carry.
		int carry = 0;

		// Created int array to hold the output binary number
		int[] finalSumOutput = new int[10];

		while (binaryNumber1 != 0 || binaryNumber2 != 0) {

			finalSumOutput[i++] = (int) (carry + (binaryNumber1 % 10 + binaryNumber2 % 10) % 2);

			carry = (int) ((binaryNumber1 % 10 + binaryNumber2 % 10 + carry) / 2);

			binaryNumber1 = binaryNumber1 / 10;
			binaryNumber2 = binaryNumber2 / 10;
		}
		if (carry != 0) {
			finalSumOutput[i++] = carry;
		}
		--i;
		System.out.print("Output: ");
		// printing from the last index to 0.
		while (i >= 0) {
			System.out.print(finalSumOutput[i--]);
		}
		System.out.print("\n");
		
		
	}

}
