package com.multithreading.synch.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchCollections {

	public static void main(String[] args) {
		NameList nameList = new NameList();
		nameList.add("first");
		class MyThread extends Thread {
			@Override
			public void run() {
				System.out.println(nameList.removeFirst());
			}
		}
		MyThread myThread1 = new MyThread(); 
		myThread1.setName("one");
		myThread1.start();
		MyThread myThread2 = new MyThread();
		myThread2.setName("two");
		myThread2.start();
	}
	
	static class NameList {
		
		private List list = Collections.synchronizedList(new ArrayList<>());
		
		public void add(String name) {
			list.add(name);
		}
		
		public synchronized String removeFirst() {
			if (list.size() > 0) {
				if (Thread.currentThread().getName().equals("one")) {
					Thread.yield();
				}
				return (String) list.remove(0);
			}
			return null;
		}
	}
}
