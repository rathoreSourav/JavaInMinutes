package org.example.arrays;

public class NegativeSubArrays {
    public static int findNegativeSubArrays(int[] nums){
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n; i++){
           int sum = 0;
            for(int j = i; j < n ; j++){
                sum += nums[j];
                if(sum < 0){
                    count++;
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
     //   System.out.println( 0< 0);
        System.out.println(findNegativeSubArrays(new int[]{1, -2, 4, -5, 1}));
    }
}
