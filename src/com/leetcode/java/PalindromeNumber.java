package com.leetcode.java;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		int num = -24242;
		boolean result = isPalindrome(num);
		System.err.println("result = " + result);
	}
	
	private static boolean isPalindrome(int num) {
		int remainder = 0;
		int reverseSum = 0;
		int temp = num;
		if (num < 0) return false;
		while(num != 0) {
			remainder = num % 10;
			reverseSum = (reverseSum * 10) + remainder;
			num = num / 10;
		}
		if (temp == reverseSum) return true;
		return false;
	}

}
