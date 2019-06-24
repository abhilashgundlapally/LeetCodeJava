package com.java.leetcode.sort;

public class MergeSort {

    private void sort(int[] data, int left, int right){
        if(left != right){
            int mid = left + (right-left)/2;
            sort(data, left, mid );
            sort(data, mid+1, right);
            merge(data, left, mid, right);
        }
    }

    private void merge(int[] data, int left, int mid, int right) {
        int[] aux = new int[right-left + 1];
        int i = left;
        int j = mid+1;
        int counter = 0;

        while( i <= mid || j <= right){
            if(data[i] < data[j])
                aux[counter++] = data[i++];
            else
                aux[counter++] = data[j++];

            if(i > mid){
                while(j <= right)
                    aux[counter++] = data[j++];
            }else if( j > right){
                while(i <= mid)
                    aux[counter++] = data[i++];
            }
        }

        for(int a : aux) {
            data[left++] = a;
        }
    }

    public void sort(int[] data){
        sort(data, 0, data.length-1);
    }
}
