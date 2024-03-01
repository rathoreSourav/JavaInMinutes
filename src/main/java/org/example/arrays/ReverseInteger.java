package org.example.arrays;

public class ReverseInteger {
    public static void reverseInt(int num){
        //num = 12345, i need 54321
        StringBuilder reverse = new StringBuilder();
       // int input = num % 10;
        while(num > 0){
            reverse.append(num % 10);
            num = num/10;
        }
        System.out.println(reverse.toString());
    }

    public static void main(String[] args) {
        reverseInt(12345);
    }
}
