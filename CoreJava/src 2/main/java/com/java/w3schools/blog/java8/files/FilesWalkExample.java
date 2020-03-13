package com.java.w3schools.blog.java8.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * Java 8 Files walk() Examples
 * 
 * @author venkateshn
 *
 */
public class FilesWalkExample {

	public static void main(String[] args) {

		System.out.println("Files in folder : ");
		try (Stream<Path> filesWalk = Files.walk(Paths.get("./src"))) {

			List<String> result = filesWalk.filter(Files::isRegularFile).map(x -> x.toString())
					.collect(Collectors.toList());

			result.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("---------------------------");
		System.out.println("Folder names : ");
		try (Stream<Path> filesWalk = Files.walk(Paths.get("./src/main/java/com/java/w3schools/blog/java8/"))) {

			List<String> result = filesWalk.filter(Files::isDirectory).map(x -> x.toString())
					.collect(Collectors.toList());

			result.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("---------------------------");
		// File names for a pattern.
		try (Stream<Path> filesWalk = Files.walk(Paths.get("./src/main/java/com/java/w3schools/blog/java8/"))) {

			List<String> result = filesWalk.filter(path -> path.toString().contains("Match")).map(x -> x.toString())
					.collect(Collectors.toList());

			result.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
