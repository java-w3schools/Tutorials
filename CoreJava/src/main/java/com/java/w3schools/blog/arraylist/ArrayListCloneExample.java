package com.java.w3schools.blog.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Java ArrayList Clone Example
 * 
 * @author Java8Example blog
 *
 */
public class ArrayListCloneExample {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("give");

		System.out.println("Before clone : " + list);

		ArrayList clonedLis = (ArrayList) list.clone();
		
		System.out.println("After clone : "+clonedLis);

	}

}
