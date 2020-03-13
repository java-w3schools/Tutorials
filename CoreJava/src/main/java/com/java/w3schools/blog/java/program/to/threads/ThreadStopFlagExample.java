package com.java.w3schools.blog.java.program.to.threads;

import java.util.concurrent.atomic.AtomicBoolean;

public class ThreadStopFlagExample {

	public static void main(String[] args) throws InterruptedException {

		CustomThread runnable = new CustomThread(1000);
		Thread customThread = new Thread(runnable);
		customThread.start();
		
		Thread.sleep(5000);
		
		runnable.stop();

	}
}

class CustomThread implements Runnable {

	Thread current;
	long interval;
	AtomicBoolean flag = new AtomicBoolean();

	public CustomThread(int interval) {
		this.interval = interval;
		flag.set(true);
	}

	public void stop() {
		flag.set(false);

	}

	@Override
	public void run() {

		while (flag.get()) {
			System.out.println("Running a task");
			try {
				Thread.sleep(interval);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("Task is stopped by flag.");

	}
}