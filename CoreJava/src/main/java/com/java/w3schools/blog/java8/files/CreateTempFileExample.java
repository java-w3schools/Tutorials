package com.java.w3schools.blog.java8.files;

import java.io.File;
import java.io.IOException;

/**
 * 
 * Java Examples to Create a Temporary File
 * 
 * @author venkateshn
 *
 */
public class CreateTempFileExample {

	public static void main(String[] args) {

		try {
			File tempFile = File.createTempFile("Test", null);
			System.out.println("Test.tmp file created in default location ");
			String fileLocation = tempFile.getAbsolutePath();
			System.out.println("Defalut temp location: " + fileLocation);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			File tempFile = File.createTempFile("Employee", ".csv");
			System.out.println("Employee.csv file created in default location ");
			String fileLocation = tempFile.getAbsolutePath();
			System.out.println("Defalut temp location: " + fileLocation);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			File tempFile = File.createTempFile("hello", ".txt", new File("files"));
			System.out.println("hello.txt file created in new location provided");
			String fileLocation = tempFile.getAbsolutePath();
			System.out.println("Checking the file location created : " + fileLocation);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
