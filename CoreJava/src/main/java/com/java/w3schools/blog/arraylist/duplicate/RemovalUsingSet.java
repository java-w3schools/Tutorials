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
public class RemovalUsingSet {

	public static void main(String[] args) {

		List<String> fewMonths = new ArrayList<>();
		fewMonths.add("JAN");
		fewMonths.add("FEB");
		fewMonths.add("MAR");
		fewMonths.add("APR");
		fewMonths.add("FEB");

		System.out.println("Duplicate List : " + fewMonths);

		Set<String> afterRemovingDuplicates = new LinkedHashSet<>(fewMonths);

		System.out.println("After removing duplicates : " + afterRemovingDuplicates);

	}

}

/*Output:
	Duplicate List : [JAN, FEB, MAR, APR, FEB]
			After removing duplicates : [JAN, FEB, MAR, APR]
*/