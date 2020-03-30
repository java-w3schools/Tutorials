package com.java.w3schools.blog.arraylist;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DiffArrayListVsLinkedListOrder {

	public static void main(String[] args) throws InterruptedException {

		List<String> coronaUSAStatesLinkedList = new LinkedList<String>();

		coronaUSAStatesLinkedList.add("New York");
		coronaUSAStatesLinkedList.add("California");
		coronaUSAStatesLinkedList.add("New Jersy");
		coronaUSAStatesLinkedList.add("Michigan");
		coronaUSAStatesLinkedList.add("Washington");

		System.out.println("LinkedList USA Corona states are : ");
		for (String coronaState : coronaUSAStatesLinkedList) {
			System.out.println(coronaState);
		}

		List<String> coronaUSAStatesArrayList = new ArrayList<String>();

		coronaUSAStatesArrayList.add("Massachusetts");
		coronaUSAStatesArrayList.add("Florida");
		coronaUSAStatesArrayList.add("Illinois");
		coronaUSAStatesArrayList.add("Louisiana");
		coronaUSAStatesArrayList.add("Pennsylvania");

		System.out.println(" \nArrayList USA Corona states are : ");
		for (String coronaState : coronaUSAStatesArrayList) {
			System.out.println(coronaState);
		}
		
		Iterator it = coronaUSAStatesArrayList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			coronaUSAStatesArrayList.add("Georgia");
		}

	}

	private static long timeDiff(long start, long end) {

		return end - start;
	}

	private static long timeNow() {
		return Calendar.getInstance().getTimeInMillis();
	}
}
