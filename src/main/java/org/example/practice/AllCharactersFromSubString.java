package org.example.practice;

import java.util.*;

public class AllCharactersFromSubString {

    public static int[] findIndex(String input, String subStr){

        int subStringSize = subStr.length();
        List<String> subStrings = Arrays.asList(subStr.split(""));
        Collections.sort(subStrings);
        Set<String> subSet = new HashSet<>(subStrings);
        int minimumWindow = Integer.MAX_VALUE;
        int[] res = new int[2];
        int start = -1;
        int end = -1;

        for(int i = 0; i < input.length(); i++) {
            if (subSet.contains(input.charAt(i) + "")) {
                Set<String> subSetCurr = new HashSet<>();
                for (int j = i + 1; j < input.length(); j++) {
                    subSetCurr.add(input.charAt(j) + "");
                    if (subSetCurr.containsAll(subSet)) {
                        if (j + 1 < minimumWindow) {
                            minimumWindow = j + 1;
                            start = i;
                            end = j;
                        }
                    }
                }
            }
        }
            //find minimum
            for(int i =start; i < end-1; i++){
                if(input.charAt(i)==input.charAt(i+1))
                    start++;
            }

        return new int[]{start, end};
    }
    public static void main(String[] args) {

        String str = "abbcdef";
        String sub = "bcd";
        System.out.println(Arrays.toString(findIndex(str, sub)));
    }
}
