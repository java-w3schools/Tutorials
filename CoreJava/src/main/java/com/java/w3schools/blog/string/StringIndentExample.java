package com.java.w3schools.blog.string;

/**
 * Example program on Java 12 String new indent(int n) method.
 * 
 * @author Venkatesh
 *
 */
public class StringIndentExample {

	public static void main(String[] args) {

		String input = "I am Venkatesh";
		System.out.println(input);
		// positive n
		String output1 = input.indent(5);
		System.out.println(output1);
		
		System.out.println(input.length());
		System.out.println(output1.length());

		// negative n
		String output2 = output1.indent(-5);
		System.out.println(output2);
		
		// n value 0
		String output3 = input.indent(0);
		System.out.println(output3);
		
		
		// With Line terminators
		String lineTerminatorsInput = "Welcome to Java 12 new methods \n 1. indent \n 2.transform \n many";
		String lineTerminatorsOutput = lineTerminatorsInput.indent(3);
		System.out.println("lineTerminatorsInput : \n"+lineTerminatorsInput);
		System.out.println("lineTerminatorsOutput : \n"+lineTerminatorsOutput);
		
	}
}
