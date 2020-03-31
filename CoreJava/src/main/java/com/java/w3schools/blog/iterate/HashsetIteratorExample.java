package com.java.w3schools.blog.iterate;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * HashSet Iterate Example
 * 
 * @author JavaProgramTo.com
 *
 */

public class HashsetIteratorExample {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();

		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);

		Iterator<Integer> it = set.iterator();

		while (it.hasNext()) {
			int value = it.next();
			System.out.println(value);
			it.remove();
		}

	}

}
