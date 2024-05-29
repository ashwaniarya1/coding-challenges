package leetcode;

/*
Given an array nums containing n distinct numbers in the range [0, n],
 return the only number in the range that is missing from the array.
 */
public class MissingNumber {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int now = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                ++now;
                if (max < now) max = now;
            } else {
                now = 0;
            }
        }
        return max;
    }

}
