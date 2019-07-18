package com.java.leetcode.skillzella;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoveMiddle {


    public static int reqSwaps(int[][] mat){
        int maxElement = 0;
        int maxSteps = 0;
        if( mat.length == 2 && mat[0].length == 2)
            return 0;

        int rl = mat.length ;
        int cl = mat[0].length;
        for(int r = 0; r < rl ; r++){
            for( int c = 0; c < cl; c++){
                if(mat[r][c] > maxElement){
                    maxElement = mat[r][c];
                    maxSteps = cost(mat.length, mat[0].length,r , c );
                }else if(mat[r][c] == maxElement){
                    int t = cost(mat.length, mat[0].length, r , c);
                    if( t < maxSteps){
                        maxElement = mat[r][c];
                        maxSteps = t;
                    }
                }
            }
        }
        return maxSteps;
    }

    public static int cost(int pc, int pr, int cc, int cr){
        int l = 0;
        if(pc % 2 == 0) {
            pc = pc / 2;
            l = Math.min(Math.abs(pc - cc), Math.abs(pc - cc -  1));
        }else {
            pc = pc /2;
            l = Math.abs(pc - cc);
        }
        int r = 0;
        if( pr % 2 == 0){
            pr = pr / 2;
            r = Math.min(Math.abs(pr - cr), Math.abs(pr - cr -  1));
        }else{
            pr = pr / 2;
            r = Math.abs(pr - cr);
        }
        return l + r;
    }

    public static void main(String []args){
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        try {
            int testcases = Integer.valueOf(buf.readLine());
            for(int i = 0; i < testcases; i++) {
                String[] dim = buf.readLine().split("\\s+");
                int[][] mat = new int[Integer.valueOf(dim[0])][Integer.valueOf(dim[1])];

                for(int r = 0 ; r < mat.length; r++ ){
                    String[] val = buf.readLine().split("\\s+");
                    for(int c = 0; c < val.length; c++) {
                        mat[r][c] = Integer.valueOf(val[c]);
                    }
                }
                System.out.println(reqSwaps(mat));
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
