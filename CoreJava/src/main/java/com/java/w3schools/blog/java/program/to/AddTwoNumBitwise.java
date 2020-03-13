package com.java.w3schools.blog.java.program.to;

public class AddTwoNumBitwise {

	static int Add(int x, int y) {
		// Iterate till there is no carry
		System.out.println("x : " + x + ", y : " + y);
		int i = 1;
		while (y != 0) {
			System.out.println(" iteration " + i);
			// carry now contains common
			// set bits of x and y
			int carry = x & y;
			System.out.println("carry : " + carry);

			// Sum of bits of x and
			// y where at least one
			// of the bits is not set
			x = x ^ y;

			System.out.println("x : " + x);

			// Carry is shifted by
			// one so that adding it
			// to x gives the required sum
			y = carry << 1;
			System.out.println("y : " + y);
		}
		return x;
	}

	// Driver code
	public static void main(String arg[]) {
		// System.out.println(Add(15, 31));
		System.out.println(2 & 2);

	}
}
