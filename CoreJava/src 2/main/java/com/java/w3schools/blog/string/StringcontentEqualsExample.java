package com.java.w3schools.blog.string;

public class StringcontentEqualsExample {
	public static void main(String[] args) {

		String string1 = "String One"; // This is String 1
		String string2 = "String Two"; // This is String 2
		String string3 = "String Three"; // This is String 3

		StringBuffer buffer1 = new StringBuffer("String One"); // This is StringBuffer 1
		StringBuffer buffer2 = new StringBuffer("String Two"); // This is StringBuffer 1
		StringBuffer buffer3 = new StringBuffer("String Three"); // This is StringBuffer 1
		
		// invoking contentEquals(StringBuffer sb) method
		
		boolean result1 = string1.contentEquals(buffer1);
		System.out.println("Result of comparing conents of string1 with buffer1 : "+result1);
		
		boolean result2 = string2.contentEquals(buffer2);
		System.out.println("Result of comparing conents of string2 with buffer2 : "+result2);
		
		boolean result3 = string3.contentEquals(buffer3);
		System.out.println("Result of comparing conents of string3 with buffer3 : "+result3);
		
		boolean result4 = string1.contentEquals(buffer3);
		System.out.println("Result of comparing conents of string1 with buffer3 : "+result4);
	}
}