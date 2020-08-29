package com.leetcode.java;

import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {

    public int[] twoSum(int[] nums, int target) {
    	Map<Integer, Integer> values = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
        	if (values.containsKey(target - nums[i])) {
        		return new int[] {i, values.get(target - nums[i])};
        	}
        	values.put(nums[i],i);
        }
		return null;
    }
    
    public static void main(String[] args) {
        int[] nums = {7, 4, 11, 15};
        int target = 26;
        
        TwoSum2 sol = new TwoSum2();
        int[] result = sol.twoSum(nums, target);
        System.out.println("### result = " + result[0] + " " + result[1]);
    }
    
}
