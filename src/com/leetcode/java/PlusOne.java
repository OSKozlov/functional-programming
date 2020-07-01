package com.leetcode.java;

public class PlusOne {

	public static void main(String[] args) {
		int[] arr = {9};
		int[] result = plusOne(arr);
		
		for(int num: result) {
			System.out.print(num + " ");
		}
	}
	
	private static int[] plusOne(int[] digits) {	
		int n = digits.length;
		for(int i = n-1; i>=0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			
			digits[i] = 0;
		}
		
		int[] new_number = new int[n+1];
		new_number[0] = 1;
		return new_number;
	}
}
