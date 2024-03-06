package org.example.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LongestCommonSubSequence {

    public static String longestCommonSubSequence(String input1, String input2){
        //asdfghijk
        //asdfhkl
        //asdf
        int curr = 0;
        int in2Curr = 0;
        int maxLength = -1;

//        while(curr < input1.length() && curr < input2.length()){
//            if(input1.charAt(curr) == input2.charAt(curr))
//        }
return  null;
    }

    public static void main(String[] args) {

       HashMap<Object, Integer> testMap = new HashMap();
       Object obj1 = new Object();
       Object obj2 = obj1;
       testMap.put(obj1, 1);
       testMap.put(obj2, 2);

        System.out.println(testMap.get(obj1));

        String str = "This is a test string"; //answer = h

        String key = Arrays.stream(str.split(""))//O(n)
                .collect(
                        Collectors.groupingBy(c -> c.toLowerCase(), LinkedHashMap::new, Collectors.counting())//On
                ).entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1) //om
                .findFirst()
                .get()
                .getKey();

        System.out.println(key);
    }
}
