package com.java.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DijkSortTest {

    private DijkSort sort;

    @Before
    public void init(){
        sort = new DijkSort();
    }

    @Test
    public void partition(){
        int[] arr = {1, 0, 0, 2, 1, 0};
        DijkSort.Point partition = this.sort.partition(arr, 0, 5);
    }

    @Test
    public void setSort(){
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        this.sort.sort(arr,0, arr.length-1);
        this.sort.print(arr);
        assertArrayEquals(arr, new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2});
    }
}