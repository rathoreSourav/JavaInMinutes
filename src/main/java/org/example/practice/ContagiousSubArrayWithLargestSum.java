package org.example.practice;

//Kadene's Algortithm
public class ContagiousSubArrayWithLargestSum {
    public static int findContagiousSubArrayWithLargestSum(int[] arr){
        int currMax = arr[0];
        int maxSum = arr[0];
        int start = -1;
        int end = -1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < currMax + arr[i]){
                currMax = currMax + arr[i];
            }else{
                currMax =  arr[i];
                start = i;
            }
            if(maxSum < currMax){
                maxSum = currMax;
                end = i;
            }
        }
        System.out.println("Start: "+start +" end: "+end);
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1,-1,2,3,-9,-5, 9, 1, -1, -7, -3};
        System.out.println(findContagiousSubArrayWithLargestSum(arr));
    }
}