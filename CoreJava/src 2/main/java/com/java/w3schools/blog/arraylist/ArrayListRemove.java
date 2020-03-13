package com.java.w3schools.blog.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListRemove {

	public static void main(String[] args) {

		// Creating arraylist
		List<String> values = new ArrayList<String>();

		// Adding values to ArrayList
		values.add("One");
		values.add("Two");
		values.add("Three");
		values.add("Four");
		values.add("Five");

		// Printing the values before removal
		System.out.println("Printing the values before removal " + values);

		// Iterating Iterator.

		Iterator it = values.iterator();
		while (it.hasNext()) {
			String value = (String) it.next();
			if (value.equals("Four")) {
				it.remove();
			}
		}

		System.out.println("Printing the values after removal " + values);

	}

}
