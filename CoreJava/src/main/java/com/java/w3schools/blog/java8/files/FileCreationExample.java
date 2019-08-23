package com.java.w3schools.blog.java8.files;

import java.io.File;
import java.io.IOException;

/**
 * 
 * Java Examples to Create New Empty File |
 * 
 * @author venkateshn
 *
 */
public class FileCreationExample {

	public static void main(String[] args) {
		File newFile = new File("newfile.txt");
		boolean isFileCreated = false;
		try {
			isFileCreated = newFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (isFileCreated) {
			System.out.println("New blank file created.");
		} else {
			System.out.println("File already exits");
		}

	}

}
