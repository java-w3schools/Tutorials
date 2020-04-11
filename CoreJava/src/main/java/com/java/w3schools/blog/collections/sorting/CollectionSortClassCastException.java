package com.java.w3schools.blog.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * Collections.sort() example to sort List of Strngs.
 * 
 * @author JavaProgramTo.com
 *
 */
public class CollectionSortClassCastException {

	public static void main(String[] args) {

		List values = new ArrayList();

		values.add("Singapore");
		values.add(737);
		values.add(2323f);

		Collections.sort(values);

	}

}
