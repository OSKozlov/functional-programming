package com.multithreading.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CDLExample {
	
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch countDownLatch = new CountDownLatch(3);
		new Work(countDownLatch);
		new Work(countDownLatch);
		new Work(countDownLatch);
		
		countDownLatch.await();
		System.err.println("all job done");
	}

}

class Work extends Thread {
	CountDownLatch countDownLatch;
	
	public Work(CountDownLatch countDownLatch) {
		this.countDownLatch = countDownLatch;
		start();
	}
	
	@Override
	public void run() {
		try {
			sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.err.println("done work");
		countDownLatch.countDown();
	}
}
