package com.nit.logicals;


public class ArraysLargestElements {

    public static void main(String[] args) {

        int[] numbers = {10, 25, 5, 45, 30};

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest element in the array: " + largest);
    }
}