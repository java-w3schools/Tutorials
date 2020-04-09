package com.java.w3schools.blog.java.program.to.desingpatterns.singleton;

public class SingletonPattern implements Cloneable {

	// private static field.
	private static SingletonPattern instance;

	// private constructor
	private SingletonPattern() {

		if (instance != null) {
			throw new RuntimeException("You can create new object.");
		}

	}

	// double locking pattern.
	public static SingletonPattern getInstance() {
		if (instance == null) {
			synchronized (SingletonPattern.class) {
				if (instance == null) {
					instance = new SingletonPattern();
				}
			}

		}

		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// throw new CloneNotSupportedException("Clone not supported for
		// SingletonPattern class");
		return instance;
	}

}
