package com.java.leetcode;

public class HeapSort {

    private int[] data;
    private int counter;

    public HeapSort(int size) {
        data = new int[size + 1];
        for(int i = 0; i < data.length; i++) {
            data[i] = 0;
        }
        counter = 1;
    }

    public void add(int value) {
        data[counter] = value;
        bubbleTop(value);
        counter++;
    }

    private void bubbleTop(int value) {
        int n = counter;
        while(n > 1) {
            if(value < data[n / 2])
                return;
            swap(data, n, n / 2);
            n = n / 2;
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int getMax() {
        int max = this.data[1];
        swap(data, 1, counter - 1);
        data[counter - 1] = -1;
        counter--;
        bubbleDown(data[1]);
        return max;
    }

    private void bubbleDown(int value) {
        int rot = 1;
        while(rot * 2 < counter) {
            if(data[rot * 2] > value) {
                swap(data, rot, rot * 2);
                rot = rot * 2;
            } else if((rot * 2 + 1) < counter && data[rot * 2 + 1] > value) {
                swap(data, rot, rot * 2 + 1);
                rot = rot * 2;
            } else
                break;
        }
    }

    public int[] getData() {
        return data;
    }

}
