package com.leetcode.java;

import java.util.Stack;

public class LongestValidParentheses {

	private static final char RIGHT_BRACKET = '(';
	private static final char LEFT_BRACKET = ')';

//	private static Set<Character> set = new HashSet<>();

	public static void main(String[] aegs) {
		String s = "(()()";//"(()())";//"(()()";//"(((())(";//"()(()";//"()(()";//")()())()()()()";//"()(()";////"((())())";//")()())";//"(()";
		int result = longestValidParentheses(s);
		System.err.println("### result = " + result);
	}

	public static int longestValidParentheses(String s) {
		if (s == null || s.length() == 0)
			return 0;
		int strLen = s.length();
		if (strLen == 1)
			return 0;
		int i = 0;
		int max = 0;
		int lastPos = -1;
		Stack<Integer> st = new Stack<>();
		while (i < strLen) {
			if (s.charAt(i) == RIGHT_BRACKET) {
				st.push(i);
			} else if (st.isEmpty()) {
				//shift position
				lastPos = i;
			} else {
				// remove element
				st.pop();
				max = st.isEmpty() ? Math.max(i-lastPos, max) : Math.max(i-st.peek(), max);
			}
			i++;
		}
		return max;
	}
}
