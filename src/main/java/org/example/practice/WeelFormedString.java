package org.example.practice;

import java.nio.charset.CharsetEncoder;
import java.util.Stack;

public class WeelFormedString {
    final static char openingBracket = '(';
    final static char closingBracket = ')';
    final static char openingCurly = '{';
    final static char closingCurly = '}';
    final static char openingSquare = '[';
    final static char closingSquare = ']';

    public static boolean isWellFormedString(String str){

        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()){
            if(c == openingBracket || c == openingCurly || c == openingSquare)
                stack.push(c);
            else{
                char popChar = stack.pop();
                if(c == openingBracket && popChar != closingBracket ||
                        c ==openingSquare && popChar != closingSquare||
                        c == openingCurly && popChar != closingCurly){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String test = "(((){}))";
        System.out.println(isWellFormedString(test));
    }
}
