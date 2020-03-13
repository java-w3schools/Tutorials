package com.java.w3schools.blog.java.program.to.threads;

public class ThreadPriorityExample {

	public static void main(String[] args) {

		// Getting the current executing thread.
		Thread thread = Thread.currentThread();
		System.out.println("Current thread name: " + thread.getName());

		int maxPriority = Thread.MAX_PRIORITY;
		int minPriority = Thread.MIN_PRIORITY;
		int normPriority = Thread.NORM_PRIORITY;

		System.out.println("Thread max priority : " + maxPriority);
		System.out.println("Thread min priority : " + minPriority);
		System.out.println("Thread norm priority : " + normPriority);

		// default thread priority
		System.out.println("Current thread priority : " + thread.getPriority());

		// new thread
		Thread thread2 = new Thread();

		// default thread priority
		System.out.println("New thread" + " priority : " + thread2.getPriority());

		// changing the priority
		thread.setPriority(1);
		thread2.setPriority(2);

		System.out.println("After change Current thread priority : " + thread.getPriority());
		System.out.println("After change New thread" + " priority : " + thread2.getPriority());

	}

}
