package org.example.tricks;

public class StringCases {

    public static void main(String[] args) {

        String str1 = new String("abc");
        String str2 = new String("abc").intern();
        String str3 = "abc";

        System.out.println(str2 == str1);
    }
}
