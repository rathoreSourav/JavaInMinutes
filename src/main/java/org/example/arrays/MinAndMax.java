package org.example.arrays;

import java.util.Arrays;

public class MinAndMax {
    public static int[] minAndMaxInArray(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for ( int num: arr) {
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }

        return new int[]{min, max};
    }

    //driver code
    public static void main(String[] args) {
        int [] arr = {3,1,5,1,0,3,7,8,9,1,22,33,11};
        System.out.println(Arrays.toString(minAndMaxInArray(arr)));
    }
}