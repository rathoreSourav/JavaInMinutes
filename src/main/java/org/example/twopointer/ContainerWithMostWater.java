package org.example.twopointer;

import java.util.Arrays;

//https://leetcode.com/problems/container-with-most-water/
public class ContainerWithMostWater {

    public static int conatinerWithMostWater(int[] arr){

        int maxArea = 0;
        int left = 0; //start from 0
        int right = arr.length-1; //start from the end of the array

        while(left < right) {
            int height = Math.min(arr[left], arr[right]);//find the min height
            maxArea = Math.max(maxArea, height * (right - left));

            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
     }

    public static void main(String[] args) {
        //int[] arr = new int[]{1,8,6,2,5,4,8,3,7};
        //System.out.println(conatinerWithMostWater(arr));
        String[] st = {};
        st[0] = "1";
        st[1] = "2";
        System.out.println(Arrays.toString(st));

    }
}
