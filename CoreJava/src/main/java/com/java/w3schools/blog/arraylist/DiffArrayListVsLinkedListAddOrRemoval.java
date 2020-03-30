package com.java.w3schools.blog.arraylist;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class DiffArrayListVsLinkedListAddOrRemoval {

	public static void main(String[] args) {

		List<Integer> arraylist = new ArrayList<Integer>();

		// adding values
		for (int i = 0; i < 1000; i++) {
			arraylist.add(i);
		}

		long start = timeNow();
		arraylist.add(2, 25000);
		long end = timeNow();

		System.out.println("Time(ms) taken by ArrayList for adding : " + timeDiff(start, end));

		List<Integer> linkedlist = new LinkedList<Integer>();

		// adding values
		for (int i = 0; i < 1000; i++) {
			linkedlist.add(i);
		}

		start = timeNow();
		linkedlist.add(2, 25000);
		end = timeNow();

		System.out.println("Time(ms) taken by LinkedList for adding : " + timeDiff(start, end));
		System.out.println("arraylist size : " + arraylist.size());
		System.out.println("linkedlist size : " + linkedlist.size());

	}

	private static long timeDiff(long start, long end) {

		return end - start;
	}

	private static long timeNow() {
		return Calendar.getInstance().getTimeInMillis();
	}
}
