package org.example.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs){
        return Arrays.stream(strs)
                .collect(Collectors.groupingBy(
                        str-> (str.charAt(0))))
                .values()
                .stream()
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        String[] words = {"eat", "early", "eleven", "ate", "apple", "bat"};
        System.out.println(groupAnagrams(words));

    }
}
