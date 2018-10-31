package com.functional.programming.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {
	
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "Mahesh", 17));
		list.add(new Student(2, "Suresh", 18));
		list.add(new Student(1, "Nilesh", 20));
		
		System.out.println("---Natural Sorting by Name");
		List<Student> slist = list.stream().sorted().collect(Collectors.toList());
		slist.forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));
	}

}
