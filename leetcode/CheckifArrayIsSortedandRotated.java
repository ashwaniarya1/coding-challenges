package leetcode;

/*
Given an array nums, return true if the array was originally sorted in non-decreasing order,
then rotated some number of positions (including zero). Otherwise, return false.

There may be duplicates in the original array.

Note: An array A rotated by x positions results in an array B of the same length such that
A[i] == B[(i+x) % A.length], where % is the modulo operation.
 */
public class CheckifArrayIsSortedandRotated {
    class Solution {
        public boolean check(int[] nums) {
            int rotate =0;
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]>nums[i+1]) rotate++;
                if(rotate>1) return false;
            }
            if(rotate==1){
                if(nums[0]<nums[nums.length-1]) return false;
            }
            return true;
        }
    }
}
