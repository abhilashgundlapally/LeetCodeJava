package com.java.leetcode;

import org.junit.Before;
import org.junit.Test;

public class BSTTest {

    private RandomNumber random;

    private BST bst;

    @Before
    public void init(){
        this.bst = new BST();
        this.random = new RandomNumber();
    }
    @Test
    public void insert(){
        int[] elems = this.random.getRandomNoDup(10, 10);
        for(int elem : elems) {
            this.bst.put(elem);
        }
        this.bst.delete(6);
        Iterable<Integer> iterable = this.bst.iterable();
        for(Integer integer : iterable) {
            System.out.println(integer);
        }

    }
}