package org.example.leetcode.medium;

public class SwapWithouthThirdVAr {
    public static void swapVar(int a, int b){
        //a  = 4 and b = 9
        //a = a + b = 13
        //b = a-b  =13-9 = 4
        //a = a-b = 13 - 4 = 9
        a = a + b;
        b = a-b;
        a = a-b;
        System.out.println("a = "+ a + "and b = "+ b);
    }
    public static boolean isPalindroom(String str){
        StringBuilder sb = new StringBuilder(str.toLowerCase());
        return sb.equals(sb.reverse());
    }

    public static void main(String[] args) {
        swapVar(9,4);
        System.out.println(isPalindroom("sees"));
    }
}
