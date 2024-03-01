package org.example.leetcode.medium;

public class MaxSumInSubArray {

    public static int maxSumInSubArray(int[] nums){
        int currSum = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i < nums.length; i++){
            maxSum = Math.max(maxSum, currSum);
            currSum = Math.max(nums[i], currSum + nums[i]);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-6,4};
        //int[] nums = {-1,2,3};
       // int[] nums = {-1,2,3, -3, 3,4,-1};
        System.out.println(maxSumInSubArray(nums));
    }
}
