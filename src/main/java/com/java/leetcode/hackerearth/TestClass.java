package com.java.leetcode.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input
        */
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arrays = br.readLine().split("\\s+");
        //int[] ints =
        int[] ints = Arrays.stream(arrays).mapToInt(Integer::parseInt).toArray();

        //Stream.of(1, 1, 7, 1, 7,  3)
        //Arrays.asList(ints).stream()
        Arrays.stream(ints).boxed().collect(Collectors.toList()).stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().sorted((o1, o2) -> {
                    if(o1.getValue().equals(o2.getValue()))
                        return -1;
                    return (int) ( o2.getValue() - o1.getValue() );
                }).forEach(v -> {
            Long counter = v.getValue();
            while(counter > 0){
                System.out.print( v.getKey() + " ");
                counter--;}
        });
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet().stream().sorted((Comparator<Map.Entry<Integer, Long>>) (o1, o2) -> {
//                    if( o1.getValue() == o2.getValue() )
//                        return -1;
//                    return (int) ( o2.getValue() - o1.getValue() );
//                }).forEach(v -> {
//            Long counter = v.getValue();
//            while(counter > 0){
//                System.out.print( v.getKey() + " ");
//            counter--;}
//        });

    }
}
