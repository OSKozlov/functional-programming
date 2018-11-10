package com.functional.programming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxedExample {
	
	public static void main(String[] args) {
		List<Integer> listOfInt = IntStream.of(1,2,3,4,5).boxed().collect(Collectors.toList());
		
		listOfInt.forEach(v -> System.out.println(v));
	}

}
