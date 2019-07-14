package com.java.leetcode.dynamic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnapSack_2Test {

    private KnapSack_2 sack2;

    @Before
    public void setup(){
        sack2 = new KnapSack_2();
    }

    @Test
    public void knapSack(){
        int[] profits = {1, 6, 10, 16};
        int[] weights = {1, 2, 3, 5};
        int prof = sack2.knapSack( weights, profits, 7);
        int dpProfits = sack2.knapSackDp(weights, profits, 7);
        int dpProfitsBUp = sack2.knapSackBottomUp(weights, profits, 7);
        assertEquals(prof, dpProfitsBUp);
    }

}