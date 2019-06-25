package com.java.leetcode.dynamic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        assertEquals(sack.sack(val, wt, W), 220);
        assertEquals(sack.sack(val.length, W, val, wt), 220);
    }

    @Test
    public void currencyExchange(){
        int[] items = {336,288,378,16,319,146};
        int sum = 9212;
        System.out.println(this.sack.currencyExchange(items, items.length-1, sum, 0));
        System.out.println(this.sack.minn);
    }
}