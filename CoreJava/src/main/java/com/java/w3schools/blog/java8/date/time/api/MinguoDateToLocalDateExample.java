package com.java.w3schools.blog.java8.date.time.api;

import java.time.LocalDate;
import java.time.chrono.MinguoDate;

/**
 * Example to convert local date to MinguoDate
 * 
 * @author venkatesh
 *
 */
public class MinguoDateToLocalDateExample {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.of(2025, 5, 7);
		MinguoDate minguo = MinguoDate.from(localDate);
		System.out.println("LocalDate 1: " + localDate); // 2025-05-07
		System.out.println("MinguoDate 1: " + minguo); // 114-05-07

		LocalDate localDate2 = LocalDate.of(2030, 5, 7);
		MinguoDate minguo2 = MinguoDate.from(localDate2);
		System.out.println("LocalDate 2: " + localDate2); // 2025-05-07
		System.out.println("MinguoDate 2: " + minguo2); // 114-05-07

	}

}
