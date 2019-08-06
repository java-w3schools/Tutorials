
package com.java.w3schools.blog.java8.date.time.api;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * 
 * 
 * @author Venkatesh
 *
 */
public class TemporalAdjustersExample {

	public static void main(String[] args) {

		LocalDate now = LocalDate.now();
		System.out.println("Current date : " + now);

		LocalDate output = null;

		output = now.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("firstDayOfMonth :: " + output);

		output = now.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("firstDayOfNextMonth :: " + output);

		output = now.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println("firstDayOfNextYear :: " + output);

		output = now.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("firstDayOfYear :: " + output);

		output = now.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("lastDayOfYear :: " + output);

		output = now.with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.FRIDAY));
		System.out.println("dayOfWeekInMonth(1, DayOfWeek.FRIDAY) :: " + output);

		output = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("lastDayOfMonth :: " + output);

		output = now.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("lastDayOfYear :: " + output);

		// Creating a custom TemporalAdjuster to increment 10 days.

		TemporalAdjuster customAdjuster = (temporal) -> temporal.plus(Period.ofDays(10));

		LocalDate localDate = LocalDate.now();
		System.out.println("Date Before applying custom TemporalAdjuster : " + localDate);
		localDate = localDate.with(customAdjuster);
		System.out.println("Date After applying custom TemporalAdjuster : " + localDate);
	}

}

/**
 * Output: 
 * Current date : 2019-08-06
firstDayOfMonth :: 2019-08-01
firstDayOfNextMonth :: 2019-09-01
firstDayOfNextYear :: 2020-01-01
firstDayOfYear :: 2019-01-01
lastDayOfYear :: 2019-12-31
dayOfWeekInMonth(1, DayOfWeek.FRIDAY) :: 2019-08-02
lastDayOfMonth :: 2019-08-31
lastDayOfYear :: 2019-12-31
Date Before applying custom TemporalAdjuster : 2019-08-06
Date After applying custom TemporalAdjuster : 2019-08-16

 * 
 */

/**
 * 
 * Custom Implementation TemporalAdjuster.
 * 
 * @author Venkatesh
 *
 */
class CustomTemporalAdjuster implements TemporalAdjuster {

	@Override
	public Temporal adjustInto(Temporal temporal) {
		return temporal.plus(Period.ofDays(10));
	}

}