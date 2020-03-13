package com.java.w3schools.blog.arraylist.duplicate;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author venkatesh
 *
 */
public class ContainsDuplicate {

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

		List<String> duplicateList = new ArrayList<>();
		for (String fruitName : winterFruits) {
			if (summerFruits.contains(fruitName)) {
				duplicateList.add(fruitName);
			}
		}

		System.out.println("Duplicate List" + duplicateList);
	}

}

/*Output:
	Duplicate List[Plums, Grapefruit]
*/
