package com.java.w3schools.blog.java8.functional.intpredicate;

import java.util.function.IntPredicate;

public class IntPredicatenegateExample {

	public static void main(String[] args) {

		IntPredicate agePredicate = age -> age > 18;
		IntPredicate negatePredicate = agePredicate.negate();

		boolean isMajor = negatePredicate.test(20);
		System.out.println("Age 20 is minor : " + isMajor);

		isMajor = negatePredicate.test(10);
		System.out.println("Age 10 is minor : " + isMajor);
	}

}
