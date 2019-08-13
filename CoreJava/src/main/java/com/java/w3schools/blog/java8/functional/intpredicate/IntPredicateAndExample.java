package com.java.w3schools.blog.java8.functional.intpredicate;

import java.util.function.IntPredicate;

public class IntPredicateAndExample {

	public static void main(String[] args) {

		IntPredicate predicate1 = amount -> amount > 0;
		IntPredicate predicate2 = amount -> amount % 500 == 0;

		IntPredicate orPredicate = predicate1.or(predicate2);

		boolean isValidAmt = orPredicate.test(1000);
		System.out.println("Rs. 1000 is valid ? " + isValidAmt);

		isValidAmt = orPredicate.test(-1300);
		System.out.println("Rs. 1300 is valid ? " + isValidAmt);

		isValidAmt = orPredicate.test(-5000);
		System.out.println("Rs. -5000 is valid ? " + isValidAmt);

	}

}
