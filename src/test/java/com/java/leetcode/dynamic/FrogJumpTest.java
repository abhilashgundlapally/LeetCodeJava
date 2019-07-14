package com.java.leetcode.dynamic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrogJumpTest{

    private FrogJump frogJump;

    @Before
    public void before(){
        frogJump = new FrogJump();
    }

    @Test
    public void jumps(){
        frogJump.jump(new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}, 0, 0);
        assertEquals(3, frogJump.min);
    }
}