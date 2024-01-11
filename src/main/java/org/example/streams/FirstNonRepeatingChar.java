package org.example.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {

    public static void findFirstNonRepeatingCharacter(String input) {
        Optional<Character> first = input.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Character::toLowerCase, Collectors.counting()))
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
