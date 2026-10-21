package com.nit.java_8_features_pro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortedDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(50, 10, 40, 20, 30);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted numbers: " + sortedNumbers);
    }
}