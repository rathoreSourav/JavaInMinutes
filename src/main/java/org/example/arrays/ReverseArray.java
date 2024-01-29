package org.example.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static int[] reverseArray(int[] arr){
        int[] revArr =new int[arr.length];
        int count = arr.length-1;
        for (int num:arr) {
           revArr[count] = num;
           count --;
        }
        return revArr;
    }

    public static void main(String[] args) {
        int [] arr = {3,1,5,1,0,3,7,8,9,1,22,33,11};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }
}
