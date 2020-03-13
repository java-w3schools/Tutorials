package com.java.w3schools.blog.java.program.to.threads;

public class MainThread {

	public static void main(String[] args) {

		System.out.println("is this main thread?");
		String threadName = Thread.currentThread().getName();
		System.out.println("Let us see what is the current thread name: " + threadName);
		int threads = Runtime.getRuntime().availableProcessors();
		System.out.println("threads : " + threads);

	}

}
