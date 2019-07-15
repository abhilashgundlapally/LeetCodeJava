package com.java.leetcode.dynamic;

public class KnapSack_2 {

    public int knapSack(int[] weights, int[] profits, int capacity){
        return knapSack(weights, profits, capacity, 0);
    }

    public int knapSackDp(int[] weights, int[] profits, int capacity){
        int[][] dp = new int[capacity+1][profits.length];
        return knapSack(dp, weights, profits, capacity, 0);
    }


    private int knapSack(int[] weights, int[] profits, int capacity, int currentIndex){

        if(currentIndex > weights.length -1 || capacity <= 0) //
            return 0;

        //2 cases
        int profits1 = 0;
        if( capacity - weights[currentIndex] >= 0)
            profits1 = profits[currentIndex] + knapSack(weights, profits, capacity - weights[currentIndex], currentIndex+1);
        //
        int profits2 = knapSack(weights, profits, capacity, currentIndex+1);

        //max of profits 1 and profits 2
        return Math.max(profits1, profits2);
    }

    private int knapSack(int[][] dp, int[] weights, int[] profits, int capacity, int currentIndex){

        if(currentIndex > weights.length -1 || capacity <= 0) //
            return 0;

        //2 cases
        if(dp[capacity][currentIndex] != 0)
            return dp[capacity][currentIndex];

        int profits1 = 0;
        if( capacity - weights[currentIndex] >= 0)
            profits1 = profits[currentIndex] + knapSack(dp, weights, profits, capacity - weights[currentIndex], currentIndex+1);
        //
        int profits2 = knapSack(dp, weights, profits, capacity, currentIndex+1);

        //max of profits 1 and profits 2
        dp[capacity][currentIndex] = Math.max(profits1, profits2);
        return dp[capacity][currentIndex];
    }

    public int knapSackBottomUp(int[] weights, int[] profits, int capacity){
        //Handle parameters

        int[][] dp = new int[profits.length][capacity+1];

        for(int c = 1; c < dp[0].length; c++) {
            if(weights[0] <= c)
                dp[0][c] = profits[0];
        }

        for(int i = 1; i < dp.length; i++) {
            for(int c = 1; c <= capacity; c++) {
                int pro1 = 0;

                if(c >= weights[i])
                    pro1 = profits[i] + dp[i-1][c-weights[i]];

                int pro2 = dp[i-1][c];

                dp[i][c] = Math.max(pro1, pro2);
            }
        }

        return dp[profits.length -1][capacity];
    }

    public int knapSackBottomUpAdv(int[] weights, int[] profits, int capacity) {
        int[] dp = new int[capacity+1];

        for(int c = 0; c <= capacity; c++) {
            if(weights[0] <= c)
                dp[c] = profits[0];
        }

        for(int i = 1; i < profits.length; i++) {
            for(int c = 1; c <= capacity; c++) {
                int pro1 = 0;

                if(c >= weights[i])
                    pro1 = profits[i] + dp[c-weights[i]];

                int pro2 = dp[c];

                dp[c] = Math.max(pro1, pro2);
            }
        }
        return dp[capacity];
    }
}
