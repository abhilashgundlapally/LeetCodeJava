package com.java.leetcode.dynamic;

import org.junit.Before;
import org.junit.Test;

public class KnapSackTest{

    private KnapSack sack;

    @Before
    public void init(){
        sack = new KnapSack();
    }

    @Test
    public void sack(){
        int val[] = {60, 100, 120};
        int wt[] = { 10, 20, 30};
        int W = 50;
        System.out.println(sack.sack(val, wt, W));
    }
}