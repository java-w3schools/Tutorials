package com.java.w3schools.blog.array.programs;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumbersForLoop {

	/**
	 * Prints all unique numbers for the array arr using HashSet
	 * 
	 * @param arr
	 */
	static void printUnique(int arr[]) {
		// Creating a empty Hashset instances which is used to store the values of
		// array.
		Set<Integer> values = new HashSet<Integer>();

		// Getting array length.
		int length = arr.length;

		System.out.print("Priting unique values using Hashmap for the given array: ");
		// Iterating array using for loop.
		for (int i = 0; i < length; i++) {
			if (!values.contains(arr[i])) {
				values.add(arr[i]);
				System.out.print(arr[i] + " ");
			}

		}

	}

	// Main Driver Program
	public static void main(String[] args) {
		int arr[] = { 23, 46, 54, 33, 14, 19, 23, 33, 99, 14 };
		printUnique(arr);

	}
}
