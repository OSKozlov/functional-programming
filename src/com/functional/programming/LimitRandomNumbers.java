package com.functional.programming;

import java.util.Random;

public class LimitRandomNumbers {
	
	public static void main(String[] args) {
		Random random = new Random();
		random.ints().limit(10).sorted().forEach(System.out::println);
	}

}
