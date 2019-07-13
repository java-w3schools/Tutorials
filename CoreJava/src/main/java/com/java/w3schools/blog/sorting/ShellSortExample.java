package com.java.w3schools.blog.sorting;

import java.util.Arrays;

/**
 * Shell Sort program in Java
 * 
 * @author Venkatesh
 *
 */
public class ShellSortExample {

	public static void main(String[] args) {

		int[] array = { 50, 2, 5, 1, 49 };
		System.out.println("Input Array = " + Arrays.toString(array));
		shellsort(array);
		System.out.println("After shell sort =  " + Arrays.toString(array));

	}

	/* function to sort arr using shellSort */
	static int shellsort(int arr[]) {
		int n = arr.length;

// Start with a big gap, then reduce the gap
		for (int gap = n / 2; gap > 0; gap /= 2) {

// Do a gapped insertion sort for this gap size. he first gap elements
// a[0..gap-1] are already in gapped order keep adding one more element until
// the entire array is gap sorted
			for (int i = gap; i < n; i += 1) {
// add a[i] to the elements that have been gap sorted save a[i] in temp and make
// a hole at position i
				int temp = arr[i];

// shift earlier gap-sorted elements up until the correct location for a[i] is
// found
				int j;
				for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
					arr[j] = arr[j - gap];
				}

// put temp (the original a[i]) in its correct location
				arr[j] = temp;
			}
			System.out.println("After current gap(" + gap + ") :  " + Arrays.toString(arr));
		}
		return 0;
	}

}

/*
 * Output:
 * 
 * Input Array = [50, 2, 5, 1, 49] After current gap(2) : [5, 1, 49, 2, 50]
 * After current gap(1) : [1, 2, 5, 49, 50] After shell sort = [1, 2, 5, 49, 50]
 */