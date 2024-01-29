package org.example.twopointer;

import java.util.Arrays;

public class MoveZeroes {

    public static void moveZeroestoTheEnd(int[] arr){
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                //swap when non zero
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,0,2,2,0,3};
        moveZeroestoTheEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
