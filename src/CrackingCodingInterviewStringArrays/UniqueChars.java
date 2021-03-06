package CrackingCodingInterviewStringArrays;

import java.util.HashMap;

public class UniqueChars {
    /*
        Implement an algorithm to determine if a string has all unique characters. What if you can not use additional data structures?
    Assume you have a method isSubstring which checks if one word is a substring of another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring (i.e., “waterbottle” is a rotation of “erbottlewat”). ________________________________________________________________pg 103
     */

    public static void main(String[] args) {
        String s = "deepti";
        System.out.println(s);
        System.out.println(isUniqueChars(s));

        s = "abcd";
        System.out.println(s);
        System.out.println(isUniqueChars(s));

        s = "dep ";
        System.out.println(s);
        System.out.println(isUniqueChars(s));

        s = "abcd abcd";
        System.out.println(s);
        System.out.println(isUniqueChars(s));

        s = "abcd        ";
        System.out.println(s);
        System.out.println(isUniqueChars(s));

        s = "abcdABCD";
        System.out.println(s);
        System.out.println(isUniqueChars(s));

    }
    public static boolean isUniqueChars(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        String normalized = s.trim().toLowerCase();
        System.out.println(normalized);
        for (int i = 0; i < normalized.length(); i++) {
            char c  = s.charAt(i);
            if (map.containsKey(c)) return false;
            else {
                map.put(c,map.get(c));
            }
        }
        return true;
    }
}
