
package com.java.w3schools.blog.exceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * ConcurrentModificationException Example
 * 
 * @author javaProgramTo.com
 *
 */

public class ConcurrentModificationExceptionExample {

	public static void main(String[] args) {

		List<String> values = new ArrayList<String>();

		values.add("Corona");
		values.add("Ebola");
		values.add("Flu");

		Iterator<String> it = values.iterator();

		while (it.hasNext()) {
			String value = it.next();
			System.out.println(value);

			if (value.equals("Corona")) {
				values.add("VOVID 19");

			}

		}
	}

}
