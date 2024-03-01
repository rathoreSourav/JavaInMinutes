package org.example.arrays;

import java.util.Arrays;

public class MergeSortedArrays {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m+n];
        int i = 0, j = 0, k = 0;

        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){ //true
                System.out.println("i: "+i );
                merged[k++] = nums1[i++];
            }else{
                System.out.println("j: "+j );
                System.out.println("nums2: "+nums2[j] );
                merged[k++] = nums2[j++];
                System.out.println("merged: "+merged[k] );
            }
        }


        //merge remaining
        while(i < m){

            merged[k++] = nums1[i++];
        }

        while (j < n){

            merged[k++] = nums2[j++];
        }
        return merged;
    }

    public static void main(String[] args) {
        int [] num1 = new int[]{1,2,3,0,0,0};
        int [] num2 = new int[]{2,5,6};
        System.out.println(Arrays.toString(merge(num1, 3, num2, 3)));

    }
}
