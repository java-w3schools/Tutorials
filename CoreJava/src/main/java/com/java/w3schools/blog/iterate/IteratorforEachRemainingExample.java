package com.java.w3schools.blog.iterate;

import java.util.ArrayList;

/**
 * 
 * ArrayList Iterate forEachRemaining Example
 * 
 * @author JavaProgramTo.com
 *
 */

public class IteratorforEachRemainingExample {

	public static void main(String[] args) {

		ArrayList<String> countries = new ArrayList<String>();

		countries.add("Candada");
		countries.add("UK");
		countries.add("India");
		countries.add("USA");


		countries.iterator().forEachRemaining( country -> System.out.println(country));
	}

}
