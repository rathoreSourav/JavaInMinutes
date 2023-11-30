package org.example.doubleLL;

public class Node {
    //the actual data
    int data;
    //pointer to left and right
   Node left, right;

    //constructor
    public Node(int data){
        this.data = data; //saves the data
        this.left = this.right = null; //left and right points to null
    }
}
