package com.java.leetcode.dynamic;

public class FrogJump{

    public int min = Integer.MAX_VALUE;

    public void jump(int[] jumps, int index, int totatlJumps){

        if(index >= jumps.length -1){
            if( min > totatlJumps )
                min = totatlJumps;
            return ;
        }

        for( int i = 1; i <= jumps[index] ; i++ ){
            jump(jumps, index + i, totatlJumps + 1);
        }

    }

}
