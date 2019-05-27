package com.java.w3schools.blog.arraylist.duplicate;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Removing duplicates from list using set.
 * 
 * @author venkatesh
 *
 */
public class RemovalUsingNewList {

	public static void main(String[] args) {

		List<String> fewMonths = new ArrayList<>();
		fewMonths.add("JAN");
		fewMonths.add("FEB");
		fewMonths.add("MAR");
		fewMonths.add("APR");
		fewMonths.add("FEB");

		System.out.println("Duplicate List : " + fewMonths);

		List<String> newList = new ArrayList<>();

		for (String month : fewMonths) {

			if (!newList.contains(month)) {
				newList.add(month);
			}
		}

		System.out.println("newList is " + newList);

	}

}

/*Output:
	Duplicate List : [JAN, FEB, MAR, APR, FEB]
			newList is [JAN, FEB, MAR, APR]
*/