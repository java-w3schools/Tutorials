package com.java.w3schools.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreatingTempFileExample {

	public static void main(String[] args) {
		// Example program using BufferedWriter.
		File tempFile = null;
		BufferedWriter writer = null;
		try {
			// Creating ta temporary file in Temp directory.
			tempFile = File.createTempFile("MyTempFile", ".tmp");
			writer = new BufferedWriter(new FileWriter(tempFile));
			writer.write("Writing data into temp file!!!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (Exception ex) {
			}
		}
		System.out.println("Stored data in temporary file.");
		System.out.println("Temp file location: " + tempFile.getAbsolutePath());
	}

}
