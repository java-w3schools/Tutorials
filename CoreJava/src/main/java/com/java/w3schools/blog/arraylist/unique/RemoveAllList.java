package com.java.w3schools.blog.arraylist.unique;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author venkatesh
 *
 */
public class RemoveAllList {

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

		
		List<String> copyOfWinterFruits = new ArrayList<>(winterFruits);
		copyOfWinterFruits.retainAll(summerFruits);
		
		winterFruits.removeAll(copyOfWinterFruits);
		summerFruits.removeAll(copyOfWinterFruits);
		
		winterFruits.addAll(summerFruits);
		winterFruits.addAll(copyOfWinterFruits);

		System.out.println("Unique List" + winterFruits);
	}

}

/*Output:
 * Unique List[Clementine, Dates, Kiwi, Mango, Watermelon, Papaya, Plums, Grapefruit]
 */
