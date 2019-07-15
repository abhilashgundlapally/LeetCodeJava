package com.java.leetcode.backtracking;

public class KnightTour {

    private int[][] tours;

    public KnightTour(int n){
        tours = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                tours[i][j] = 0;
            }
        }
    }

    private boolean out_of_bound(int i, int j){
        return (i >= 0 && i < tours.length) && (j >= 0 && j < tours.length);
    }

    public boolean knightTour(int i, int j, int step){

        if( tours[i][j] != 0)
            return false;

        if( step == tours.length * tours.length  )
            return true;

        tours[i][j] = ++step;
        if( out_of_bound(i-2, j-1) && knightTour(i-2, j-1,step))
            return true;
        if( out_of_bound(i-1, j-2) && knightTour(i-1, j-2,step))
            return true;
        if( out_of_bound(i-2, j+1) && knightTour(i-2, j+1,step))
            return true;
        if( out_of_bound(i-1, j+2) && knightTour(i-1, j+2,step))
            return true;
        if( out_of_bound(i+1, j-2) && knightTour(i+1, j-2,step))
            return true;
        if( out_of_bound(i+2, j-1) && knightTour(i+2, j-1,step))
            return true;
        if( out_of_bound(i+2, j+1) && knightTour(i+2, j+1,step))
            return true;
        if( out_of_bound(i+1, j+2) && knightTour(i+1, j+2,step))
            return true;
        tours[i][j] = 0;
        step--;
        return false;
    }

    public int[][] getTours(){
        return tours;
    }

}
