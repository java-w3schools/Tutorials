package com.java.w3scools.blog.java12.string;

import java.lang.invoke.MethodHandles;

public class ResolveConstantDesc​Example {

	public static void main(String[] args) {
		String string = "resolveConstantDesc​";
		String constDesc = string.resolveConstantDesc(MethodHandles.lookup());
		System.out.println(constDesc);

	}

}
