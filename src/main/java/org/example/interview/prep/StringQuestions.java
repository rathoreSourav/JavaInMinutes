package org.example.interview.prep;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringQuestions {

    public static void main(String[] args) {
        String str1 = "this is a stringg";
        String str2 = "this is a string";

        System.out.println(canGenerate(str1,str2));
        System.out.println(canGenerateNonRepeating(str1,str2));



        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 30);
        map.put("C", 20);
        map.put("D", 40);
        map.put("D", 50);
        map.put("D", 60);

        String s = map.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
        System.out.println(s);


        String test = "This is a tsring from which I need to return the character having highest frequency";
        Map.Entry<Character, Long> characterLongEntry = test.chars().mapToObj(c -> (char) c)
                .filter(c -> c != ' ')
                .collect(Collectors
                        .groupingBy(
                                Function.identity(),
                                HashMap::new,
                                Collectors.counting())
                ).entrySet().stream().max(
                        Map.Entry.comparingByValue())
                .orElse(null);
        System.out.println("character is : " + characterLongEntry);
    }
    static boolean canGenerate(String toGenerate, String generator){
        HashSet<String> toGenerateSet = new HashSet<>(Arrays.asList(toGenerate.split("")));
        HashSet<String> generatorSet = new HashSet<>(Arrays.asList(generator.split("")));
        if(generatorSet.containsAll(toGenerateSet))
            return true;
        return false;
    }

    static boolean canGenerateNonRepeating(String toGenerate, String generator){
        List<String> toGenerateList = Arrays.asList(toGenerate.split(""));
        List<String> generatorList = Arrays.asList(generator.split(""));

        if(toGenerateList.containsAll(generatorList)&& toGenerateList.size() == generatorList.size())
                return true;

        return false;


    }
}
