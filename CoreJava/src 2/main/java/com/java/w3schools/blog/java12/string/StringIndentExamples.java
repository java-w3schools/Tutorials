package com.java.w3schools.blog.java12.string;

public class StringIndentExamples {
	public static void main(String[] args) {

		String value = "    indent";

		System.out.println(value);
		System.out.println(value.indent(5));

		System.out.println(value.indent(-2));

		value = "java-\nw3schools";
		System.out.println(value);
		System.out.println(value.indent(5));

		String inputNZero = "welcome";
		System.out.println(inputNZero.indent(0));
	}

}
