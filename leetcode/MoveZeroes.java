package leetcode;

/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (j < nums.length) {
            if (nums[j] == 0) {
                j++;
                System.out.println(count + " " + j);
            } else {
                nums[i] = nums[j];
                i++;
                j++;
                count++;
            }
        }
        for (int k = count; k < nums.length; k++) {
            nums[k] = 0;
        }
    }
}
