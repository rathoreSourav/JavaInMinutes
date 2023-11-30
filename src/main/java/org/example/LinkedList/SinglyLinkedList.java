package org.example.LinkedList;

public class SinglyLinkedList {

    public static void traverseSinglyLinkedList(Node head) {
        Node curr = head; //current points to the head
        while (curr != null) { //traverse till the end of the list
            System.out.println(curr.value); //print the head
            curr = curr.next; // points to the next node
        }
    }

    public static int size(Node node) {
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }
    public static Node insertNodeAtBegining(int data, Node node){
        Node temp = node; //store the head in a temp node
        Node newNode = new Node(data); //create a new node with the given data
        node = newNode; // point the new node to the head i.e. the new head
        node.next = temp; //point the head to the next node
        return node; //return the list
    }

    public static void insertNodeAtEnd(int data, Node node){
        //create the new node with the data
        Node newNode = new Node(data);
       //if the list is empty
        if(node == null){
            node = newNode;
            return;
        }

        Node last = node.next;
        //find the tail of the list
        while(last.next != null){
            last = last.next; //keep moving to the next node until the last node is found

        }
        //after the loop is stopped the last will point to the last node in the list
        last.next = newNode;
    }

    //insert at a specific position
    public static Node insertAtSpecificPosition(int data, int position, Node node){
        //create a new node using the data
        Node newNode = new Node(data);
        boolean isValidPos = false;

        //if the position is the head, position is equal to 0
        if(position == 0){
            Node temp = node;
            node = newNode;
            node.next = temp;
            return node;
        }
        //if the position of bigger than the size
        if(size(node) < position){
            System.out.println("not a valid position");
            return node;
        }
        //else find the position
        Node curr = node.next;
        for (int i = 0; i < position-1 && curr.next!=null; i++){
            curr = curr.next;

        }
        Node temp = curr.next; //take out the current node as temp
        curr.next = newNode; // the current node points to new node
        newNode.next = temp; // the new node then point further nodes in the list
        return  node;
    }

    public static Node deleteNodeFromBegining(Node node){
        if(node==null) //empty node cannot delete
            return node;
        if(node.next!=null) {
            Node temp = node.next; //store in a temp
            node = node.next; //changed the reference of head to head.next
            return node;
        }
        return node;
    }

    public static void deleteNodeAtEnd(Node node){
        if(node==null || node.next ==null) { //empty node cannot delete or just one element
            node = null;
            return;
        }
       // traverse  to the last node
        Node last = node;
        Node prev = null;
        while(last.next != null){
            prev = last;
            last = last.next;
        }
        prev.next = null; //point the last element to null
    }

    public static void deleteNodeAtSpecificPos(int pos, Node node) {
        if (node == null || node.next == null) { //empty node cannot delete or just one element
            node = null;
            return;
        }
        // find the exact position to delete
        Node curr = node;
        Node prev = null;
        for (int i = 0; i < pos && curr.next != null; i++){
            prev = curr;
            curr = curr.next;
        }
       // prev.next = null;
        prev.next = curr.next; //skip the given position
    }

    public static boolean search(int target, Node node) {
        Node current = node;

        while (current != null) {
            if (current.value == target) {
                return true;  // Found the target value
            }
            current = current.next;
        }

        return false;  // Target value not found in the list
    }



    //declare and assigne value to a singly linked list
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        deleteNodeAtSpecificPos(1, head);
        
       // Node testNode = null;
       // traverseSinglyLinkedList(head);

        //head = insertNodeAtBegining(10,head );
        //traverseSinglyLinkedList(head);

       // insertNodeAtEnd(100,head );
      //   head = insertAtSpecificPosition(111, 4, head);
         //traverseSinglyLinkedList(head);

      //  System.out.println("size is: " + size(head));
     //   System.out.println(search(111, head));

       //head = deleteNodeFromBegining(head);
       //deleteNodeAtEnd(head);
        traverseSinglyLinkedList(head);
    }
}
