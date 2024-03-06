package org.example.practice;

import java.util.PriorityQueue;

class Node{
    int data;
    Node next;
    public  Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class MergeSortedLinkedList {

    public static Node mergeKSortedLists(Node[] nodes){
        //create a min headp
        PriorityQueue<Node> minHeap = new PriorityQueue<>((a,b)-> a.data - b.data);

        //add all the node to minHeap
        for(Node node : nodes){
            if(node != null)
                minHeap.offer(node);
        }

        //create result node
        Node resultHead = new Node(0);
        Node resultTail = resultHead;

        //poll smallest from minheap and add it to result tail node
        while(!minHeap.isEmpty()){
            Node smallest = minHeap.poll();//will return the smallest node
            resultTail.next = smallest;
            resultTail = resultTail.next;

            //update the minHeap with next smallest node
            if(smallest.next != null)
                minHeap.offer(smallest.next);
        }

        return resultHead.next;
    }

    public static void main(String[] args) {
        Node node1 = new Node(11);
        node1.next = new Node(12);
        node1.next.next = new Node(13);

        Node node2 = new Node(1);
        node2.next = new Node(2);
        node2.next.next = new Node(15);

        Node[] nodeArr = {node1, node2};
        Node res = mergeKSortedLists(nodeArr);

        while(res != null) {
            System.out.println(res.data);
            res = res.next;
        }

    }
}
