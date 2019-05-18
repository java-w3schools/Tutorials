package com.java.w3schools.blog.string.indexof;

public class IndexOfExamples {

	public static void main(String[] args) {
		String string = "find string";

		// indexOf​(int ch)
		int index = string.indexOf('z');
		System.out.println("index for chat d: " + index);

		// indexOf​(int ch, int fromIndex)
		index = string.indexOf('i', 4);
		System.out.println("index for chat d: " + index);

		// lastIndexOf​(int ch)
		index = string.lastIndexOf('i');
		System.out.println("last index for char i: " + index);

		// lastIndexOf​(int ch, int fromIndex)
		index = string.lastIndexOf('i', 3);
		System.out.println("last index for char i: " + index);

		String newString = "hello java, welcome to java w3schools blog";
		// indexOf​(String str)
		index = newString.indexOf("java");
		System.out.println("string \"java\" index found at: " + index);

		// indexOf​(String str, int fromIndex)
		index = newString.indexOf("java", 9);
		System.out.println("string \"java\" index found at: " + index);

		// lastIndexOf​(String str)
		index = newString.lastIndexOf("java");
		System.out.println("lastIndexOf: string \"str\" index found at: " + index);

		// lastIndexOf​(String str, int fromIndex)
		index = newString.lastIndexOf("java", 9);
		System.out.println("lastIndexOf: string \"str\" index found at: " + index);

	}

}

/*
Output:
	
	index for chat d: -1
	index for chat d: 8
	last index for char i: 8
	last index for char i: 1
	string "java" index found at: 6
	string "java" index found at: 23
	lastIndexOf: string "str" index found at: 23
	lastIndexOf: string "str" index found at: 6
*/