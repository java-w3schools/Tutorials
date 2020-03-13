package com.java.w3schools.blog.string;
/**
 * 
 * Java String API length() Method Example
 * 
 * @author Venkatesh
 *
 */
public class StringLengthExample {
	public static void main(String[] args) {
		
		// example 1
		String str = "java-w3schools";
		System.out.println(str.length());

		// example 2
		String pincode1 = "500001";

		if (pincode1.length() == 6) {
			System.out.println("given pincode " + pincode1 + " is valid");
		} else {
			System.out.println("given pincode " + pincode1 + " is not valid");
		}

		String pincode2 = "50000";

		if (pincode2.length() == 6) {
			System.out.println("given pincode " + pincode2 + " is valid");
		} else {
			System.out.println("given pincode " + pincode2 + " is not valid");
		}
		
		// example 3
		String blankStr = "     ";
		if(blankStr.trim().length() == 0) {
			System.out.println("Given String is empty");
		}
		
	}
}

/*Output:
	14
	given pincode 500001 is valid
	given pincode 50000 is not valid
	Given String is empty
*/