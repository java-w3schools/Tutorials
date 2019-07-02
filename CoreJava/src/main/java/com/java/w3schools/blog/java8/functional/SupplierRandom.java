package com.java.w3schools.blog.java8.functional;

import java.util.function.Supplier;

public class SupplierRandom {

	public static void main(String[] args) {

		Supplier<Double> randomSupplier = () -> Math.random();
		System.out.println("Random value 1 "+randomSupplier.get());
		System.out.println("Random value 2 "+randomSupplier.get());
		System.out.println("Random value 3 "+randomSupplier.get());
		System.out.println("Random value 4 "+randomSupplier.get());
		System.out.println("Random value 5 "+randomSupplier.get());

	}

}
