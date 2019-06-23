package com.java.leetcode;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumber {

    public int[] getRandomNumbers(int size, int max) {
        Random random = new Random();
        int[] data = new int[size];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(max+1);
        }
        return data;
    }

    public int[] getRandomNoDup(int size, int max) {
        Random random = new Random();
        int[] data = new int[size];
        Set<Integer> set = new HashSet<>(size);
        int i = 0;
        int curr;
        while (i < size) {
            curr = random.nextInt(max+1);
            if (!set.contains(curr)) {
                data[i++] = curr;
                set.add(curr);
            }
        }
        return data;
    }

}
