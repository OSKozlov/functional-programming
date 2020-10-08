package com.multithreading.semaphore;

import java.util.concurrent.Semaphore;

public class Philosopher extends Thread {

	private Semaphore sem;
	
	private boolean full = false;
	
	private String name;
	
	public Philosopher(Semaphore sem, String name) {
		this.sem = sem;
		this.name = name;
	}
	
	@Override
	public void run() {
		try {
			if (!full) {
				
				// Method acquire() manages the counter and request permission
				// for access to semaphore resource. If counter > 0 then permission provides
				// and counter decrease by 1
				sem.acquire();
				
				System.out.println(name + " sit down at the table.");
				sleep(300);
				full = true;
				System.out.println(name + " ate. Leaves the table.");
				
				// Method release() manages the counter and releases permission
				// that was provided earlier and than counter increases by 1
				sem.release();
				
				sleep(300);
			}
		} catch(InterruptedException ex) {
			System.err.println(" Something happen!");
		}
	}

	public static void main(String[] args) {
		Semaphore sem = new Semaphore(2);		// Object sem created with counter = 2
		new Philosopher(sem, "Socrat").start();
		new Philosopher(sem, "Platon").start();
		new Philosopher(sem, "Aristotel").start();
		new Philosopher(sem, "Fales").start();
		new Philosopher(sem, "Pifagor").start();
	}
}
