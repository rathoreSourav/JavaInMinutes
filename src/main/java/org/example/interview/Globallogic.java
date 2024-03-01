package org.example.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Globallogic {
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5,7,8,9};

        int sumOfNnumbers = (arr[arr.length-1] * (arr[arr.length-1] + 1))/2;
        System.out.println(sumOfNnumbers - Arrays.stream(arr).sum());


        //all letters that starts and end with same character
        String[] sArr = new String[]{"sks", "aba", "jkj", "cdd"};

        Arrays.stream(sArr).filter(str -> str.charAt(0) == str.charAt(str.length() - 1)).
                collect(Collectors.toList());
       // System.out.println(collect);
    }
}
