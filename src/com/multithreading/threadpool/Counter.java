package com.multithreading.threadpool;

public class Counter {

	public Double count(double a) {
		// comment 1
		for (int i = 0; i < 1000000; i++) {
			a = a + Math.tan(a);
		}
		// comment 2
		return a;
		// comment 3
		// comment 4
		// comment 5
		// comment 6
		// comment 7
	}
}
