package com.java.w3schools.blog.arraylist.duplicate;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Removing duplicates from list using set.
 * 
 * @author venkatesh
 *
 */
public class RemovalUserDefinedObjects {

	public static void main(String[] args) {

		List<String> fewMonths = new ArrayList<>();
		fewMonths.add("JAN");
		fewMonths.add("FEB");
		fewMonths.add("MAR");
		fewMonths.add("APR");
		fewMonths.add("FEB");

		System.out.println("Duplicate List : " + fewMonths);

		List<String> newMonthsListWithoutDuplicates = fewMonths.stream().distinct().collect(Collectors.toList());
		System.out.println(newMonthsListWithoutDuplicates);

	}

}

/*Output:
	Duplicate List : [JAN, FEB, MAR, APR, FEB]
			[JAN, FEB, MAR, APR]
*/
