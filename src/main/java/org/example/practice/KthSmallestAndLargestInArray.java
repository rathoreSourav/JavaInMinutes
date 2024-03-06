package org.example.practice;

import java.util.PriorityQueue;

public class KthSmallestAndLargestInArray {

    public static int kThSmallest(int[] arr, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b)-> a-b);
        for(Integer element: arr){
            minHeap.offer(element);
        }
        int curr = 0;
        int res = Integer.MIN_VALUE;
        while(curr < k){
            res = minHeap.poll();
            curr++;
        }
        return res;
    }

    public static int ktHLargest(int[] arr, int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b)->b-a);
        for(Integer element: arr){
            maxHeap.offer(element);
        }
        int curr = 0;
        int res = Integer.MIN_VALUE;
        while(curr < k){
            res = maxHeap.poll();
            curr++;
        }
        return res;

    }

    public static void main(String[] args) {
        int[] arr = {-1,-9,0,1,23,4};
        System.out.println(kThSmallest(arr, 3));
        System.out.println(ktHLargest(arr, 1));
    }
}
