package com.java.leetcode.sort;

import com.java.leetcode.RandomNumber;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {

    private MergeSort sort;

    private RandomNumber randomNumber;

    @Before
    public void init(){
        sort = new MergeSort();
        randomNumber = new RandomNumber();
    }

    @Test
    public void sort(){
        int[] data = randomNumber.getRandomNoDup(10, 20);
        int[] expected = Arrays.copyOf(data, data.length);
        sort.sort(data);
        Arrays.sort(expected);
        assertArrayEquals(data,expected);
    }

}