package leetcode;

import java.util.HashMap;

/*
Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters.
No two characters may map to the same character, but a character may map to itself.
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s==null || t==null) return false;
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> map = new HashMap<>();
        HashMap<Character,Character> mapT = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))||mapT.containsKey(t.charAt(i))){
                if(map.get(s.charAt(i))==null || t.charAt(i)!=map.get(s.charAt(i))) return false;
                if(mapT.get(t.charAt(i))==null || s.charAt(i)!=mapT.get(t.charAt(i))) return false;
            } else{
                map.put(s.charAt(i),t.charAt(i));
                mapT.put(t.charAt(i),s.charAt(i));
            }
        }
        return true;
    }
}
