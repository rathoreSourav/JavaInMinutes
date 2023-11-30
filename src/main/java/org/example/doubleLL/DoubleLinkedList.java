package org.example.doubleLL;

public class DoubleLinkedList {

    // Method to traverse and print the linked list in forward direction
    public static void traverseForward(Node node) {
        Node current = node;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.right; // move to the right
        }
        System.out.println();
    }
    // Method to traverse and print the linked list in backward direction
    public static void traverseBackward(Node node) {
        Node current = node;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.left; // move to the left
        }
        System.out.println();
    }

    public static Node insertAtBegining(int data, Node node){
        Node newNode = new Node(data);
        newNode.left = node;
        newNode.right = node.right;
        return  newNode;

    }
    public static Node insertAtEnd(int data, Node node) {
        Node newNode = new Node(data);
        //for an empty linked list
        if (node == null) {
           return newNode;
        }

        Node current = node;
        while (current.right != null) {
            current = current.right;
        }

        current.right = newNode;
        newNode.left = current;
        return node;
    }
    // Method to insert a new node at a specific position in the doubly linked list
    public static void insertAtPosition(int data, int position, Node head) {
        Node newNode = new Node(data);

        if (position == 0) {
            newNode.right = head;
            if (head != null) {
                head.left = newNode;
            }
            head = newNode;
            return;
        }

        Node current = head;
        int currentPosition = 0;

        // Traverse to the specified position or the end of the list
        while (currentPosition < position - 1 && current != null) {
            current = current.right;
            currentPosition++;
        }

        if (current == null) {
            System.out.println("Invalid position. Node not inserted.");
            return;
        }

        newNode.right = current.right;
        newNode.left = current;
        if (current.right != null) {
            current.right.left = newNode;
        }
        current.right = newNode;
    }

    public static void main(String[] args) {
      Node node = new Node(1);
      node.right = new Node(3);
      node.left = new Node(5);
      node.left.left = new Node(7);

      traverseBackward(node);
        traverseForward(node);
     // node = insertAtBegining(11, node);
     // node = insertAtEnd(111, node);
      insertAtPosition(111, 2, node);
      //traverseForward(node);
      traverseBackward(node);
      traverseForward(node);
    }
}
