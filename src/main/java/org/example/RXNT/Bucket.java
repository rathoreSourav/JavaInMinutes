package org.example.RXNT;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Bucket {

    public static String findBucket(String[] commands){
        HashMap<String, HashSet<String>> bucketmapSet = new HashMap<>();
        HashSet<String> fileSet = null;
        String k = "";

        for(int i = 0; i < commands.length; i++) {
            if(commands[i].contains("goto")){
                k = commands[i];
            }else{
                if(!bucketmapSet.containsKey(k)){
                    fileSet = new HashSet<>();
                    fileSet.add(commands[i]);
                    bucketmapSet.put(k, fileSet);
                }else{
                    if(!bucketmapSet.get(k).contains(commands[i])){
                        fileSet.add(commands[i]);
                        bucketmapSet.put(k, fileSet);
                    }
                }
            }
        }
        String result = "";
        int max = 0;
        for(Map.Entry<String, HashSet<String>> entry: bucketmapSet.entrySet()){
            if(entry.getValue().size() > max) {
                max = entry.getValue().size();
                result = entry.getKey();
            }
        }
        return result.substring(4);
    }

    public static void main(String[] args) {
        String[] command = {
                "goto bucketA",
                "create fileA",
                "create fileA",
                "create fileB",
                "create fileB",
                "goto bucketB",
                "create fileA",
                "create fileB",
                "create fileC",
                "goto bucketC",
                "create fileA",
        };
        System.out.println(findBucket(command));
    }
}
