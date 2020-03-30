package com.java.w3schools.blog.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Adding primitive int to ArrayList
 * 
 * @author javaprogramto.com
 *
 */
public class ArrayListAddPrimitiveIntegers {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);

		System.out.println("wrapper integers list values : " + l);

	}

}
