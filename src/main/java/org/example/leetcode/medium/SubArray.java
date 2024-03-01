package org.example.leetcode.medium;

public class SubArray {
    //arr = 1,2,3,4
    //sub = 2,3
    public static boolean isSubArray(int[] arr, int[] subArray){
        if(subArray.length > arr.length)
            return false;
        int left = 0;
        int subLeft = 0;
        int leftLength = arr.length;
        int subLength = subArray.length;

        while(left < leftLength && subLeft < subLength){
            if(!(arr[left] == subArray[subLeft]))
                subLeft = 0;
            if(arr[left] == subArray[subLeft])
                subLeft++;
            left++;
        }
        return subLeft == subLength;
    }

    public static void main(String[] args) {
       // System.out.println(isSubArray(new int[]{1,2,3,4,5,6}, new int[]{4,5}));

        String s1 = "hello";
        String s2 = new String("hello").intern();
        boolean eq = s1 == s2;
        System.out.println(eq);
    }
}
