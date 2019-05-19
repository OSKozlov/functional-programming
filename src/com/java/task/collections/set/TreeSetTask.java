package com.java.task.collections.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTask {
	
	public static void main(String[] args){
		
		// In TreeSet uniqueness and order is ensured by compare, in Set by equals
		Set<Integer> set = new TreeSet<>(new Comparator<Integer>(){
			@Override
			public int compare(Integer o1, Integer o2) {
				return 0;
			}
		});
		
		set.add(1);
		set.add(2);
		set.add(1);	
		
		set.stream().forEach(c -> System.out.println(" val: " + c.intValue()));
	}
}
