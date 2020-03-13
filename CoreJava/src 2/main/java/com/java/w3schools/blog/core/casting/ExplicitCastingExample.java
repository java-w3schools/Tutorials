package com.java.w3schools.blog.core.casting;

/**
 * Example program on Explicit or Narrowing type casting
 * 
 * @author Venkatesh
 *
 */
public class ExplicitCastingExample {

	public static void main(String[] args) {
		float f = 30.087f;
		byte b = (byte) f;
		System.out.println(b);

		C c = new C();
		//D d = (D) c;
		
		float f1 = 3.14f;
		double d1 = 1234567890123456789d;
		
		int i1 = (int)f1;
		System.out.println("i1 : "+i1);
		
		int i2 = (int) d1;
		System.out.println("i2 : "+i2);

	}

}

class C {
	// some methods
}

class D {
	// some methods
}

/*Output:
	30
	i1 : 3
	i2 : 2147483647
*/