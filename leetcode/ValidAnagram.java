package leetcode;

import java.util.HashMap;

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s==null || t==null) return false;
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int count = map.get(s.charAt(i));
                map.put(s.charAt(i),count+1);
            } else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(!map.containsKey(t.charAt(i))) return false;
            else{
                int count = map.get(t.charAt(i));
                if(count==0) return false;
                else map.put(t.charAt(i),count-1);
            }
        }
        return true;
    }
}
