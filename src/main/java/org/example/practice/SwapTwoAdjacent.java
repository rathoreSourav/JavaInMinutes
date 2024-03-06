package org.example.practice;

//2,3,4,5
//3,2,5,4

public class SwapTwoAdjacent {

    public static Node swapAdjacentNodes(Node node){
        Node head = node;
        while(head!= null){
            node = node.next;
            //head = head.next;
            head = head.next;

        }

        return node;
    }

    public static void main(String[] args) {
        Node node1 = new Node(11);
        node1.next = new Node(12);
        node1.next.next = new Node(13);
        node1.next.next = new Node(14);

        Node res = swapAdjacentNodes(node1);

        while(res != null){
            System.out.println(res.data);
            res = res.next;
        }

    }
}
