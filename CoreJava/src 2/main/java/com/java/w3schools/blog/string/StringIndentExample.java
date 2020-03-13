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
		System.out.println("--- For n positive ---");
		System.out.println(input);
		// positive n
		String output1 = input.indent(5);
		System.out.println(output1);
		
		System.out.println("--- checking lengths ---");
		System.out.println(input.length());
		System.out.println(output1.length());

		// negative n
		System.out.println("--- For n negetive ---");
		String output2 = output1.indent(-5);
		System.out.println(output2);
		
		// n value 0
		System.out.println("--- For n zero ---");
		String output3 = input.indent(0);
		System.out.println(output3);
		
		
		// With Line terminators
		System.out.println("--- With Line Termination Characters ---");
		String lineTerminatorsInput = "Welcome to Java 12 new methods \n 1. indent \n 2.transform \n many";
		String lineTerminatorsOutput = lineTerminatorsInput.indent(3);
		System.out.println("lineTerminatorsInput : \n"+lineTerminatorsInput);
		System.out.println("lineTerminatorsOutput : \n"+lineTerminatorsOutput);
		
	}
}

/*Output:
	--- For n positive ---
	I am Venkatesh
	     I am Venkatesh

	--- checking lengths ---
	14
	20
	--- For n negetive ---
	I am Venkatesh

	--- For n zero ---
	I am Venkatesh

	--- With Line Termination Characters ---
	lineTerminatorsInput : 
	Welcome to Java 12 new methods 
	 1. indent 
	 2.transform 
	 many
	lineTerminatorsOutput : 
	   Welcome to Java 12 new methods 
	    1. indent 
	    2.transform 
	    many

*/