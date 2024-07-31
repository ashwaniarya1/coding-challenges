package leetcode;

import java.util.HashMap;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sol[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                int index = map.get(diff);
                sol[0] = index;
                sol[1] = i;
                break;
            } else {
                map.put(nums[i], i);
            }
        }
        return sol;
    }
}
