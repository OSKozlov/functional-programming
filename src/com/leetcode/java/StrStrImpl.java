package com.leetcode.java;

public class StrStrImpl {

	public static void main(String[] str) {
		String haystack = "";
		String needle = "";
		int res = strStr(haystack, needle);
		System.err.println("### result = " + res);
	}

	public static int strStr(String haystack, String needle) {
		if (haystack == null || needle == null || needle.isEmpty())
			return 0;
		if (haystack.isEmpty())
			return -1;
		int result = haystack.indexOf(needle);
		return result;
	}
}
