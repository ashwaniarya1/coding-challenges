package leetcode;

/*
Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */
public class ReverseInteger {
    public int reverse(int x) {
        int temp = x;
        long reversed = 0;
        while (temp != 0) {
            int digit = temp % 10;
            reversed = (reversed * 10) + digit;
            temp = temp / 10;
        }
        if (reversed > Math.pow(2, 31) || reversed < Math.pow(-2, 31)) return 0;
        else {
            int sol = (int) reversed;
            return sol;
        }
    }
}
