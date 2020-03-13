package com.java.w3schools.blog.string;

/**
 * Strint intern method example
 * 
 * @author Venkatesh
 *
 */
public class StringInternExample {

	public static void main(String[] args) {

		String str1 = "Welcome";
		String str2 = "Welcome";

		String internStr1 = str1.intern();
		String internStr2 = str2.intern();

		System.out.println("str1 : " + str1 + ", internStr1 : " + internStr1);
		System.out.println("str2 : " + str2 + ", internStr2 : " + internStr2);
		System.out.println(" -------------------------------");
		
		// equality
		String str3 = "java";
		String str4 = str3.intern();
		String str5 = "w3schools";
		String str6 = str5.intern();

		System.out.println("str3 == str4 : " + (str3 == str4));
		System.out.println("str5 == str6 : " + (str5 == str6));

		System.out.println(" -------------------------------");
		// String creation with new keyword

		String str7 = "java-w3schools";
		String str8 = str7.intern();
		String str9 = new String("java-w3schools");
		String str10 = str9.intern();

		System.out.println("str7 == str8 : " + (str7 == str8));
		System.out.println("str7 == str9 : " + (str7 == str9));
		System.out.println("str7 == str10 : " + (str7 == str10));
		System.out.println("str9 == str7 : " + (str9 == str7));
		System.out.println("str9 == str8 : " + (str9 == str8));
		System.out.println("str9 == str10 : " + (str9 == str10));
	}
}

/*Output:
	str1 : Welcome, internStr1 : Welcome
	str2 : Welcome, internStr2 : Welcome
	 -------------------------------
	str3 == str4 : true
	str5 == str6 : true
	 -------------------------------
	str7 == str8 : true
	str7 == str9 : false
	str7 == str10 : true
	str9 == str7 : false
	str9 == str8 : false
	str9 == str10 : false
*/