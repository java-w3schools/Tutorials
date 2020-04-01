package com.java.w3schools.blog.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Example compare two ArrayList for equality in Java.
 * 
 * @author javaprogramto.com
 *
 */
public class TwoArrayListEqualityContainsAllExample {

	public static void main(String[] args) {

		// list 1
		List<String> listOne = new ArrayList<String>();
		listOne.add("super");
		listOne.add("this");
		listOne.add("overlaoding");
		listOne.add("overriding");

		// list 2
		List<String> listTwo = new ArrayList<String>();
		listTwo.add("super");
		listTwo.add("this");
		listTwo.add("overlaoding");
		listTwo.add("overriding");

		// comparing two lists
		boolean isEqual = listOne.containsAll(listTwo);
		System.out.println(isEqual);
		
	}

}
