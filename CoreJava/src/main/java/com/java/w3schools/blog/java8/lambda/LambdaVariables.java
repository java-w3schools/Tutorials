package com.java.w3schools.blog.java8.lambda;

public class LambdaVariables {
	public static void main(String[] args) {
		int localLamdbdaVar = 10; 
		
		BookInterface bookInterface = (catefory) -> {
			// some logic to get books count from Library for a Category.
			return localLamdbdaVar;
		};

		int count = bookInterface.getBooksCount("Technology");
		System.out.println("count " + count);
	}
}

@FunctionalInterface
interface BookInterface {
	int getBooksCount(String catefory);
}

/*
 * Output: count 10
 */