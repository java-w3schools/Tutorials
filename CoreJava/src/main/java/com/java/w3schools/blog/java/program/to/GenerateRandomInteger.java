package com.java.w3schools.blog.java.program.to;

import java.util.Random;

/**
 * 
 * java program to generate a integer random number using random.nextInt().
 * 
 * @author venkateshn
 *
 */
public class GenerateRandomInteger {

	public static void main(String[] args) {

		// creating a Random instance
		Random random1 = new Random();

		// Getting random number 1
		int randomValue1 = random1.nextInt(100);

		System.out.println("First random value with upper limit 100: " + randomValue1);

		// Getting random number 2
		int randomValue2 = random1.nextInt(200);
		System.out.println("Second random value with upper limit 200: " + randomValue2);

		// Getting random number 3
		int randomValue3 = random1.nextInt(5000);
		System.out.println("Third random value with upper limit 5000: " + randomValue3);
	}

}
