package org.example.tricks;

public class Capitalizeword {
    public static String capWord(String word, Character c){
        int index = -1;
        for(int i=0; i< word.length(); i++){
            if(word.charAt(i) == c){
                index = i;
                break;
            }
        }
        if(index != -1){
            return word.substring(0,index) + word.substring(index).toUpperCase();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(capWord("asdfgh", 'k'));
    }
}
