package com.leetcode.java;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// [1,3,5,6]
		// 0
		//[1,3]
		//2
		// [3,5,7,9,10]
		// 8
		int[] nums = {2,5};
		int target = 1;
		int result = searchInsert(nums, target);
		System.err.println("### result = " + result);
	}
	
	public static int searchInsert(int[] nums, int target) {
		if (nums == null) return -1;
		int len = nums.length;
		int i = 0;
		while(i < len) {
			if (target == 0) return 0;
			if (nums[i] == target) {
				return i;
			} else {
				// [3,5,7,9,10]
				if (i-1>=0 && target < nums[i] && target > nums[i-1]) {
					return i;
				} else if (i-1>=0 && target < nums[i] && target < nums[i-1]) {
					return i-1;
				}
			}
			i++;
		}
		return i;
	}

}
