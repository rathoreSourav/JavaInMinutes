package org.example.streams;

import java.util.*;

public class LongestSubString {

    public static void main(String[] args) {
        String str = "abcdeefghijkeklmnhfosa";

        int left = 0;
        int right = 0;

        List<String> result = new ArrayList<>();
        List<String> curr = new ArrayList<>();

        while(left < str.length() && right < str.length()){
            if(!result.contains(str.charAt(right)+"")) {
                result.add(str.charAt(right)+"");
                right++;
            }else {
                curr = new ArrayList<>(result);
                result = new ArrayList<>();
                left++;
                right = left;
            }
        }
        if(curr.size() > result.size())
            System.out.println(curr);
        else
            System.out.println(result);
      //  Arrays.stream(str.split("")).map
    }
}
