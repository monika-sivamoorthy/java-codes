package com.javacodes.programs.algorithms.trees;

class Node {

    int value;
    Node left;
    Node right;
    Node parent;

    public Node(int value){
        this.value = value;
        this.parent = null;
        this.left = null;
        this.right = null;
    }

}

public class BinarySearchTree {

    private Node treeRootNode;

    public BinarySearchTree(Node root){
        this.treeRootNode = root;
    }

    private Node search(int searchValue){

        Node currentNode = this.treeRootNode;
        while(currentNode != null){
            if (currentNode.value == searchValue)
                return currentNode;
            if (currentNode.value > searchValue){
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }
        }
        return null;
    }

    private void insertNode(int newValue){

        //create new node
        Node newNode = new Node(newValue);

        // Base case
        if (this.treeRootNode == null) {
            this.treeRootNode = newNode;
            return;
        }

        // search for the right position and add the value
        Node currentNode = this.treeRootNode;
        Node previousNode = null;
        while(currentNode != null){
            previousNode = currentNode;
            if (currentNode.value > newValue){
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }
        }

        newNode.parent = previousNode;
        if (previousNode.value > newValue)
            previousNode.left = newNode;
        else
            previousNode.right = newNode;

    }

    private Node findMin(Node root) throws Exception {
        Node currentNode = root;

        if (root == null) {
            throw new Exception(" node null. No elements in the tree");
        }

        while(currentNode.left != null){
            currentNode = currentNode.left;
        }

        return currentNode;

    }

    private Node findMax(Node root) throws Exception {
        Node currentNode = root;

        if (root == null) {
            throw new Exception(" node null. No elements in the tree");
        }

        while(currentNode.right != null){
            currentNode = currentNode.right;
        }

        return currentNode;
    }

    /**
     successor:
     max element in the tree will not have a successor
     1. node is left child of parent
     then successor is - min element in the right subtree, if not -> the parent is the successor
     2. node is right child of parent
     then successor is - min element in right subtree, if not -> go up until the path takes a right turn and return that node
     */
    private Node findSuccessor(int value) throws Exception {

        Node givenNode = search(value);

        if (givenNode == null) {
            throw new NullPointerException("Node doesn't exist in the tree");
        }

        if (givenNode.right != null) {
            return findMin(givenNode.right);
        } else {
            if (givenNode.parent.left == givenNode) {
                return givenNode.parent;
            }
            return findTheSuccessorInAncestor(givenNode);
        }
    }

    private Node findTheSuccessorInAncestor(Node givenNode) {

        Node currentNode = givenNode;

        if (currentNode.parent == null) // given node is root
            return null;

        while(currentNode.parent.right == currentNode){
            if (currentNode.parent == null)
                return null;
            currentNode = currentNode.parent;
        }
        return currentNode.parent;
    }

    public static void main(String[] args) {
        int[] elements = new int[]{ 17, 88, 8, 32, 65, 97, 28, 54, 82, 93, 29, 76, 80};

        BinarySearchTree tree = new BinarySearchTree(new Node(44));
        for (int e : elements){
            tree.insertNode(e);
        }

        for (int elem : elements){
            try {
                System.out.println(elem + " " + tree.findSuccessor(elem).value);
            } catch (Exception e){
                System.out.println(elem + " No successor");
            }
        }



    }

}
