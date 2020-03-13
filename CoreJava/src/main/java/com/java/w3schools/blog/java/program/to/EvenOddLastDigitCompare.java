package com.java.w3schools.blog.java.program.to;

import java.util.Scanner;

public class EvenOddLastDigitCompare {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number :");
		int number = scanner.nextInt();

		int firstDigit = number % 10;

		if (firstDigit == 0 || firstDigit == 2 || firstDigit == 4 || firstDigit == 6 || firstDigit == 8) {

			System.out.println(number + " is even");
		} else {
			System.out.println(number + " is odd");
		}
	}

}
