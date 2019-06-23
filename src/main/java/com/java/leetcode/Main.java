package com.java.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    @Override
    public String toString() {
        return "Main{}";
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 3, 4, 5, 4, 5, 6, 9);
        integers.stream().sorted(Comparator.comparingInt(o -> o)).forEach(System.out::println);
        integers.stream().reduce(Integer::sum).ifPresent(System.out::println);
        Stream.of("Aaron", "Steve", "Assange").reduce(String::concat).ifPresent(System.out::println);
        System.out.println(String.join(",", "Aaron", "Steve", "Assange"));
    }
}
