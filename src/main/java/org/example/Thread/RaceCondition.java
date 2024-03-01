package org.example.Thread;

import java.util.concurrent.atomic.AtomicInteger;

public class RaceCondition {
    private Integer count = 0;

    public synchronized void incrementCount(){
       count++;
    }
    public Integer getCount(){
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        RaceCondition rc = new RaceCondition();
        new Thread(()->{
            System.out.println("Thread 1 started");
            for (int i = 0; i < 50000; i++)
                rc.incrementCount();
            System.out.println("Thread 1 completed");
        }).start();
        new Thread(()->{
            System.out.println("Thread 2 started");
            for (int i = 0; i < 50000; i++)
                rc.incrementCount();
            System.out.println("Thread 2 completed");
        }).start();

        Thread.sleep(200);


        System.out.println(rc.getCount());
    }
}
