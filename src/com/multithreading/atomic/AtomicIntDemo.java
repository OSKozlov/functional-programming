package com.multithreading.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntDemo {
	
	static AtomicInteger atomicInteger = new AtomicInteger(0);
	
	public static void main(String[] args) throws InterruptedException {
		for(int j=0; j<10000; j++) {
			new MyThread().start();
		}
		Thread.sleep(2000);
		System.err.println(atomicInteger.get());
	}
	
	static class MyThread extends Thread {
		
		@Override
		public void run() {
			atomicInteger.incrementAndGet();
		}
	}

}
