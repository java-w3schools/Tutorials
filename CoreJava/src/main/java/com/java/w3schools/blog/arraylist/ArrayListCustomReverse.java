package com.java.w3schools.blog.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * ArrayList Custom reverse
 * 
 */
public class ArrayListCustomReverse {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(60);
		numbers.add(70);
		numbers.add(80);
		numbers.add(90);

		System.out.println("Original list : " + numbers);

		List<Integer> reversedList = new ArrayList<Integer>(numbers.size());

		for (int i = numbers.size() - 1; i >= 0; i--) {

			reversedList.add(numbers.get(i));
		}

		System.out.println("Reversed list with custom approach : " + reversedList);
		System.out.println("Checking the Original list : " + numbers);
	}

}
