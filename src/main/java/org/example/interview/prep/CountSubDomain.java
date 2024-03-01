package org.example.interview.prep;

import java.util.HashMap;
import java.util.Map;

public class CountSubDomain {
    public static HashMap<String, Integer> countDomain(HashMap<String, Integer> domain){
        HashMap<String, Integer> countDomainMap = new HashMap<>();

        for(Map.Entry<String, Integer> entry: domain.entrySet()) {
            String domainStr = entry.getKey();
            int count = entry.getValue();
            String[] subDomainArr = domainStr.split("\\.");
            String subDomain = "";
            for(int i = subDomainArr.length - 1; i >=0; i--){
                subDomain = subDomainArr[i] + (subDomain.isEmpty() ? "": ".") +subDomain;
                countDomainMap.put(subDomain, countDomainMap.getOrDefault(subDomain, 0) +count);
            }
        }

        return countDomainMap;

    }

    public static void main(String[] args) {
        Map<String, Integer> countToDomain = new HashMap<>();
        countToDomain.put("google.com", 900);
        countToDomain.put("a.b.c.com", 20);
        countToDomain.put("b.c.com", 30);
        countToDomain.put("c.com", 10);

        Map<String, Integer> result = countDomain((HashMap<String, Integer>) countToDomain);
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
