package com.java.w3schools.blog.java.program.to;

import java.util.Scanner;

public class EvenOddTernary {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number :");
		int number = scanner.nextInt();

		String numberType = (number % 2 == 0) ? "Even" : "Odd";
		System.out.println(number + " is " + numberType);

	}

}
