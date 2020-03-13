package com.java.w3schools.blog.java.program.to;

/**
 * 
 * Program to add two binary numbers in java using Integer API.
 * 
 * @author venkateshn
 *
 */
public class AddBinaryNumbersWay2 {

	public static void main(String[] args) {

		// two binary numbers in string format
		String binaryNumber1 = "10101", binaryNumber2 = "10001";

		// converting strings into binary format numbers 
		Integer integer1 = Integer.parseInt(binaryNumber1, 2);
		Integer integer2 = Integer.parseInt(binaryNumber2, 2);

		// adding two integers
		Integer output = integer1 + integer2;
		
		// converting final output back to Binary Integer
		System.out.println(Integer.toBinaryString(output));

	}

}
