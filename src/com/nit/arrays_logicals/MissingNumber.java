package com.nit.arrays_logicals;

public class MissingNumber {

    public static void main(String[] args) {

        long[] arr = {1,3,4,5};

        long n = 5;

        long total = n * (n + 1) / 2;

        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        long missingNumber = total - sum;

        System.out.println("Missing Number = " + missingNumber);
    }
}