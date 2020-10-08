package com.multithreading.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class InterviewScheduler implements Runnable {
	
	private BlockingQueue<String> queue;

	public InterviewScheduler(BlockingQueue<String> q) {
		this.queue = q;
	}
	
	@Override
	public void run() {
		System.out.println("10 candidates have arrived");
		for(int i = 1; i <= 10; i++) {
			String msg = new String("Candidate " + i);
			try {
				queue.put(msg);
				System.out.println("Interview scheduled for " + msg);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Interviews scheduled for all candidates");
		String msg = new String("Stop");
		try {
			queue.put(msg);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
