package com.java.leetcode.dynamic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubSetTest {

    private SubSet subSet;

    @Before
    public void setup(){
        subSet = new SubSet();
    }

    @Test
    public void subset() {
        assertTrue(subSet.subset(new int[]{1, 2, 7, 1, 5}, 10));
        assertTrue(subSet.subset(new int[]{1, 2, 3, 7}, 6));
        assertFalse(subSet.subset(new int[]{1, 3, 4, 8}, 6));
    }
}