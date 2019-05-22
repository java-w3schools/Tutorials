package com.java.w3schools.blog.printnumbers;

/**
 * 
 * @author Venkatesh
 *
 */
public class Print1to100NumbersWithoutLoop {

	public static void main(String[] args) {

		Print1to100NumbersWithoutLoop withoutLoop = new Print1to100NumbersWithoutLoop();
		withoutLoop.printNnumber(100);
	}

	public void printNnumber(int toNumber) {
		if (toNumber > 0) {
			printNnumber(toNumber - 1);
			System.out.print(toNumber + " ");
		}
		return;
	}

}
