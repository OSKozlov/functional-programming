package com.leetcode.java;

public class MergeSortedArray {
	
	public static void main(String[] args) {
		
		int[] nums1 = {0}; 
	    int m = 0;
		int[] nums2 = {1};       
		int n = 1;
		
		merge(nums1, m, nums2, n);
		
		for(int num: nums1) {
			System.out.print(num + " ");
		}
	}

	private static void merge(int[] nums1, int m, int[] nums2, int n) {
		
		int last = m + n - 1;
		int i = m - 1;
		int j = n -1;
		
		while(i>=0 && j>=0)
			nums1[last--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
		while(i>=0)
			nums1[last--] = nums1[i--];
		while(j>=0)
			nums1[last--] = nums2[j--];
        
    }
}
