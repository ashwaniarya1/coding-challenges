package leetcode;

/*
Given a binary array nums, return the maximum number of consecutive 1's in the array.
 */
public class MaxConsecutiveOnes {

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
