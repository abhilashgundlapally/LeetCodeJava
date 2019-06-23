package com.java.leetcode;

import static com.java.leetcode.ReverseNodes.addNode;

public class RotatedLinkedList {

    public static ListNode rotate(ListNode head, ListNode tail){
        ListNode rhead;
        if(tail.next == null){
            return head;
        }
        else{
            rhead = rotate(head, tail.next);
            if (rhead == null)
                return null;
            if(rhead != tail && rhead.next != null){
                ListNode headTemp = rhead.next;
                ListNode tailTemp = tail.next;
                tail.next = tail.next.next;
                rhead.next = tailTemp;
                tailTemp.next = headTemp;
                rhead = rhead.next.next;
            }else{
                rhead = rhead.next;
            }
        }
        return rhead;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        addNode(root, 2);
        addNode(root, 3);
        addNode(root, 4);
        addNode(root, 5);
        addNode(root, 6);
        addNode(root, 7);

        rotate(root, root);
        ReverseNodes.display(root);
    }
}
