package com.java.leetcode;

public class DijkSort {

    public class Point{
        int first;
        int second;

        public Point(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public void sort(int[] arr,int i, int j){
        if(i>=j)
            return;
        Point pivot = partition(arr, i, j);
        sort(arr,i, pivot.first-1);
        sort(arr,pivot.second+1, j);
    }

    public Point partition(int[] arr,int t, int l){
        int pv = arr[t];
        int load =t;
        int i = t+1;
        int j = l;

        while(i<=j){
            if(pv > arr[i]){
                swap(arr,load++,i++);
            }else if( pv < arr[i] ){
                swap(arr, i, j--);
            }else{
                i++;
            }
        }
        return new Point(load,j);
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i+"->");
        }
        System.out.println();
    }

}
