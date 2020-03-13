package com.java.w3schools.blog.java.program.to.threads.interrupt;

public class ThreadIntterupted {

	public static void main(String[] args) throws InterruptedException {

		Thread t = new Thread(new PrintEvenNumbers2());

		// starting the thread
		t.start();

		// calling interrupt() method.
		if (!t.interrupted()) {
			t.interrupt();
		}
		System.out.println();

	}

}

class PrintEvenNumbers2 implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("Executing thread");

			Thread.sleep(1000);

		} catch (InterruptedException e) {

			e.printStackTrace();

		}

	}
}