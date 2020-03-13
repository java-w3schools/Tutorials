package com.java.w3schools.blog.string;

/**
 * Java String API replace() Method Example
 * 
 * @author Venkatesh
 *
 */
public class StringReplaceExample {

	public static void main(String[] args) {
		// Example 1: replace char by char

		String str1 = "w3schools";
		String replacedStr1 = str1.replace('3', '2');
		System.out.println("Replaced String : "+replacedStr1);
		
		// Example 2: Multiple occurrences
		String str3 = "Welcome to Java-W3scools blog";
		String replacedStr3 = str3.replace('o', 'e');
		System.out.println("Multiple occurrences replacement done : "+replacedStr3);
		
		// Example 3: replace String by String.

		String str2 = "Java-W3schools";
		String replacedStr2 = str2.replace("oo", "i");
		System.out.println("Replaced String : "+replacedStr2);
		
		// Example 4: Multiple occurrences
		String str4 = "Welcome to Java-W3scools blog for Java developers";
		String replacedStr4 = str4.replace("Java", "OOPS");
		System.out.println("Multiple occurrences replacement done : "+replacedStr4);

	}

}

/*Output:
	Replaced String : w2schools
	Multiple occurrences replacement done : Welceme te Java-W3sceels bleg
	Replaced String : Java-W3schils
	Multiple occurrences replacement done : Welcome to OOPS-W3scools blog for OOPS developers*/

