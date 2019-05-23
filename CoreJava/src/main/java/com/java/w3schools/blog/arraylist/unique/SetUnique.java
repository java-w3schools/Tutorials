package com.java.w3schools.blog.arraylist.unique;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * @author venkatesh
 *
 */
public class SetUnique {

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

		winterFruits.addAll(summerFruits);
		Set<String> uniqueValues = new LinkedHashSet<>(winterFruits);

		System.out.println("Unique List" + uniqueValues);
	}

}

/*Output:
 * Unique List[Clementine, Plums, Dates, Grapefruit, Kiwi, Mango, Watermelon, Papaya]
*/
