package com.java.algorithms;

import java.util.Random;

public class BubbleSortAlgorithm {

	public static void bubbleSort(int[] array) {
		boolean isSorted = false;
		while(!isSorted) {
			isSorted = true;
			for(int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					swap(array, i, i + 1);
					isSorted = false;
				}
			}
		}
	}
	
	/**
	 * Swap elements
	 * 
	 * @param array
	 * @param i
	 * @param j
	 */
	public static void swap(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
	
	public static void display(int[] arr, String msg) {
		System.out.print(msg);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		
	    Random rand = new Random();
	    for(int i=0; i<arr.length; i++) {
	    	int randomNum = rand.nextInt(10);
	    	arr[i] = randomNum;	
	    }
	    
	    display(arr, "Not Sorted: ");
	    
	    bubbleSort(arr);
	    
	    display(arr, "Sorted: ");
	}
}
