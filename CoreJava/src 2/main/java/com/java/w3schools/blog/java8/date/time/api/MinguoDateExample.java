package com.java.w3schools.blog.java8.date.time.api;

import java.time.LocalDate;
import java.time.chrono.MinguoDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 * 
 * MinguoDate now(), minus(), plus(), with() methods
 * 
 * @author venkateshn
 *
 */
public class MinguoDateExample {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();
		System.out.println("Local Date : " + localDate);

		MinguoDate minguoDate = MinguoDate.now();
		System.out.println("Current MinguoDate : " + minguoDate);

		MinguoDate minusDate = minguoDate.minus(10, ChronoUnit.DAYS);
		System.out.println("Minus 10 days date : " + minusDate);

		MinguoDate plusDate = minguoDate.plus(10, ChronoUnit.DAYS);
		System.out.println("Plus 10 days date : " + plusDate);

		MinguoDate firstDayOfNextMonth = minguoDate.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("First day of next month date : " + firstDayOfNextMonth);

	}

}
