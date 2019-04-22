package com.functional.programming;

import java.util.stream.IntStream;

public class StreamAPIExamples {

	public static void main(String[] args) {
		intStreamExample();
	}

	private static void intStreamExample() {
		IntStream.of(120, 410, 85, 32, 314, 12)
				.filter(x -> x < 300)
				.map(x -> x + 11).limit(3)
				.forEach(x -> System.out.print(" " + x));
	}

}
