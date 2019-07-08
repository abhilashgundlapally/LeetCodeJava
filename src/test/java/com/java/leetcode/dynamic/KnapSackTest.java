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

    @Test
    public void rodCutting(){
        int[] items = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] values = {1, 5, 8, 9, 10, 17, 17, 20};

        this.sack.rod_cutting(items, values, items.length-1, 8, 0);
        assertEquals(this.sack.maxPrice, 22);
        this.sack.maxPrice = -1;
        this.sack.rod_cutting(items, values, items.length-1, 4, 0);
        assertEquals(this.sack.maxPrice, 10);

        this.sack.maxPrice = -1;
        this.sack.rod_cutting(items, values, items.length-1, 5, 0);
        assertEquals(this.sack.maxPrice, 13);
    }
}