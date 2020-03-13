package com.java.w3schools.blog.java.program.to.java8.datetime;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * 
 * TemporalAdjuster example
 * 
 * @author JavaProgramTo.com
 *
 */
public class TemporalAdjusterExample {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();

		System.out.println("Current Date : " + localDate);

		// get first day of the month
		LocalDate firstDayOfMonth = localDate.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("firstDayOfMonth : " + firstDayOfMonth);

		// get first day of next month
		LocalDate firstDayOfNextMonth = localDate.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("firstDayOfNextMonth : " + firstDayOfNextMonth);

		// first day of the year
		LocalDate firstDayOfYear = localDate.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("firstDayOfYear : " + firstDayOfYear);

	}

}
