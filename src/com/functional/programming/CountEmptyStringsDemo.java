package com.functional.programming;

import java.util.Arrays;
import java.util.List;

public class CountEmptyStringsDemo {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		long count = strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println("count = " + count);
	}
}
