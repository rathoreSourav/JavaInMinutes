package org.example.leetcode.medium;

import java.util.HashMap;

public class LongestSubArrayWithSumK {

    public static int findLongestSubArrayWithSumK(int[] nums, int k){
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(0, -1);
        int maxLength = 0;
        int sum = 0;

        for(int i= 0; i < nums.length; i++){
            sum += nums[i];
            if(sumMap.containsKey(sum-k)){
                maxLength = Math.max(maxLength, i- sumMap.get(sum-k));
            }
            if(!sumMap.containsKey(k)){
                sumMap.put(sum, i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {10,5,6,3,1,3,1,1};
        System.out.println(findLongestSubArrayWithSumK(arr, 15));
    }
}
