package com.java.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class RandomNumberTest {

    private RandomNumber randomNumber;

    @Before
    public void init(){
        randomNumber = new RandomNumber();
    }

    @Test
    public void getRandom(){
        int[] randomNumbers = this.randomNumber.getRandomNumbers(10, 15);
        System.out.println(Arrays.toString(randomNumbers));
        System.out.println(Arrays.toString(this.randomNumber.getRandomNumbers(10, 2)));
    }

    @Test
    public void getRandomNoDup(){
        int[] randomNoDup = this.randomNumber.getRandomNoDup(10, 15);
        System.out.println(Arrays.toString(randomNoDup));
    }
}