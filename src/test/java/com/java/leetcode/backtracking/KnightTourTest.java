package com.java.leetcode.backtracking;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class KnightTourTest {

    private KnightTour tour;

    @Before
    public void init(){
        tour = new KnightTour(8);
    }

    @Test
    public void tours(){

        System.out.println(tour.knightTour(0,0,0));

        for(int i = 0; i < tour.getTours().length; i++) {
            System.out.println(Arrays.toString(tour.getTours()[i]));
        }
    }
}