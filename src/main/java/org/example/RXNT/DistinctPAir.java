package org.example.RXNT;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class DistinctPAir {

    public static int findDistinctPair(int[] arr) {
        int count = 0;
        HashSet<String> countedPair = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            String strNum = "" + arr[i];
            String[] strArr = strNum.split("");
            Arrays.sort(strArr);
            String collect = Arrays.stream(strArr).collect(Collectors.joining());
            if (countedPair.contains(collect)) {
                count++;
            } else {
                countedPair.add(collect);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {145, 514, 415};
        System.out.println(findDistinctPair(arr));
    }

}
