package com.java.leetcode.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Solution {
    public boolean isMatch(String s, String p) {
        char[] str = s.toCharArray();
        char[] ptr = p.toCharArray();
        int j = 0;
        int i =0;
        for( i = 0; i < ptr.length;){
            if(ptr[i] == '.'){
                if( ( i + 1 ) < ptr.length && ptr[i+1] == '*' ){
                    //TODO - handle repeated 0 or more
                    char c = ptr[i];
                    while( j < str.length && c == str[j]){
                        j++;
                    }
                    i = i + 2;
                }else{
                    j++;
                }
            }else {
                if( (i+1) < ptr.length && ptr[i+1] == '*'){
                    //TODO - handle repeated or more
                    char c = ptr[i];
                    while( j < str.length && c == str[j]){
                        j++;
                    }
                    i = i + 2;
                }else if(ptr[i] != str[j]){
                    return false;
                }else{
                    i++;
                    j++;
                }
            }
        }
        if( i  < str.length )
            return false;
        return true;
    }
}

public class RegExpr {

    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ptr = sc.nextLine();
        System.out.println(new Solution().isMatch(str,ptr));
    }
}