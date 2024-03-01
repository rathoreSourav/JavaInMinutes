package org.example.arrays;

import java.util.*;

public class TripletsWithSumZero {

    public static List<int[]> findTripletsWithSumZeroContagious(int[] arr){
        List<int[]> result = new ArrayList<>();
        int sum = 0;
        final int triple = 3;
        for (int i = 0; i < arr.length - 2; i++){
            int first = arr[i];
            int second = arr[i+1];
            int third = arr[i+2];
            sum = first + second + third;
            if( sum == 0){
                result.add(new int[]{first, second, third});
                sum = 0;
            }
        }
        return result;
    }

    public static List<int[]> findTripletsWithSumZero(int[] arr){
        List<int[]> result = new ArrayList<>();

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++){
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int target = -arr[i];
            int left = i + 1;
            int right = arr.length - 1;

            while(left < right){
                int sum = arr[left] + arr[right];
                if(sum == target){
                    //add to result
                    result.add(new int[]{arr[left], arr[target], arr[right]});
                    left++;
                    right--;

                    while(left < right && arr[left] == arr[left-1])
                        left++;
                    while(right < left && arr[right] == arr[right + 1])
                        right--;
                }else if( sum < target)
                    left++;
                else
                    right--;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<int[]> tripletsWithSumZero = findTripletsWithSumZero(arr);
        for (int[] res: tripletsWithSumZero) {
            System.out.println(Arrays.toString(res));
        }
    }

}
