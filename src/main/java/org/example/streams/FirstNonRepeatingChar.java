package org.example.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {

    public static void findFirstNonRepeatingCharacter(String input) {
        String str = "test";
        String strNew = str.substring(0,1).toUpperCase() + str.substring(1);
        System.out.println(strNew);
        Optional<String> first = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        if (first.isPresent())
            System.out.println(first.get());
        else
            System.out.println("No value found");
    }

    public static void main(String[] args) {
        String str = "hello world, hi there!";
        findFirstNonRepeatingCharacter(str);
    }
}
