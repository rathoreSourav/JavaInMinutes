package org.example.arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DoorUsageTime {
    public ArrayList<int[]> doorUsage(int[] person, String[] direction){
        ArrayList<int[]> result = new ArrayList<>();
        Queue<int[]> personQueue = new LinkedList<>();

        for (int i = 0; i < person.length; i++){
            int dir = 0;
            if (direction[i].equals("Out"))
                    dir = 1;
            personQueue.offer(new int[]{i, person[i], dir});
        }

       while(!personQueue.isEmpty()){
           int time = 0;
           int defaultDir = 0;
           int now[] = personQueue.poll();
           int nowTime = now[1];
           int nowDir = now[2];
           if(nowTime > time){//no conflicts
               result.add(new int[]{nowTime, nowDir});
               time += nowTime;
               defaultDir = nowDir;
           }else{
               if(nowDir == defaultDir){//open gates
                   result.add(new int[]{nowTime, nowDir});
                   defaultDir = nowDir;
               }else{
                   result.add(new int[]{nowTime, nowDir});
                   defaultDir = nowDir;
                   time++;
               }
           }

       }
        return result;
    }
}
