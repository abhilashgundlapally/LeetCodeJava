package com.java.leetcode.dynamic;


import java.util.Map;

// v[i,w] = max( v[i-1,w], val[i] + v[i-1, w - wt[i] )
public class KnapSack{

    public int sack(int[] items, int[] weights, int capacity){
        //v[i,w] = max( v[i-1,w], val[i] + v[i-1, w - wt[i] )

        int[][] v = new int[items.length+1][capacity+1];
        for( int i = 0; i <= items.length ; i++ ){
            for( int w = 0; w <= capacity; w++ ){
                if( i == 0 || w == 0 )
                    v[i][w] = 0;
                else if( weights[i-1] <= w){
                    v[i][w] = Math.max( v[i-1][w], items[i-1] + v[i-1][w-weights[i-1]]);
                }else
                    v[i][w] = v[i-1][w];
            }
        }

        return v[items.length][capacity];
    }

}
