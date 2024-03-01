package org.example.RXNT;

import java.util.regex.*;

public class SentenceAlignment {

    public static String alignText(String text, int width) {
        StringBuilder alignedText = new StringBuilder();
        String[] line = text.split("(?<=[\\.\\?\\!]\\s)+");
        for(String sentence: line){
            int length = 0;
            StringBuilder alignedLine = new StringBuilder();
            String[] sent = sentence.split(" ");

            for(String word: sent){
                if(length + word.length() <= width){
                    alignedLine.append(word).append(" ");
                    length += word.length() + 1;
                }else{
                    alignedText.append("*  ").append(alignedLine.toString().trim()).append("*\n");
                    alignedLine = new StringBuilder(word +" ");
                    length = word.length()+1;
                }
            }
            alignedText.append("* ").append(alignedLine.toString().trim()).append(" *\n");
        }
        return alignedText.toString();
    }

    public static void main(String[] args) {
        String text = "This is a sample text. It contains multiple sentences, such as this one! And another one? This is the last one.";
        String alignedText = alignText(text, 20);
        System.out.println(alignedText);
    }
}
