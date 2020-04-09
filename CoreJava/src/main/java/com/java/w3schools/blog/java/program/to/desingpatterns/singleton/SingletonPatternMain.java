package com.java.w3schools.blog.java.program.to.desingpatterns.singleton;

import java.lang.reflect.Constructor;

public class SingletonPatternMain {

	public static void main(String[] args) throws Exception {

		SingletonPattern object1 = SingletonPattern.getInstance();

		SingletonPattern object2 = SingletonPattern.getInstance();

		SingletonPattern object3 = SingletonPattern.getInstance();

		System.out.println("object 1 " + object1);
		System.out.println("object 2 " + object2);
		System.out.println("object 3 " + object3);

		System.out.println("object 1 hashCode " + object1.hashCode());
		System.out.println("object 2 hashCode " + object2.hashCode());
		System.out.println("object 3 hashCode " + object3.hashCode());

		SingletonPattern object4 = SingletonPattern.getInstance();
		System.out.println("Object 4 hashcode : " + object4.hashCode());

		SingletonPattern object5 = (SingletonPattern) object4.clone();
		System.out.println("Object 5 hashcode : " + object5.hashCode());

		SingletonPattern object6 = (SingletonPattern) object4.clone();
		System.out.println("Object 6 hashcode : " + object6.hashCode());

		SingletonPattern object7 = SingletonPattern.getInstance();
		System.out.println("Object 7 hashcode : " + object4.hashCode());

		Constructor<SingletonPattern> constructor = SingletonPattern.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		SingletonPattern pattern = constructor.newInstance();
		System.out.println("singeleton new object through reflection api : " + pattern.hashCode());

	}

}
