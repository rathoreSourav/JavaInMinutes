package org.example.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> findTriplets(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>>result = new ArrayList<>();

        //loop thru the sorted array
        for (int i = 0; i < arr.length-2; i++){
            //use two pointer approach
            int left = i+1;
            int right = arr.length-1;

            //find the other two numbers
            while(left < right){
                int total = arr[i] + arr[left] + arr[right];
                if(total == 0) {//found the triplets
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    //skip duplicates
                    while (left < right && arr[left] == arr[left + 1])
                        left++;

                    while (left > right && arr[right] == arr[right - 1])
                        right--;
                    left++;
                    right--;
                }
                //skip duplicates
                else if(total > 0)
                    right--;
                else if(total < 0)
                    left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-1,0,1,2,-2,1};
        System.out.println(findTriplets(arr));
    }

}
