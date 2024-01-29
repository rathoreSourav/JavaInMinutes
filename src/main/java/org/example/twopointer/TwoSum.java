package org.example.twopointer;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                return new int[]{arr[left], arr[right]};
            }
            if(sum > target)
                right --;
            else
                left++;

        }
        throw new IllegalArgumentException("No Such combinations found...");
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,1,2,3,5};
        System.out.println(Arrays.toString(twoSum(arr, 6)));
    }
}
