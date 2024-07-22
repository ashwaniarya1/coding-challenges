package leetcode;

/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;

        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                if (j == i + 1) {
                    i++;
                    j++;
                } else {
                    nums[i + 1] = nums[j];
                    i++;
                    j++;
                }
            } else {
                j++;
            }
        }
        return i + 1;

    }

}
