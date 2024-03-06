package org.example.practice;

public class ConcateStrings {

    public static String concateString(String[] strings){
        StringBuilder sb = new StringBuilder(); //O(1)
        for(String str : strings){
            sb.append(str +" "); //O(m)
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String[] str = {"this" , "is", "a", "test", "String"};
        System.out.println(concateString(str));
    }
}