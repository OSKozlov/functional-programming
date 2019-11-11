package com.leetcode.java;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                int complement = target - nums[i];
                if (nums[j] == complement) {
                    return new int[] {i, j};   
                }
            }
        }
        
        throw new IllegalArgumentException();
    }
    
    public static void main(String[] args) {
        int[] nums = {7, 4, 11, 15};
        int target = 26;
        
        TwoSum sol = new TwoSum();
        int[] result = sol.twoSum(nums, target);
        System.out.println("## Result = " + result.toString()); 
    }
}