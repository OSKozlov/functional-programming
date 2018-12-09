package com.java.algorithms;

public class FizzBuzzApp {
	
	public static void main(String[] args) {
		int elemNum = 20;
		fizzbuzz(elemNum);
	}
	
	private static void fizzbuzz(int num) {
		for(int i = 1; i <= num; i++) {
			if (i%15 == 0) {
				System.out.println("FizzBuzz");
			} else if (i%3 == 0) {
				System.out.println("Fizz");
			} else if (i%5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}
