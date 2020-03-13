package com.java.w3schools.blog.java.program.to.threads;

public class ThreadPriorityChildThreads {

	public static void main(String[] args) {

		// Getting the current executing thread.
		Thread thread = Thread.currentThread();
		System.out.println("Current thread name: " + thread.getName());

		thread.setPriority(7);
		System.out.println("main thread priority : " + thread.getPriority());

		Thread child = new Thread();
		System.out.println("Child thread 1 priority : " + child.getPriority());

		Thread child2 = new Thread();
		System.out.println("Child thread 2 priority : " + child2.getPriority());
	}

}
