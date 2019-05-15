package com.java.w3schools.blog.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * Compare two arraylist contents and store unmatched contents in another arraylist.
 * Two lists are having string contents.
 * 
 * Link: https://java-w3schools.blogspot.com
 * 
 */
public class UnmatchedListExample {

	public static void main(String[] args) {

		// List 1 contains file names from 1 to 8.
		List<String> list1 = new ArrayList<>();
		list1.add("File Name 1");
		list1.add("File Name 2");
		list1.add("File Name 3");
		list1.add("File Name 4");
		list1.add("File Name 5");
		list1.add("File Name 6");
		list1.add("File Name 7");
		list1.add("File Name 8");

		// List 2 contains only even number file names.
		List<String> list2 = new ArrayList<>();
		list2.add("File Name 2");
		list2.add("File Name 4");
		list2.add("File Name 6");
		list2.add("File Name 8");

		list1.removeAll(list2);

		System.out.println(list1);
	}

}
/*
Output:
	[File Name 1, File Name 3, File Name 5, File Name 7]
*/