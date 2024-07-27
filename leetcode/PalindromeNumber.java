package leetcode;

/*
Given an integer x, return true if x is a palindrome, and false otherwise.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String s = x + "";
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }
}
