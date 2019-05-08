package com.java.w3scools.blog.java12.string;

public class StringIndentExamples {
	public static void main(String[] args) {

		String value = "indent";

		System.out.println(value);
		System.out.println(value.indent(5));

		value = "java-\nw3schools";
		System.out.println(value);
		System.out.println(value.indent(5));
	}

}
