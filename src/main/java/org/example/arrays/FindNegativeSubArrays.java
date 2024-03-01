package org.example.arrays;

public class FindNegativeSubArrays {

    public static int findNegativeSubArray(int[] arr){
        int count = 0;
        if(arr.length == 0)
            return 0;
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = i; j < arr.length; j++){
                sum +=arr[j];
                if(sum < 0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, -2, 4, -5, 1};
        System.out.println(findNegativeSubArray(arr));
    }
}
