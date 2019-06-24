package com.java.leetcode;

public class HeapSort {

    private int[] data;
    private int counter;

    public HeapSort(int size) {
        data = new int[size + 1];
        for(int i = 0; i < data.length; i++) {
            data[i] = -1;
        }
        counter = 1;
    }

    public void add(int value) {
        data[counter] = value;
        counter++;
        bubbleTop();
    }

    private void bubbleTop() {
        int val = data[counter-1];
        int index = counter-1;

        while( index/2 > 0 && data[index/2] < val){
            swap(data, index, index/2);
            index = index/2;
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int getMax() {
        int element = data[1];
        data[1] = data[counter-1];
        counter--;
        bubbleDown();
        return element;
    }

    private void bubbleDown() {
        int value = data[1];
        int index = 1;
        while(index*2 < counter){
            int smallIndex = index*2;
            if( smallIndex +1  < counter && data[smallIndex] < data[smallIndex+1] ) smallIndex = smallIndex +1;
            if( data[smallIndex] < value) return;
            swap(data, index, smallIndex);
            index = smallIndex;
        }
    }

    public int[] getData() {
        return data;
    }

}
