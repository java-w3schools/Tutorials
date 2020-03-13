package com.java.w3schools.blog.java8.date.time.api;

import java.time.LocalDate;
import java.time.chrono.MinguoDate;

/**
 * Example to convert local date to MinguoDate
 * 
 * @author venkateshn
 *
 */
public class LocalDateToMinguoDateExample {

	public static void main(String[] args) {

		System.out.println("Example One");
		MinguoDate minguo1 = MinguoDate.of(108, 7, 15);
		// LocalDate localDate = LocalDate.ofEpochDay(minguo2.toEpochDay());
		LocalDate localDate1 = LocalDate.from(minguo1);
		System.out.println("MinguoDate 1: " + minguo1); // 108-07-15
		System.out.println("LocalDate 1: " + localDate1); // 2019-07-15

		System.out.println("\nExample Two");
		MinguoDate minguo2 = MinguoDate.of(108, 7, 15);
		// LocalDate localDate = LocalDate.ofEpochDay(minguo2.toEpochDay());
		LocalDate localDate2 = LocalDate.from(minguo2);
		System.out.println("MinguoDate 2: " + minguo2); // 108-07-15
		System.out.println("LocalDate 2: " + localDate2); // 2019-07-15

	}
}
