package com.java.w3schools.blog.java.program.to.threads.interrupt;

public class ThreadWithoutIntterupt {

	public static void main(String[] args) {

		Thread t = new Thread(new PrintEvenNumbers());

		// starting the thread
		t.start();

		// calling interrupt() method.
		t.interrupt();

	}

}

class PrintEvenNumbers implements Runnable {

	@Override
	public void run() {

		System.out.println("Printing even numbers till 20 :");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new InternalError("Thraed is interrupted");
		}

	}
}