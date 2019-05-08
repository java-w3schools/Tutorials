package com.java.w3scools.blog.java12.string;

public class StringIndentExamples {
	public static void main(String[] args) {

		indentString();
	}

	public static void indentString() {
		String value = "java-\nw3schools";
		System.out.println(value);
		System.out.println(value.indent(5));
	}
}

