package com.functional.programming;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerDemo {

	public static void main(String[] args) {
		StringJoiner joiner = new StringJoiner(", ", "(",")");
		joiner.add("John");
		joiner.add("Danny");
		joiner.add("Lui");
		System.out.println(joiner.toString());
		
		List<String> database = Arrays.asList("OracleDB", "Mong", "PostgreSQL", "MySQL");
		String string = String.join(", ", database);
		System.out.println(string);
		
		List<String> frameworks = Arrays.asList("Spring", "Hibernate", "JPA", "JSF");
		String collect = frameworks.stream().collect(Collectors.joining(": ","{","}"));
		System.out.println(collect);
	}
	
}
