package com.multithreading.threadpool;

public class Counter {

	public Double count(double a) {
		// commit1
		for (int i = 0; i < 1000000; i++) {
			a = a + Math.tan(a);
			// commit2
		}
		// commit3
		return a;
		// commit4
	}
	// commit5
}
