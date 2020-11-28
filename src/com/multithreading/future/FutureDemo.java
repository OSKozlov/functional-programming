package com.multithreading.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureDemo {
	
	public static void main(String[] args) {
		Callable task = () -> {
			System.out.println("Start task!!!");
			Thread.sleep(2000);
			return "Future demo!";
		};
		
		FutureTask<String> future = new FutureTask<>(task);
		new Thread(future).start();
		try {
			System.out.println(future.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

}
