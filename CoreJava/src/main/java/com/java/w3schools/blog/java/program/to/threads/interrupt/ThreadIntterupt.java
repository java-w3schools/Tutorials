package com.java.w3schools.blog.java.program.to.threads.interrupt;

public class ThreadIntterupt {

	public static void main(String[] args) {

		Thread t = new Thread(new PrintEvenNumbers1());

		// starting the thread
		t.start();

		// calling interrupt() method.
		t.interrupt();

	}

}

class PrintEvenNumbers1 implements Runnable {

	@Override
	public void run() {

		System.out.println("Printing even numbers till 20 :");
		for (int i = 2; i <= 20; i = i + 2) {
			System.out.println(i);
		}

	}
}