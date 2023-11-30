package org.example.LinkedList;

public class CheckCircle {

    private static class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
            this.next = null;
        }
    }

    private Node root;

    public static boolean isCircular(Node head){
        //An empty linked list is a circular linked list
        if(head==null)
            return true;

        //get the next node
        Node curr = head.next;

        //check if next points to head
        //check if not circular
        while(curr!=null && curr!=head){
           curr = curr.next;
           //the loop stops when reahces to the end or points to head

        }
        return(curr==head);
    }

    public static void main(String[] args) {
        Node node = new Node(10);
        node.next = new Node(11);
        node.next.next = new Node(11);

        System.out.println(isCircular(node)); //not circular

        node.next.next.next = node; //points back to the head
        System.out.println(isCircular(node)); //yes circular


    }
}
