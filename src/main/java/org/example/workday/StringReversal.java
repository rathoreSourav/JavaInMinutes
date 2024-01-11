package org.example.workday;

public class StringReversal {

    public static String reverseString(String input){
        char[] strArray = input.toCharArray();
        int left = 0;
        int right = input.length()-1;

        //swap the characters
        while(left < right){
            char temp = strArray[left];
            strArray[left] = strArray[right];
            strArray[right] = temp;

            left++;
            right--;
        }
        return new String(strArray);
    }

    public static void main(String[] args) {
        String input = "123456789";
        System.out.println(reverseString(input));
    }
}
