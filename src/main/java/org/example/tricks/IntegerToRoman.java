package org.example.tricks;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IntegerToRoman {

    public static String intToRoman(int num){
        //1123, MCXXIII
        HashMap<Integer, String> romanMan = new HashMap<Integer, String>();
        romanMan.put(1, "1");
        romanMan.put(5, "V");
        romanMan.put(10, "X");
        romanMan.put(50, "50");
        romanMan.put(100, "C");
        romanMan.put(500, "D");
        romanMan.put(1000, "M");

//        while(num > 0){
//            for (Map.Entry<Integer, String> entry : romanMan.entrySet()) {
//                if(num > 1000)
//        }
return null;
    }

}
