package com.java.leetcode.dynamic;

public class SubSet {

    public boolean subset(int[] nums, int capacity){
        return subsetNonDp(nums, capacity, 0);
    }

    private boolean subsetNonDp(int[] nums, int capacity, int currentIndex){
        if(capacity < 0 || currentIndex > nums.length-1)
            return false;

        if( capacity == 0 )
            return true;

        boolean status1 = false;
        if(nums[currentIndex] <= capacity)
            status1 = subsetNonDp(nums, capacity - nums[currentIndex], currentIndex + 1);

        boolean status2 = subsetNonDp(nums, capacity, currentIndex + 1);

        return status1 || status2;
    }

    public boolean subsetDp(int[] nums, int capacity){

        boolean[][] dp = new boolean[nums.length][capacity+1];

        for(int i = 0; i < nums.length; i++) {
            dp[i][0] = true;
        }
        for(int c = 1; c < capacity; c++) {
            dp[0][c] = nums[0] == c ;
        }
        for(int i = 1; i < nums.length; i++) {
            for(int c = 1; c <= capacity; c++) {

                boolean b1 = false;
                if(c >= nums[i])
                    b1 = dp[i-1][c-nums[i] -1];

                boolean b2 = dp[i-1][c];
                dp[i][c] = b1 || b2;
            }
        }
        return dp[nums.length-1][capacity];
    }
}
