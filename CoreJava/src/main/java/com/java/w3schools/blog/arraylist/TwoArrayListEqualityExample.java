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
public class TwoArrayListEqualityExample {

	public static void main(String[] args) {

		// list 1
		List<String> listA = new ArrayList<String>();
		listA.add("double");
		listA.add("int");
		listA.add("float");
		listA.add("linkedlist");

		// list 2
		List<String> listB = new ArrayList<String>();
		listB.add("double");
		listB.add("int");
		listB.add("float");
		listB.add("linkedlist");

		// comparing two lists
		boolean isEqualAllValues = listA.containsAll(listB);
		System.out.println(isEqualAllValues);
		
	}

}
