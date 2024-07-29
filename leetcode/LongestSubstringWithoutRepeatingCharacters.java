package leetcode;

import java.util.HashMap;

/*
Given a string s, find the length of the longest substring without repeating characters.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        int i = 0;
        int max = 0;
        int sum = 0;
        int j;
        HashMap<Character, Integer> map = new HashMap<>();
        for (j = 0; j < s.length(); j++) {
            if (!map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), j);
                sum++;
                if (j == s.length() - 1) {
                    if (sum < j + 1 - i && max < j + 1 - i) max = j + 1 - i;
                }
            } else {
                int m = map.get(s.charAt(j));
                if (m >= i) {
                    if (sum < (j - i) && max < (j - i)) {
                        max = j - i;
                    } else if (max < sum) max = sum;
                    i = m + 1;
                    sum = j + 1 - i;
                } else {
                    sum++;
                }
                map.put(s.charAt(j), j);
            }
        }

        if (sum > max) {
            return sum;
        }
        return max;
    }
}
