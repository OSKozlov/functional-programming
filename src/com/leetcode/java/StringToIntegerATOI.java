package com.leetcode.java;

public class StringToIntegerATOI {

	public static void main(String[] args) {
		String str = "2147483648";//"-91283472332";//"    +0a32";//"     +004500";//"+1";//"    +0a32";//"  -0012a42";//"3.14159";//"words and 987";//"42"; //"-91283472332";//"   -42";//"-4193 with words";
//		Integer.parseInt(str);
		int result = myAtoi(str);
		System.err.println("### result = " + result);
	}
	
	public static int myAtoi(String str) {
		if (str == null || str.isEmpty()) return 0;
		boolean negative = false;
		int len = str.length();
		int result = 0;
		int limit = -Integer.MAX_VALUE;
		int radix = 10;
		int i = 0;
		if (len > 0) {
			char firstChar = str.charAt(0);
			while(Character.isWhitespace(firstChar)) {
				if (i == len) return 0;
				firstChar = str.charAt(i++);
			}
			if ((str.charAt(i) == '+' && len == 1) || (str.charAt(i) == '-' && len == 1))
				return 0;
			if (firstChar == '+' && str.charAt(i + 1) == '0' && len == 2)
				return 0;
			if ((str.charAt(i) == '-' && str.charAt(i + 1) == '+')
					|| ((str.charAt(i) == '+' && str.charAt(i + 1) == '-')))
				return 0;
			if (firstChar != '-' && Character.isAlphabetic(firstChar))
				return 0;
			if (firstChar < '0') {
				if (firstChar == '-') {
					negative = true;
					limit = Integer.MIN_VALUE;
				}
			}
			int multmin = limit / radix;
			while(i < len) {
				char ch = str.charAt(i++);
				if (ch == '.') return negative ? result : -result;
				if (!Character.isDigit(ch) && ch!='-' && ch!='+') {
					return negative ? result : -result;
				}
				if (result == 0 && !Character.isDigit(ch)) continue;
				int digit = Character.digit(ch, radix);
				if (result < multmin) {
					System.err.println("### test ###");
					if (result<=Integer.MIN_VALUE) {
						result = result - digit;
					} else {
						result = Integer.MIN_VALUE;
					}
					break;
				}
				result *= radix;
				result -= digit;
			}
			/*
			 * if (result<=Integer.MAX_VALUE) { result = Integer.MAX_VALUE; return result; }
			 */
		}
		return negative ? result : -result;
    }
}
