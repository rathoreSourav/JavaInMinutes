package org.example.twopointer;

import java.util.Arrays;

public class ReverseArray {
    public static void reverseArays(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            //swap characters
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        reverseArays(arr);
        System.out.println(Arrays.toString(arr));
    }
}
