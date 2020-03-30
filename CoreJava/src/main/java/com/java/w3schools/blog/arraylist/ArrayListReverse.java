package com.java.w3schools.blog.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * Reversing list using public static void reverse(List<?> list) -> Collections.reverse()
 * 
 * @author javaprogramto.com
 *
 */
public class ArrayListReverse {

	public static void main(String[] args) {
		ArrayList<String> yearsList = new ArrayList<String>(Arrays.asList("1720", "1820", "1920", "2020"));

		System.out.println("Original list before Reverse : " + yearsList);

		Collections.reverse(yearsList);

		System.out.println("Reversed list : " + yearsList);

	}

}
