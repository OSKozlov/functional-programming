package com.functional.programming;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamsExample {
	
	public static void main(String[] args) {
		
		integerStreamExample();
		
		integerStreamWithSkip();
		
		integerStreamWithSum();
		
		integerStreamWithSortedAndFindFirst();
	}
	
	private static void integerStreamExample() {
		// 1. Integer Stream
		IntStream
			.range(1, 10)
			.forEach(System.out::print);
		System.out.println();
	}
	
	private static void integerStreamWithSkip() {
		// 2. Integer Stream with skip
		// skip first 5 elements
		IntStream.range(1, 10)
			.skip(5)
			.forEach(x -> System.out.println(x));
		System.out.println();
	}

	private static void integerStreamWithSum() {
		// 3. Integer Stream with sum
		int sum = IntStream
				  	.range(1, 5)
				  	.sum();
		System.out.println("Summary: " + sum + "\n");
	}
	
	private static void integerStreamWithSortedAndFindFirst() {
		// 4. Integer Stream with sum
		Stream.of("Ava", "Aneri", "Alberto")
			.sorted()
			.findFirst()
			.ifPresent(System.out::println);
//		System.out.println("Summary: " + sum + "\n");
	}
}
