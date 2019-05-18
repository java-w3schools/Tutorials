package com.java.w3schools.blog.java12.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MismatchExample {

	public static void main(String[] args) {
		Path path1 = Paths
				.get("C:\\workspace\\Demo-Java-11\\file1.txt");
		Path path2 = Paths
				.get("C:\\workspace\\Demo-Java-11\\file2.txt");

		try {
			long diff = Files.mismatch(path1, path2);

			if (diff == -1L) {
				System.out.println("file1.txt and file2.txt files are having identical content");
			} else {
				System.out.println("file1.txt and file2.txt are non identical");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
