package com.leetcode.java;

import java.util.HashSet;
import java.util.Set;

public class LongestValidParentheses {
	
	private static final char RIGHT_PARENTHESES = '(';
	private static final char LEFT_PARENTHESES = ')';
	
	private static Set<Character> set = new HashSet<>();
	
	public static void main(String[] aegs) {
		String s = ")()())";//"((())())";//")()())";//"(()";
		int result = longestValidParentheses(s);
		System.err.println("### result = " + result);
	}

	// "((())())"
	// add (
	// add )
	// add (
	// add (
	// add )
	// remove )
	public static int longestValidParentheses(String s) {
		if (s == null || s.length() == 0) return 0;
		char[] arr = s.toCharArray();
		int strLen = arr.length;
		if (strLen == 1) return 0;
		int i = 0;
		int j = strLen - 1;
		int count = 0;
		while (i<strLen && j>0) {
			if (set.isEmpty() && arr[i] == RIGHT_PARENTHESES) {
				set.add(arr[i]);
				arr[i]='v';
				while(j>i) {
					if (!set.isEmpty() && set.contains(RIGHT_PARENTHESES)
			                  && !set.contains(LEFT_PARENTHESES)
							  && arr[j] == LEFT_PARENTHESES) {
						set.add(arr[j]);
						count = count + 2;
						set.clear();
						arr[j]='v';
						j--;
						break;
					}
					j--;
				}
			}
			i++;
		}
		return count;
	}

}



/*
 * class Solution {
 * 
 * private static final char RIGHT_PARENTHESES = '('; private static final char
 * LEFT_PARENTHESES = ')';
 * 
 * private static Set<Character> set = new HashSet<>();
 * 
 * public int longestValidParentheses(String s) { if (s == null || s.length() ==
 * 0) return 0; char[] arr = s.toCharArray(); int strLen = arr.length; if
 * (strLen == 1) return 0; int i = 0; int j = 0; int count = 0; while (i<strLen
 * && j<strLen) { if (set.isEmpty() && arr[i] == RIGHT_PARENTHESES) {
 * set.add(arr[i]); arr[i]='v'; j++; } else if (!set.isEmpty() &&
 * set.contains(RIGHT_PARENTHESES) && !set.contains(LEFT_PARENTHESES) && arr[i]
 * == LEFT_PARENTHESES) { set.add(arr[i]); count = count + 2; set.clear();
 * arr[i]='v'; i=j; } i++; } return count; } }
 */
