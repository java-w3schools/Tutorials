package com.java.w3schools.blog.java8.functional.intpredicate;

import java.util.function.IntPredicate;

public class IntPredicateOrExample {

	public static void main(String[] args) {

		IntPredicate predicate1 = amount -> amount > 0;
		IntPredicate predicate2 = amount -> amount % 500 == 0;

		IntPredicate andPredicate = predicate1.and(predicate2);

		boolean isValidAmt = andPredicate.test(1000);
		System.out.println("Rs. 1000 is valid ? " + isValidAmt);

		isValidAmt = andPredicate.test(1300);
		System.out.println("Rs. 1300 is valid ? " + isValidAmt);

		isValidAmt = andPredicate.test(-5000);
		System.out.println("Rs. -5000 is valid ? " + isValidAmt);

	}

}
