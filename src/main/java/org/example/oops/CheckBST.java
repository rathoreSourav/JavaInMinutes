package org.example.oops;

public class CheckBST {

    static class Node{
        int data;
        Node left, right;
    }

    static Node newNode(int data){
        Node node = new Node();
        node.data = data;
        node.left=node.right=null;

        return node;
    }

    static int minValue(Node node){
        if (node == null)
            return Integer.MAX_VALUE;

        int value = node.data;
        int leftMin = minValue(node.left);
        int rightMin = minValue(node.right);

        return Integer.min(value, Integer.min(leftMin, rightMin));
    }

    static int maxValue(Node node){
        if (node == null)
            return Integer.MIN_VALUE;

        int value = node.data;
        int leftMax = maxValue(node.left);
        int rightMax = maxValue(node.right);

        return Integer.max(value, Integer.max(leftMax, rightMax));
    }

    static boolean isBST(Node node){
        if (node == null)
            return true;

        if(node.left !=null && maxValue(node.left)> node.data) {
            System.out.println("falseddd");
            return false;
        }

        if(node.right != null && minValue(node.right)< node.data)
            return false;

        if(isBST(node.left)!=false || isBST(node.right) !=false)
            return true;

        return true;
    }

    public static void main(String[] args) {
        Node root = newNode(4);
        root.left = newNode(2);
        root.right = newNode(5);

        // root->right->left = newNode(7);
        root.left.left = newNode(1);
        root.left.right = newNode(3);
        root.right.left = newNode(7);
        root.right.right = newNode(1);
        System.out.println(isBST(root));
    }

}
