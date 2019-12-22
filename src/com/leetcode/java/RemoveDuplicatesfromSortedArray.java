package com.leetcode.java;

public class RemoveDuplicatesfromSortedArray {
	
	private static int nums[] = {1,1,2};
	
	public static void main(String[] args) {
		//{0,0,1,1,1,2,2,3,3,4};
		int size = removeDuplicates(nums);
		System.err.println("## Size = " + size);
	}
	
	private static int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int i = 0;
        
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }            
        }
        
        return i + 1;
    }
}

/*
 * Integer[] array = Arrays.stream( nums ).boxed().toArray( Integer[]::new );
 * Set<Integer> set = new HashSet<Integer>(Arrays.asList(array)); return
 * set.size();
 */