package com.java.w3schools.blog.java8.stream;

import java.util.Arrays;

public class StreamTerminalVsIntermediate {

	public static void main(String[] args) {
		System.out.println("Stream without terminal operation");

		Arrays.stream(new int[] { 1, 2, 3 }).map(i -> {
			System.out.println("doubling " + i);
			return i * 2;
		});

		System.out.println("Stream with terminal operation");
		long sum2 = Arrays.stream(new int[] { 1, 2, 3 }).map(i -> {
			System.out.println("doubling " + i);
			return i * 2;
		}).sum();
		System.out.println("Sum : " + sum2);

	}

}
