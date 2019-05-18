package com.java.w3schools.blog.string;

public class StringStripExample {

	public static void main(String[] args) {

		String content = "java  w3schools";
		String stripContent = content.strip();
		System.out.println("stripContent : " + stripContent);
		
		System.out.println("content content: " + content.length());
		System.out.println("stripContent content: " + stripContent.length());
		

	}
}
