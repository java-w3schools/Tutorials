package com.java.w3schools.blog.java.program.to.threads;

import java.util.stream.IntStream;

/**
 * 
 * Runnable - Thread creation examples.
 * 
 * @author JavaProgramTo.com
 *
 */

public class ThreadImplementsRunnable {

	public static void main(String[] args) {

		PrintNumberRunnable numberRunnableThread = new PrintNumberRunnable();

		Thread t1 = new Thread(numberRunnableThread);
		t1.setName("Runnable Thread 1");
		t1.start();

		Thread t2 = new Thread(numberRunnableThread);
		t2.setName("Runnable Thread 2");
		t2.start();

	}
}

class PrintNumberRunnable implements Runnable {

	@Override
	public void run() {

		IntStream.range(1, 11).forEach(n -> System.out.println(Thread.currentThread().getName() + " - " + n));

	}

}