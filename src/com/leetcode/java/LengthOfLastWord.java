package com.leetcode.java;

public class LengthOfLastWord {
	
	public static void main(String[] args) {
		int result = lengthOfLastWord("         ");
		System.out.println("## result = " + result);
	}
	
	public static int lengthOfLastWord(String s) {
		if (s == null || s.isEmpty()) return 0;
		String[] arr = s.split(" ");
		if (arr.length == 0) return 0;
		int length = arr.length-1;
		String lastWord = arr[length];
		return lastWord.length();
	}

}
