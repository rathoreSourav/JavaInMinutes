package org.example.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfElement {

    public static HashMap<String, Long> frequencyOfEleInArr(String[] arr){
    return Arrays.asList(arr).stream()
            .collect(
            Collectors.groupingBy(
                    Function.identity(),
                    HashMap::new, // can be skipped //has to be casted
                    Collectors.counting()
            )
    );
    }
    public static void main(String[] args) {
        String[] array = {"new", "String", "array"};
        List<String> list = Arrays.asList(array);
        System.out.println(frequencyOfEleInArr( array));
    }
}