package org.example.leetcode.medium;

import java.util.HashSet;

public class LongestSubString {
    public static int longestSubString(String str) {
        StringBuilder result = new StringBuilder();
        HashSet hashSet = new HashSet();
        int currPointer = 0;
        int strPointer = 0;
        while (currPointer < str.length()) {
            strPointer = currPointer;
            StringBuilder longestSubString = new StringBuilder();
            while (strPointer < str.length()) {
                if (hashSet.contains(str.charAt(strPointer))) {
                    if (result.length() < longestSubString.length())
                        result = longestSubString;
                    longestSubString = new StringBuilder();
                    hashSet.clear();
                    currPointer++;
                    strPointer = currPointer;
                } else {
                    hashSet.add(str.charAt(strPointer));
                    longestSubString.append(str.charAt(strPointer));
                    if (result.length() < longestSubString.length())
                        result = longestSubString;
                    strPointer++;
                }
            }
        }
        return result.length();
    }

    public static void main(String[] args) {
        System.out.println(longestSubString(" "));
    }
}