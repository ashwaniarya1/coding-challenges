package leetcode;
/*
Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words.
The returned string should only have a single space separating the words. Do not include any extra spaces.
*/

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String sol = "";
        int i = 0;
        int j = 0;
        int length = s.length();
        while (i < length) {
            while (i < length && s.charAt(i) == ' ') i++;
            if (i >= length) break;
            j = i;
            while (j < length && s.charAt(j) != ' ') j++;
            String word = s.substring(i, j);
            i = j + 1;
            if (sol == "") sol = word;
            else sol = word + " " + sol;
        }
        return sol;
    }
}
