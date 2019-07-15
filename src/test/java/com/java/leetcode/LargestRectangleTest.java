package com.java.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LargestRectangleTest{

    private LargestRectangle rectangle;

    @Before
    public void setUp(){
        rectangle = new LargestRectangle();
    }

    @Test
    public void largestRectangle(){
        assertEquals(rectangle.largestRectangle(new int[]{2, 1, 5, 6, 2, 3}), 10);
        assertEquals(rectangle.largestRectangle(new int[]{2, 1, 1, 1, 1, 5, 5}),10);
        assertEquals(rectangle.largestRectangle(new int[]{2, 1, 5, 6, 12, 11, 1, 4}),22);
    }
}