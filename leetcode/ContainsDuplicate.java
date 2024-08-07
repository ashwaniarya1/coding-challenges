package leetcode;

import java.util.HashMap;

/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) return true;
            else map.put(nums[i], 1);
        }
        return false;
    }
}
