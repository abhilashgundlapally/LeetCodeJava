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

    public int sack(int i, int W, int[] items, int[] weights){

        if( i== 0  || W == 0){
            return 0;
        }

        if( weights[i-1] > W){
            return sack(i-1, W, items, weights);
        }

        return Math.max(sack(i-1, W, items, weights), items[i-1] + sack(i-1, W - weights[i-1], items, weights));
    }

    public int min = Integer.MAX_VALUE;
    public int minn = 0;

    public int currencyExchange(int[] items, int num, int sum, int count){

        if( sum == 0){
            if( min > count ){
                min = count;
                minn = 1;
            }else if( min == count){
                minn++;
            }
            return 1;
        }

        if( sum < 0 )
            return 0;

        if( num < 0  )
            return 0;

        return currencyExchange(items, num - 1, sum, count) + currencyExchange(items, num, sum - items[num], ++count);
    }

    public int getMin(){
        return minn;
    }


    public int maxPrice = -1;
    public void rod_cutting(int lengths[], int price[], int index, int rodLength, int mprice){

        if( rodLength < 0 || index < 0)
            return ;

        if( rodLength == 0 ){
            if(mprice > maxPrice)
                maxPrice = mprice;
        }
        if( rodLength < lengths[index] )
            rod_cutting(lengths, price, --index, rodLength, mprice );
        else
            rod_cutting(lengths, price, index, rodLength - lengths[index], mprice + price[index]);

        rod_cutting(lengths, price, --index, rodLength, mprice);
    }
}

