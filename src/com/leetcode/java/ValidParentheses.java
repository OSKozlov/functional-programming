package com.leetcode.java;

import java.util.Stack;

public class ValidParentheses {

	private static final char LEFT_ROUND_BRACKET = '(';
	private static final char LEFT_SQUARE_BRACKET = '[';
	private static final char LEFT_CURLY_BRACKET = '{';
	private static final char RIGHT_ROUND_BRACKET = ')';
	private static final char RIGHT_SQUARE_BRACKET = ']';
	private static final char RIGHT_CURLY_BRACKET = '}';
	
	public static void main(String[] args) {
		String str = "{}[";//"()[]{}";//"{[]}"
		boolean isValid = isValid(str);
		System.err.println("### isValid = " + isValid);
	}
	
	public static boolean isValid(String s) {
		if (s == null) return false;
        if (s.isEmpty()) return true;
		char[] arr = s.toCharArray();
		int len = arr.length;
		boolean isValid = true;
		int i = 0;
		Stack<Character> st = new Stack<>();
		while(i < len){
			if (arr[i] == LEFT_ROUND_BRACKET ||
					arr[i] == LEFT_SQUARE_BRACKET ||
					arr[i] == LEFT_CURLY_BRACKET ) {
				st.add(arr[i]);
			} else {
				if (st.isEmpty()) {
					isValid = false;
					break;
				} else {
					if ((arr[i] == RIGHT_ROUND_BRACKET && 
							st.contains(LEFT_ROUND_BRACKET)) ||
							(arr[i] == RIGHT_SQUARE_BRACKET && 
							st.contains(LEFT_SQUARE_BRACKET)) ||
							(arr[i] == RIGHT_CURLY_BRACKET && 
							st.contains(LEFT_CURLY_BRACKET))) {
						st.pop();
					} else {
						isValid = false;
						break;
					}
				}
			}
			i++;
		}
        if (!st.isEmpty()) return false;
		return isValid;  
    }
}
