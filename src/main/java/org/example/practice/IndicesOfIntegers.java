package org.example.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IndicesOfIntegers {
    public static int[] indicesOfTwoIntegers(int[] arr, int k){
        Map<Integer, Integer> seenNumber = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            int target = k;
            if(k % arr[i] == 0)
                 target = k/arr[i];
            if(seenNumber.get(target)!=null)
                return new int[] {i, seenNumber.get(target).intValue()};
            else{
                seenNumber.put(arr[i], i);
            }
        }
        throw new RuntimeException("No such numbers");
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,9};
        System.out.println(Arrays.toString(indicesOfTwoIntegers(arr, 9)));
    }
}
