package com.leetcode.java;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		int target = 7;
		int result = searchInsert(nums, target);
		System.err.println("### result = " + result);
	}
	
	public static int searchInsert(int[] nums, int target) {
		if (nums == null) return -1;
		int i = 0;
		while(i < nums.length) {
			if (nums[i] == target) {
				return i;
			} else {
				if (target < nums[i+1]) {
					return i+1;
				}
			}

			i++;
		}
		return i;
	}

}
