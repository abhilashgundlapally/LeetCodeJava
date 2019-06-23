package com.java.leetcode;

import java.util.Objects;

//* Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListNode)) return false;

        ListNode listNode = (ListNode) o;

        if (val != listNode.val) return false;
        return Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        int result = val;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }

    ListNode(int x) {
        val = x;
    }
}
