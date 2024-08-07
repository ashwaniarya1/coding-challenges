package leetcode;

/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.
 */
public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] sol = new int[nums.length];
        int product = 1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) product = product * nums[i];
            else count++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (count == 1) sol[i] = product;
                else sol[i] = 0;
            } else {
                if (count > 0) sol[i] = 0;
                else sol[i] = product / nums[i];
            }
        }
        if (nums.length == 1 && nums[0] == 0) sol[0] = 0;
        return sol;
    }
}
