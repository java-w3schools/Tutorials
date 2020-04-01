package com.java.w3schools.blog.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * Example compare two ArrayList for equality in Java.
 * 
 * @author javaprogramto.com
 *
 */
public class TwoArrayListEqualityExampleInJava8 {

	public static void main(String[] args) {

		// list 1
		List<String> list1 = new ArrayList<String>();
		list1.add("compare");
		list1.add("two");
		list1.add("lists");
		list1.add("in java 8");

		// list 2
		List<String> list2 = new ArrayList<String>();
		list2.add("compare");
		list2.add("two");
		list2.add("lists");
		list2.add("in java 8");

		List<String> unavailable = list1.stream().filter(e -> (list2.stream().filter(d -> d.equals(e)).count()) < 1)
				.collect(Collectors.toList());

		if (unavailable.size() == 0) {
			System.out.println("list1 and list2 all values same.");
		} else {
			System.out.println("list1 and list2 all values are not  same.");
		}

		list1.add("new value added");

		unavailable = list1.stream().filter(e -> (list2.stream().filter(d -> d.equals(e)).count()) < 1)
				.collect(Collectors.toList());

		if (unavailable.size() > 0) {
			System.out.println("list1 is modifed. so both lists are having different values");
		}

	}

}
