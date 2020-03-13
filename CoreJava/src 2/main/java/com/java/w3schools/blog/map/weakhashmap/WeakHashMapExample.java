package com.java.w3schools.blog.map.weakhashmap;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.time.temporal.WeekFields;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.stream.IntStream;

public class WeakHashMapExample {

	public static void main(String[] args) throws InterruptedException {

		Double PI = 3.14;
		SoftReference<Double> reference = new SoftReference<Double>(PI);
		PI = null;

		double getValue = reference.get();
		System.out.println(PI);

		String value = "WeakReference";
		WeakReference<String> weakReference = new WeakReference<String>(value);
		value = null;
		System.gc();
		// Thread.sleep(10000);
		System.out.println(weakReference.get());
		System.out.println(value);

		Map<Integer, String> weakHashMap = new WeakHashMap<>();

		IntStream.range(0, 1000).forEach(i -> weakHashMap.put(i, Integer.toString(i)));
		System.out.println("before gc run weakHashMap size : " + weakHashMap.size());
		//Runtime.getRuntime().gc();
		// Thread.sleep(5000);

		System.out.println("After gc run weakHashMap size : " + weakHashMap.size());
		System.out.println(weakHashMap.containsKey(999));
		boolean isEmpty = weakHashMap.isEmpty();
		System.out.println(isEmpty);

		weakHashMap.put(10000, "10000");
		System.out.println(weakHashMap.get(10000));
		weakHashMap.clear();
	}

}
