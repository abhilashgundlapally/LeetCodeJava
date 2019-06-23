package com.java.leetcode;

public class ReverseNodes {

    public ListNode reverseKGroup(ListNode root, int k) {
        int i = 0;
        ListNode head = root;
        ListNode tail = root;
        ListNode result = null;
        ListNode resultEnd = null;
        while (tail != null) {
            tail = tail.next;
            i++;
            if (i == k) {
                ListNode temp = reverseGroup(head, tail);
                if (result == null) {
                    result = temp;
                    resultEnd = head;
                } else {
                    resultEnd.next = temp;
                    resultEnd = head;
                }
                head = tail;
                tail = head;
                i = 0;
            }

        }

        if (i != 0) {
            if (resultEnd != null)
                resultEnd.next = head;
            else
                result = head;
        }
        return result;
    }

    public ListNode reverseGroup(ListNode head, final ListNode end) {
        ListNode node = null;
        while (head != null && head != end) {
            ListNode temp = head.next;
            head.next = node;
            node = head;
            head = temp;
        }
        return node;
    }

    public static void display(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void addNode(ListNode head, int val) {
        if (head == null) {
            return;
        }
        while (head.next != null) {
            head = head.next;
        }
        head.next = new ListNode(val);
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        ReverseNodes nodes = new ReverseNodes();
        addNode(root, 2);
        addNode(root, 3);
        addNode(root, 4);
        addNode(root, 5);
        addNode(root, 6);
        nodes.display(nodes.reverseKGroup(root, 2));
        //nodes.display(nodes.reverseGroup(root, null));
    }
}
