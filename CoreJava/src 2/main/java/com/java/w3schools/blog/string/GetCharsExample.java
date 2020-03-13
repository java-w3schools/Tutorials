package com.java.w3schools.blog.string;

/**
 * Java String getChars() method example
 * @author venkatesh
 *
 */
public class GetCharsExample {

	public static void main(String[] args) {
	
		String srcString = "java-string-api";
		char[] destArray = new char[10];
		
		int srcBeiginIndex = 5;
		int srcEndIndex = srcString.length();
		
		int destArrayStartInex = 0;
		
		srcString.getChars(srcBeiginIndex, srcEndIndex, destArray, destArrayStartInex);
		System.out.println("Input String : "+srcString);
		System.out.print("Destination char array contents : ");
		for(char c : destArray) {
			System.out.print(c);
		}
		
		

	}

}

/* Output:
Input String : java-string-api
Destination char array contents : string-api*/