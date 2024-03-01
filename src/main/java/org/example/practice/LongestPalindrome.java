package org.example.practice;

public class LongestPalindrome {

    private static boolean isPalindrome(String str){
        StringBuilder sb = new StringBuilder(str).reverse();
        return sb.toString().equals(str);
    }
    public static String longestPalindrome(String str){
        //brute force
        int max = 0;
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            sb =  new StringBuilder();
            sb.append(str.charAt(i)+"");
            for(int j = i + 1; j < str.length(); j++){
                sb.append(str.charAt(j)+"");
                if(isPalindrome(sb.toString())){
                    if(max < sb.length()){
                        max = sb.length();
                        result = new StringBuilder(sb);
                    }
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int i = 8;
        Integer j = i;
        Integer k = j;

        System.out.println(k);
        String str = "abbacdc";
        System.out.println(longestPalindrome(str));
    }
}
