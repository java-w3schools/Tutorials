package com.java.w3schools.blog.java.program.to.threads;

import java.util.concurrent.atomic.AtomicBoolean;

public class ThreadStopInterruptExample {

	public static void main(String[] args) throws InterruptedException {

		CustomInterruptThread runnable = new CustomInterruptThread(1000);

		Thread.sleep(5000);
		runnable.interrupt();

	}
}

class CustomInterruptThread implements Runnable {

	Thread current;
	long interval;
	AtomicBoolean flag = new AtomicBoolean();

	public CustomInterruptThread(int interval) {
		this.interval = interval;
		current = new Thread(this);
		flag.set(true);
		current.start();

	}

	
	
	public void interrupt() {
		System.out.println("Calling interrupt() method");
		current.interrupt();
		flag.set(false);
	}

	@Override
	public void run() {

		while (flag.get()) {
			System.out.println("Running a task");

			try {
				Thread.sleep(interval);
			} catch (InterruptedException e) {
				System.out.println("thread is in sleep state and it is interrupted.");
			}
		}

		System.out.println("Task is stopped by flag.");
	}
}