package leetcode;

/*
You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num,
or an empty string "" if no odd integer exists.
A substring is a contiguous sequence of characters within a string.
 */
public class LargestOddNumberInString {
    public String largestOddNumber(String num) {
        String sol = "";
        if (num == null) return sol;
        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            int digit = c - '0';
            if (digit % 2 == 1)
                return num.substring(0, i + 1);
        }
        return sol;
    }
}
