package org.example.streams;

import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static String removesDuplicateFromString(String input){

      return input.chars().mapToObj(ch -> (char) ch)
              .distinct()
              .map(Objects::toString)
              .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(removesDuplicateFromString("asaaasdsadasdasdaskdaskedakdka"));
    }
}
