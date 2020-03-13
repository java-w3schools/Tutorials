package com.java.w3schools.blog.java.program.to.java8.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 
 * Java program to ZonedDateTime
 * 
 * @author JavaProgramTo.com
 *
 */
public class ZonedDateTimeExample {

	public static void main(String[] args) {

		LocalDateTime currentDateTime = LocalDateTime.now();

		System.out.println("India current DateTime : " + currentDateTime);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss");

		ZonedDateTime zonedDateTime = currentDateTime.atZone(ZoneId.of("Australia/Sydney"));

		System.out.println("Aus Zoned time : " + formatter.format(zonedDateTime));

		ZoneId zoneId = zonedDateTime.getZone();
		System.out.println("zone id : " + zoneId);

		ZonedDateTime pstZoneTime = zonedDateTime.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
		System.out.println("PST time now : " + formatter.format(pstZoneTime));
	}

}
