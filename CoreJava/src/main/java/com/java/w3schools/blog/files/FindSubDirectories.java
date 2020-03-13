package com.java.w3schools.blog.files;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FindSubDirectories {

	public static void main(String[] args) {
		fileListExample();
	}

	public static void fileListExample() {

		String currentPath = "/Users/venkateshn/Documents/VenkY/blog/Tutorials/CoreJava/src/main/java/com/java/w3schools/blog/";
		List<String> folderNames = new ArrayList<>();
		File folder = new File(currentPath);
		String[] names = folder.list();
		for (String name : names) {
			if (new File(currentPath + name).isDirectory()) {
				folderNames.add(name);
			}

		}

		System.out.println(folderNames);

	}

}
