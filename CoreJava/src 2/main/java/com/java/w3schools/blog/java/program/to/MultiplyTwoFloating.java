package com.java.w3schools.blog.java.program.to;

/**
 * 
 * JavaProgramTo.com
 * 
 * Java Program to Multiply Two Floating Numbers
 * 
 */
import java.util.Scanner;

public class MultiplyTwoFloating {

	public static void main(String[] args) {

		// scanner is to read the input from keyboard
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two floating numbers: ");

		// reading first float number.
		float firstNumber = s.nextFloat();

		// reading second float number.
		float secondNumber = s.nextFloat();

		// calculating the product of the two int numbers.
		float multiplicationResult = firstNumber * secondNumber;

		// printing the final product.
		System.out.println("Final multiplication result : " + multiplicationResult);

		// This is optional to close scanner.
		s.close();
	}

}
