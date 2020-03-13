package com.java.w3schools.blog.java.program.to.threads;

import java.util.stream.IntStream;

public class ThreadExtendsClass {

	public static void main(String[] args) {

		PrintNumbersThread numbers1 = new PrintNumbersThread();
		numbers1.setName("PrintNumbers Thread 1");
		numbers1.start();

		PrintNumbersThread numbers2 = new PrintNumbersThread();
		numbers2.setName("PrintNumbers Thread 2");
		numbers2.start();

	}
}

class PrintNumbersThread extends Thread {

	@Override
	public void run() {

		IntStream.range(1, 11).forEach(n -> System.out.println(Thread.currentThread().getName() + " - " + n));

	}

}