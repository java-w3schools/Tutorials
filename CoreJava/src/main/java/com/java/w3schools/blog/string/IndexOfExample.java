package com.java.w3schools.blog.string;

/**
 * to check whether the given character is present in string or not
 * 
 * @author Venkatesh
 *
 */
public class IndexOfExample {

	public static void main(String[] args) {
		
		String str = "Hello Friend, I am glad to see you here my Friend";
		
		// indexOf(int ch)
		int index = str.indexOf('l');
		System.out.println("indexOf(int ch) example : "+index);
		
		// indexOf​(int ch, int fromIndex)
		index = str.indexOf('l', 6);
		System.out.println("indexOf(int ch, int fromIndex) example : "+index);
		
		// indexOf(String str)
		index = str.indexOf("Friend");
		System.out.println("indexOf(String str) example : "+index);
		
		// indexOf​(String str, int fromIndex)
		index = str.indexOf("Friend", 15);
		System.out.println("indexOf(String str, int fromIndex) example : "+index);
	}
}

/*Output:
	indexOf(int ch) example : 2
	indexOf(int ch, int fromIndex) example : 20
	indexOf(String str) example : 6
	indexOf(String str, int fromIndex) example : 43
*/
