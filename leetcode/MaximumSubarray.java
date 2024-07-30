package leetcode;

/*
Given an integer array nums, find the subarray with the largest sum, and return its sum.
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        int max = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum < 0) {
                if (nums[i] >= 0 || nums[i] > sum) {
                    sum = nums[i];
                    if (max < sum) max = sum;
                } else {
                    if (max < sum) max = sum;
                }
            } else {
                if (nums[i] > sum) {
                    sum = nums[i];
                    if (max < nums[i]) max = nums[i];
                }
                if (max < sum) max = sum;
            }
        }
        return max;
    }
}
