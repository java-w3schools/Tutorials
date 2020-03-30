package com.java.w3schools.blog.arraylist;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class DiffArrayListVsLinkedList {

	public static void main(String[] args) {

		List<Integer> arraylist = new ArrayList<Integer>();

		long start = timeNow();

		for (int i = 0; i < 10000; i++) {
			arraylist.add(i);
		}

		long end = timeNow();

		System.out.println("Time(ms) taken by ArrayList for adding : " + timeDiff(start, end));

		List<Integer> linkedlist = new LinkedList<Integer>();

		start = timeNow();

		for (int i = 0; i < 10000; i++) {
			linkedlist.add(i);
		}

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
