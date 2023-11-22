package org.example.LinkedList;

public class CheckBST {

    private static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
    private Node root;

    public CheckBST() {
        this.root = null;
    }

    // Function to check if the binary tree is a BST
    public boolean isBST() {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    // Helper function to recursively check if a subtree is a BST
    private boolean isBSTUtil(Node node, int min, int max) {
        if (node == null) {
            return true;
        }

        // Check if the current node's data is within the valid range
        if (node.data <= min || node.data >= max) {
            return false;
        }

        // Recursively check the left and right subtrees
        // For the right subtree, update the minimum value to node.data
        return isBSTUtil(node.left, min, node.data) && isBSTUtil(node.right, node.data, max);
    }

    public static void main(String[] args) {
        CheckBST tree = new CheckBST();

        // Constructing a sample binary tree
        tree.root = new Node(10);
        tree.root.left = new Node(2);
        tree.root.right = new Node(15);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        tree.root.right.left = new Node(9);
        tree.root.right.right = new Node(16);


        // Checking if the binary tree is a BST
        if (tree.isBST()) {
            System.out.println("The binary tree is a BST.");
        } else {
            System.out.println("The binary tree is not a BST.");
        }
    }
}
