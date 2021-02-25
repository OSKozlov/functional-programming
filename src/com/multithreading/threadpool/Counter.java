package com.multithreading.threadpool;

public class Counter {

	public Double count(double a) {
		// comment 1
		for (int i = 0; i < 1000000; i++) {
			a = a + Math.tan(a);
		}

		return a;
	}
}
