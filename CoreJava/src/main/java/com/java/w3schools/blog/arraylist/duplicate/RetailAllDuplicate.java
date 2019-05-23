package com.java.w3schools.blog.arraylist.duplicate;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author venkatesh
 *
 */
public class RetailAllDuplicate {

	public static void main(String[] args) {
		List<String> winterFruits = new ArrayList<>();
		winterFruits.add("Clementine");
		winterFruits.add("Plums");
		winterFruits.add("Dates");
		winterFruits.add("Grapefruit");
		winterFruits.add("Kiwi");

		List<String> summerFruits = new ArrayList<>();
		summerFruits.add("Mango");
		summerFruits.add("Plums");
		summerFruits.add("Watermelon");
		summerFruits.add("Papaya");
		summerFruits.add("Grapefruit");

		winterFruits.retainAll(summerFruits);
		
		System.out.println("Duplicate List" + winterFruits);
	}

}
/*
Output:
	Duplicate List[Plums, Grapefruit]
*/
