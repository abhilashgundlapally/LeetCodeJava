package com.java.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class BST {
    private class Node {
        int data;
        Node left;
        Node right;
        int count;
        int height;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
            this.count = 0;
            this.height = 0;
        }
    }

    private Node root;

    public BST() { }

    public void put(int value) {
        this.root = put(this.root, value);
    }

    private Node put(Node head, int value) {
        if(head == null) return new Node(value);

        int cmp = head.data - value;
        if(cmp > 0) head.left = put(head.left, value);
        else if(cmp < 0) head.right = put(head.right, value);
        else head.data = value;
        head.count = 1 + size(head.left) + size(head.right);
        head.height = height(head.left, head.right) + 1;
        return head;
    }

    private int height(Node left, Node right) {
        return Math.max(height(left), height(right));
    }

    private int height(Node node){
        if(node == null) return 1;
        return node.height;
    }

    public int size(){
        return size(this.root);
    }

    public int size(Node node){
        if(node == null) return 0;
        return node.count;
    }

    public int get(int value) {
        Node temp = root;
        while(temp != null) {
            if(temp.data == value) return value;
            if(temp.data > value) temp = temp.left;
            else temp = temp.right;
        }
        return -1;
    }

    public void delete(int value) {
        this.root = delete(root, value);
    }

    private Node delete(Node node, int value) {
        if(node == null) return null;
        int cmp = node.data - value;

        if(cmp > 0) node.left = delete(node.left, value);
        else if(cmp < 0) node.right = delete(node.right, value);
        else{
            if(node.right == null ) return node.left;
            if(node.left == null ) return node.right;

            Node t = node;
            node = min(t.right);
            node.right = deleteMin(t.right);
            node.left = t.left;
        }
        node.count = 1 + size(node.left) + size(node.right);
        return node;
    }

    private Node min(Node node) {
        if(node.left == null) return node;
        else
            return min(node.left);
    }

    private Node deleteMin(Node node){
        if(node.left == null) return node.right;
        node.left = deleteMin(node);
        node.count = 1 + size(node.left) + size(node.right);
        node.height = 1 + height(node.left, node.right);
        return node;
    }

    public Iterable<Integer> iterable() {
        Queue<Integer> queue = new LinkedList<>();
        inorder(this.root, queue);
        return queue;
    }

    private void inorder(Node head, Queue queue){
        if(head == null) return;
        inorder(head.left, queue);
        queue.add(head.data);
        inorder(head.right, queue);
    }

}
