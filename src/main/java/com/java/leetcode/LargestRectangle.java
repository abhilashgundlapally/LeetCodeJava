package com.java.leetcode;


/**
 *  ( 1 + greaterThanLeft(num) +  greaterThanRight(num)  ) * num
 */
class LargestRectangle{

    private int greaterThanLeft(int[] list, int num, int index){
        int count = 0;
        for( ; index >= 0; index-- ){
            if( list[index] >= num )
                count++;
        }
        return count;
    }

    private int greaterThanRight(int[] list, int num, int index ){
        int count = 0;
        for( ; index < list.length ; index++  ){
            if( list[index]  >= num )
                count++;
        }
        return count;
    }


    int largestRectangle(int[] list){
        int max = -1;
        int prev = -1;
        for( int i = 0; i < list.length; i++ ){
            if( prev != list[i] ){
                int size = (1 + greaterThanLeft(list, list[i], i -1) + greaterThanRight(list, list[i], i+1)) * list[i];
                if( size > max )
                    max = size;
                prev = list[i];
            }

        }

        return max;
    }

}
