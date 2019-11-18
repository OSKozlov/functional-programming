package com.leetcode.java;

import java.math.BigInteger;

public class ReverseInteger {
	
	
	public int reverse(int x) {
		if (x == 0) return 0;
		int intNum = x;
		int remainder = 0;
		String reverse = "";
		boolean isSignNum = false;
		
		if (intNum < 0) {
			isSignNum = true;
			intNum = Math.abs(intNum);
		}
		
		// 123
		while(intNum != 0) {
			double temp = intNum/10; // 12.3
			remainder = intNum % 10; // 3
			reverse = reverse + remainder;		
			intNum = (int) temp; // 12
		}
		
		if (reverse.contains("-")) return 0;
		long value = Long.parseLong(reverse);
		if (value > Integer.MAX_VALUE) {
			return 0;
		}
		
		if (isSignNum) {
			reverse = "-" + reverse;
		}
		
		return Integer.parseInt(reverse);
    }
	
	public static void main(String[] args) {
		ReverseInteger rint = new ReverseInteger();
		int result = rint.reverse(-123);
		System.out.println("## result = " + result);
	}
}
