package com.java.w3schools.java12.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MismatchExampleSameContent {

	public static void main(String[] args) {
		try {
			Path filePath1 = Files.createTempFile("my-file", ".txt");
			Path filePath2 = Files.createTempFile("my-file2", ".txt");
			Files.writeString(filePath1, "This is a text file 1");
			Files.writeString(filePath2, "This is a text file 2 for testing");

			long diff = Files.mismatch(filePath1, filePath2);

			System.out.println("file1.txt and file2.txt are non identical");
			System.out.println("Found different character at index: " + diff);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
