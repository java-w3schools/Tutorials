package com.java.w3schools.blog.string;

/**
 * Java String API regionMatches​() Method Example
 * 
 * @author Venkatesh
 *
 */
public class StringRegionMatchesExample {

	public static void main(String[] args) {

		// Example 1
		String str1 = "welcome to java-w3schools blog";
		String otherStr = "java";
		boolean isMatch = str1.regionMatches(11, otherStr, 0, 4);

		if (isMatch) {
			System.out.println("Substrings are matched");
		} else {
			System.out.println("Substrings are not matched");
		}

		// Example 2: Case Ignore
		String str2 = "WELCOME TO JAVA-W3SCHOOLS BLOG";
		String otherStr2 = "java";
		isMatch = str2.regionMatches(true, 11, otherStr2, 0, 4);

		if (isMatch) {
			System.out.println("Substrings are matched");
		} else {
			System.out.println("Substrings are not matched");
		}

	}

}

/*Output:
	
	Substrings are matched
	Substrings are matched
*/