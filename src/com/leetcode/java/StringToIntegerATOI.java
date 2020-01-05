package com.leetcode.java;

public class StringToIntegerATOI {

	public static void main(String[] args) {
		String str = 
				" ";//"    +0a32";//"     +004500";//"+1";//"    +0a32";//"  -0012a42";//"3.14159";//"words and 987";//"42"; //"-91283472332";//"   -42";//"-4193 with words";
//		Integer.parseInt(str);
		int result = myAtoi(str);
		System.err.println("### result = " + result);
	}
	
	public static int myAtoi(String str) {
		if (str == null || str.isEmpty()) return 0;
		
		str = str.trim();
		int len = str.length();
		if (len == 0) {
			return 0;
		}
		
		char flag = '+';
		
		int i = 0;
		if (str.charAt(0) == '-') {
			flag = '-';
			i++;
		} else if (str.charAt(0)=='+') {
			i++;
		} else if (Character.isAlphabetic(str.charAt(0))) {
			return 0;
		}
		
		double result = 0;
		while(i < str.length()) {
			if (Character.isDigit(str.charAt(i))) {
				result = result * 10 + Character.digit(str.charAt(i), 10);
			} else break;
			i++;
		}
		
		if (flag == '-') {
			result = -result;
		}
		
		// handle max and min
		if (result > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
	 
		if (result < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
	 
		return (int) result;
	}

}
