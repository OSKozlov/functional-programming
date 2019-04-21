package com.java.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BinarySearchSimple {
	
	private static final int COLLECTION_SIZE = 10;
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		Random rand = new Random();
	    for(int i=0; i<COLLECTION_SIZE; i++) {
	    	int randomNum = rand.nextInt(COLLECTION_SIZE);
	    	list.add(randomNum);	
	    }
	    
	    Collections.sort(list);
	    
	    display(list);
	    
	    int index = Collections.binarySearch(list, 5);
	    System.out.println("###  INDEX: " + index);
	    System.out.println("###  ELEMENT: " + list.get(index));
	}
	
	private static void display(List list) {
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
	}

}
