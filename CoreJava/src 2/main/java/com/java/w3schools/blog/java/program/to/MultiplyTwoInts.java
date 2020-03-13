package com.java.w3schools.blog.java.program.to;

/**
 * 
 * JavaProgramTo.com
 * 
 * Java Program to Multiply Two Numbers
 * 
 */
import java.util.Scanner;

public class MultiplyTwoInts {

	public static void main(String[] args) {

		// scanner is to read the input from keyboard
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two integer numbers: ");

		// reading first int number.
		int firstNumber = s.nextInt();

		// reading second int number.
		int secondNumber = s.nextInt();

		// calculating the product of the two int numbers.
		int multiplicationResult = firstNumber * secondNumber;

		// printing the final product.
		System.out.println("Final multiplication result : " + multiplicationResult);
		
		// This is optional to close scanner.
		s.close();
	}

}
