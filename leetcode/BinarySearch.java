package leetcode;

/*
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums.
If target exists, then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        return searchNum(nums, target, start, end);
    }

    private int searchNum(int[] nums, int target, int start, int end) {
        if (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) return mid;
            else if (target > nums[mid]) {
                start = mid + 1;
                return searchNum(nums, target, start, end);
            } else {
                end = mid - 1;
                return searchNum(nums, target, start, end);
            }
        } else {
            return -1;
        }
    }
}
