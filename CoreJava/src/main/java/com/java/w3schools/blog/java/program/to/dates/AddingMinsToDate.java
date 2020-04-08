package com.java.w3schools.blog.java.program.to.dates;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

public class AddingMinsToDate {

	public static void main(String[] args) {

		// Adding 10 mins using Date constructor.
		Calendar date = Calendar.getInstance();
		System.out.println("Current Date and TIme : " + date.getTime());
		long timeInSecs = date.getTimeInMillis();
		Date afterAdding10Mins = new Date(timeInSecs + (10 * 60 * 1000));
		System.out.println("After adding 10 mins : " + afterAdding10Mins);
		printLine();

		// apache commons
		int addMinuteTime = 5;
		Date targetTime = Calendar.getInstance().getTime();
		System.out.println("Before Adding : " + targetTime);
		targetTime = DateUtils.addMinutes(targetTime, addMinuteTime); // add minute
		System.out.println("After adding targetTime : " + targetTime);
		printLine();

		Calendar currentTimeNow = Calendar.getInstance();
		System.out.println("Current time now : " + currentTimeNow.getTime());
		currentTimeNow.add(Calendar.MINUTE, 10);
		Date tenMinsFromNow = currentTimeNow.getTime();
		System.out.println("After adding 10 mins with Caleder add() method : " + tenMinsFromNow);
		printLine();

		// LocalDateTime Example
		LocalDateTime dateTime = LocalDateTime.now().plus(Duration.of(10, ChronoUnit.MINUTES));
		Date added10Mins = Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant());
		System.out.println("Java 8 added with 10 mins : " + added10Mins);
		printLine();

		ZonedDateTime addedTime = LocalDateTime.parse("2020-04-01 12:30".replace(" ", "T"))
				.atZone(ZoneId.of("Asia/Karachi")).plusMinutes(10);
		System.out.println("10 mins added : " + addedTime.toLocalDateTime());

	}

	public static void printLine() {
		System.out.println("----------------------------------------------------");
	}

}
