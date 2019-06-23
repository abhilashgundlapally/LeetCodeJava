package com.java.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class HeapSortTest {

    private HeapSort sort;

    @Before
    public void init() {
        this.sort = new HeapSort(10);
    }

    @Test
    public void add() {
        int[] data = new int[]{7, 5, 9, 1, 0, 8, 13, 10, 11, 6};
        for (int datum : data) {
            this.sort.add(datum);
        }
        int[] result = {0, 13, 11, 9, 10, 6, 7, 8, 1, 5, 0};
        assertArrayEquals(this.sort.getData(), result);
        assertEquals(this.sort.getMax(), 13);
        assertEquals(this.sort.getMax(), 11);
    }

    @Test
    public void sort() {
        int[] data = new int[]{7, 5, 9, 1, 0, 8, 13, 10, 11, 6};
        for (int datum : data) {
            this.sort.add(datum);
            //System.out.println(Arrays.toString(this.sort.getData()));
        }
        int[] result = {0, 13, 11, 9, 10, 6, 7, 8, 1, 5, 0};
        assertArrayEquals(this.sort.getData(), result);
        int[] sorted = new int[data.length];
        for(int i = 0; i < this.sort.getData().length - 1; i++) {
            sorted[i] = this.sort.getMax();
            System.out.println(Arrays.toString(this.sort.getData()));
        }
        System.out.println(Arrays.toString(sorted));
    }
}