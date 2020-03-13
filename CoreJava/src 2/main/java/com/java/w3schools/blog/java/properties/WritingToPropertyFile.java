package com.java.w3schools.blog.java.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WritingToPropertyFile {

	public static void main(String[] args) {

		Properties properties = new Properties();
		properties.setProperty("country.india", "Delhi");
		properties.setProperty("country.australia", "Canberra");
		properties.setProperty("country.usa", "Washington");
		properties.setProperty("country.uae", "Abu Dhabi");
		properties.setProperty("country.newzealand", "Wellington");

		System.out.println("Writing the properties into a file");
		try (OutputStream output = new FileOutputStream("files/application.properties")) {

			properties.store(output, "This is Country-Capital's property file");

			System.out.println("Data stored into file");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
