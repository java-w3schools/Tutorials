package com.java.w3schools.blog.iterate;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 
 * HashMap Iterate Example
 * 
 * @author JavaProgramTo.com
 *
 */

public class HashMapIteratorExample {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "");
		map.put(2, "");
		map.put(3, "");
		map.put(1, "");

		Iterator<Integer> it = map.keySet().iterator();

		while (it.hasNext()) {
			int value = it.next();
			System.out.println("key : " + value);
		}

	}

}
