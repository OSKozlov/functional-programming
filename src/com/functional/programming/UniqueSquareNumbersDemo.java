package com.functional.programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueSquareNumbersDemo {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		List<Integer> squareList = numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
		squareList.forEach(v -> System.out.println("value = " + v));
	}

}
