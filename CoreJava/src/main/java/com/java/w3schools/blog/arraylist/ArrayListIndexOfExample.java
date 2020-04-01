package com.java.w3schools.blog.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Example to ArrayList indexOf() method.
 * 
 * @author javaprogramto.com
 *
 */
public class ArrayListIndexOfExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("1");
		list.add("2");
		list.add("3");
		list.add("3");
		list.add("4");
		list.add("1");
		list.add("2");
		list.add("5");
		list.add("7");
		list.add("8");

		int index4 = list.indexOf("4");

		System.out.println("Inde 4 : " + index4);

		int index3 = list.indexOf("3");

		System.out.println("Repeated value 3 index " + index3);

		int noMatch = list.indexOf("100");

		System.out.println("100 exits check : " + noMatch);

		int index8 = list.indexOf("8");
		
		System.out.println("index of value 8 is : " + index8);

	}

}
