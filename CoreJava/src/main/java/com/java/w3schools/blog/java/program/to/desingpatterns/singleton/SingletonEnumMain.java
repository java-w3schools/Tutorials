package com.java.w3schools.blog.java.program.to.desingpatterns.singleton;

public class SingletonEnumMain {

	public static void main(String[] args) {

		SingletonEnum enum1 = SingletonEnum.INSTANCE;
		String status = enum1.getState();
		System.out.println("enum singleton instance : " + status);

		SingletonEnum enum2 = SingletonEnum.INSTANCE;
		status = enum2.getState();
		System.out.println("enum singleton instance : " + status);

		SingletonEnum enum3 = SingletonEnum.INSTANCE;
		status = enum3.getState();
		System.out.println("enum singleton instance : " + status);

	}

}
