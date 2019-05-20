package com.java.task.arrays;

public class MissedElementFromArrayApp {
	
	public static void main(String[] args) {
//		int[] initArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] changedArray = new int[] {1, 2, 3, 4, 5, 6, 8, 9, 10};
		int N=10;
		int removed = N;
		for(int i=0;i<N-1;i++) {
			removed += ((i+1) - changedArray[i]);
		}
		System.out.println("result: " + removed);
	}

}
