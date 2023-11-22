package org.example.arrays;

import java.util.HashSet;
import java.util.Hashtable;

public class FindNumbersForProduct {

    //Remember to have a meaningful name for your function
    public static int[] findNumbersForProduct(int[] arr, int product){
        HashSet<Integer> seenNumbers = new HashSet<>();

        //start a loop only once, for the sake of Big O(n)
        for(int number: arr){
            int complement = product/number; //the required second number
            if(seenNumbers.contains(complement))
                return new int[]{number, complement};

            seenNumbers.add(complement);
        }
        return null;
    }
}



