package org.example.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.PriorityQueue;

public class KthSmallestAndLargestQueue {

    public static int kthSmallest(int[] arr, int K){
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) ->b-a); // a max heap
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num: arr) {
            if(!arrayList.contains(num)) {
                queue.offer(num);
                arrayList.add(num);
                if (queue.size() > K)
                    queue.poll();
            }
        }
        return queue.peek();
    }
    public static int kthLargest(int[] arr, int K){
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) ->a-b); // a min heap
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num: arr) {
            if(!arrayList.contains(num)) {
                queue.offer(num);
                arrayList.add(num);
                if (queue.size() > K)
                    queue.poll();
            }
        }
        return queue.peek();
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,5,6,7,7,8,8};
        System.out.println(kthLargest(arr, 2));
    }
}
