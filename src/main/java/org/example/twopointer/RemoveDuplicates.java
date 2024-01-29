package org.example.twopointer;

import java.util.Arrays;

// the other approach is using an HashSet constructor, and then reverting back to array
public class RemoveDuplicates {

    public static int removeDuplicatesFromArray(int[] arr){
        if(arr.length == 0)
            return 0;

        int i = 0;
        for (int j = 1; j < arr.length; j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,2,3,3,3,4};
        System.out.println(Arrays.toString(Arrays.copyOf(arr, removeDuplicatesFromArray(arr))));
    }
}
