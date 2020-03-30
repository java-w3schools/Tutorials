
package com.java.w3schools.blog.exceptions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 
 * ConcurrentModificationException Example
 * 
 * @author javaProgramTo.com
 *
 */

public class ConcurrentModificationExceptionHashMapExample {

	public static void main(String[] args) {

		Map<String, String> values = new HashMap<String, String>();

		values.put("Corona", "8000001");
		values.put("Ebola", "100000");
		values.put("Flu", "1B");

		Iterator<String> it = values.keySet().iterator();

		while (it.hasNext()) {
			String value = it.next();
			System.out.println(value);

			if (value.equals("Corona")) {
				values.put("COVID 19", "10,00,000");

			}

		}
	}

}
