package com.java.w3schools.blog.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Example to ArrayList indexOf() exception examples.
 * 
 * @author javaprogramto.com
 *
 */
public class ArrayListIndexOfExceptionExamples {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee());
		list.add(new Employee());

		int indexCast = list.indexOf(new Address());

		int index = list.indexOf(null);

		System.out.println("Address indexOf : " + indexCast);
		System.out.println("null indexOf : " + index);

		List<Integer> numbersList = new ArrayList<Integer>();

		for (int i = 1; i <= 10; i++) {
			numbersList.add(null);

			numbersList.add(null);

			numbersList.add(null);

			numbersList.add(null);

			numbersList.add(null);
		}

		System.out.println("null values list size : " + numbersList.size());

		int nullIndexValue = numbersList.indexOf(null);
		System.out.println("null index value : " + nullIndexValue);

	}

}

class Employee {

}

class Address {

}