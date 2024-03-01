package org.example.arrays;

import java.util.Arrays;

public class Sort0s1s2sInArray {
    // if the ith element is 0 then swap the element to the low range.
    //  Similarly, if the element is 1 then keep it as it is.
    //  If the element is 2 then swap it with an element in high range.
    public static int[] sort0s1sn2sInArray(int[] arr){
        int[] result = new int[arr.length];
        int left = 0;
        int right = arr.length-1;
        int onesCount =0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i]==0){
                result[left]=arr[i];
                left ++;
            }
            if(arr[i]==1){
                onesCount++;
            }
            if (arr[i] == 2){
                result[right]=arr[i];
                right--;
            }
        }
        for(int i = left; i < left + onesCount; i++){
            result[i] = 1;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,0,1,2};
        System.out.println(Arrays.toString(sort0s1sn2sInArray(arr)));
    }
}
