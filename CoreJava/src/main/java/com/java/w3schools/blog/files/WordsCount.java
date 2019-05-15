package com.java.w3schools.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordsCount {

	public static void main(String[] args) {
		File file = new File("sample.txt");
		try (Scanner sc = new Scanner(new FileInputStream(file))) {
			int count = 0;
			while (sc.hasNext()) {
				sc.next();
				count++;
			}
			System.out.println("Number of words: " + count);
		} catch (FileNotFoundException e) {
			System.out.println("File loading is failed. Reason - " + e.getMessage());
			e.printStackTrace();
		}

	}

}
