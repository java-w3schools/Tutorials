package com.java.w3schools.blog.java12.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MismatchExampleSameFile {

	public static void main(String[] args) {
		Path path1 = Paths
				.get("C:\\workspace\\Demo-Java-11\\file1.txt");
		Path path2 = Paths
				.get("C:\\workspace\\Demo-Java-11\\file2.txt");

		try {
			long diff = Files.mismatch(path1, path1);
			System.out.println("file1.txt and file2.txt files are having identical content");
			System.out.println("Files are same and no diff character found because returned " + diff);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
