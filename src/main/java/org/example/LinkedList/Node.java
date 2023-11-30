package org.example.LinkedList;

public class Node {
    //stores teh actual data
    int value;
    //pointer to the next node
    Node next;

    public Node(int value){
        //assign the value
        this.value = value;
        //next points to null
        this.next = null;
    }
}
