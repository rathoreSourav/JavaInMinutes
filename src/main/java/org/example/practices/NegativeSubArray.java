package org.example.practices;

public class NegativeSubArray {
    public static int findSub(int[] nums){
        int count = 0;



        for(int i =0; i < nums.length; i++){
            int sum =0;
            for(int j =i; j < nums.length; j++){
                sum += nums[j];
                if(sum < 0)
                    count++;
            }
        }
        return count;
    }
    public static int findSubOn(int[] nums){
        int count = 0;
        int left = 0;
        int right = 0;
        int n = nums.length;
        int sum = 0;
        int tempSum = 0;
        while(left < n && right < n){

            sum = sum + nums[right];
            if(sum < 0) {
                count++;
                right++;
                tempSum = sum;
            }
            else if(left < n) {
                right++;
                sum = tempSum;
            }
            else if(left == n-1){
                left++;
                right = left;
                sum = 0;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(findSub(new int[]{1, -2, 4, -5, 1}));
        System.out.println(findSubOn(new int[]{1, -2, 4, -5, 1}));
    }
}
