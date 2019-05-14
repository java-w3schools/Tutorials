package com.java.w3schools.array.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EntendArrayLength {

	public static void main(String[] args) {

		// case 1: Arrays.copyOf

		/*
		 * int[] srcArray = new int[] { 1, 2, 3, 4, 5, 6 }; int newLength = 10; int[]
		 * destArray = Arrays.copyOf(srcArray, newLength);
		 * System.out.println("input array :"); printArray(srcArray);
		 * System.out.println("Destination array: "); printArray(destArray);
		 */

		int newElementToAdd = 7;
		Integer[] srcArray = new Integer[] { 1, 2, 3, 4, 5, 6 };
		Integer[] destArray = addElementUsingArrayList(srcArray, newElementToAdd);
		printArray(destArray);
	}

	private static void printArray(Integer[] values) {
		for (Integer i : values) {
			System.out.print(i + " ");
		}
	}

	/**
	 * Adds the given elementToAdd value at the end of the given array. This method
	 * creates internally a new array.
	 * 
	 * @param srcArray
	 * @param elementToAdd
	 * @return
	 */
	public Integer[] addElementUsingArraysCopyOf(Integer[] srcArray, int elementToAdd) {
		Integer[] destArray = Arrays.copyOf(srcArray, srcArray.length + 1);
		destArray[destArray.length - 1] = elementToAdd;
		return destArray;
	}

	/**
	 * Adds the given elementToAdd to Array using ArrayList internally.
	 * 
	 * @param srcArray
	 * @param elementToAdd
	 * @return
	 */
	public static Integer[] addElementUsingArrayList(Integer[] srcArray, int newElementToAdd) {
		Integer[] destArray = new Integer[srcArray.length + 1];
		List<Integer> arrayList = new ArrayList<>(Arrays.asList(srcArray));
		arrayList.add(newElementToAdd);
		return arrayList.toArray(destArray);
	}

	/**
	 * Copies given elments into new array by adding elementToAdd using System.arraycopy method.
	 * 
	 * @param srcArray
	 * @param elementToAdd
	 * @return
	 */
	public Integer[] addElementUsingSystemArrayCopy(Integer[] srcArray, int elementToAdd) {
		Integer[] destArray = new Integer[srcArray.length + 1];
		System.arraycopy(srcArray, 0, destArray, 0, srcArray.length);
		destArray[destArray.length - 1] = elementToAdd;
		return destArray;
	}

}
