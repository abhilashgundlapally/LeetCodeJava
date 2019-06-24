package com.java.leetcode.recursion;

public class RecursionExample {

    public int factorial(int accumulator, int n){
        if(n == 1) return accumulator;

        return factorial(accumulator*n, n-1);
    }


    public int tail(int n){
        if(n == 1) return 1;
        System.out.println(n);
        return tail(n-1);
    }


    public int head(int n){
        if(n == 1) return 1;
        int tail = head(n - 1);
        System.out.println(n);
        return tail;
    }

    public void towers(int n, char from, char aux, char to){
        if(n > 0) {
            towers(n - 1, from, to, aux);
            System.out.println("Move from : " + from + " to: " + to + " ,aux: " + aux);
            towers(n - 1, aux, from, to);
        }
    }

}
