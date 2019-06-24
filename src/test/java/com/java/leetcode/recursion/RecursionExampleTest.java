package com.java.leetcode.recursion;

import org.junit.Before;
import org.junit.Test;


public class RecursionExampleTest {

    private RecursionExample example;

    @Before
    public void init(){
        example = new RecursionExample();
    }

    @Test
    public void recursion(){
        int factorial = example.factorial(1, 5);
        System.out.println(factorial);
    }

    @Test
    public void head(){
        this.example.head(5);
    }

    @Test
    public void tail(){
        this.example.tail(5);
    }

    @Test
    public void towers(){
        this.example.towers(3, 'A', 'B', 'C');

        System.out.println("4");

        this.example.towers(4, 'A', 'B', 'C');
    }

}