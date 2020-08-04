package com.multithreading.threadpool;

import java.util.Formatter;

public class SingleThreadClient {

	public static void main(String[] args) {
		Counter counter = new Counter();
		
		long start = System.nanoTime();
		
		double value = 0;
		for(int i = 0; i < 400; i++) {
			value += counter.count(i);
		}
		
		StringBuilder sbuf = new StringBuilder();
		Formatter fmt = new Formatter(sbuf);
		System.out.println(fmt.format("Executed by %d s, value : %f", (System.nanoTime() - start) / (1000000000), value));
		
	}
}
