package com.nit.arrays_logicals;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondHighest 
{
    public static void main(String[] args) 
    {
        int[] numbers = {10, 25, 30, 45, 30, 50, 45,65 ,55,20};
        Optional<Integer> secondHighest = Arrays.stream(numbers)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        if (secondHighest.isPresent()) 
        {
            System.out.println("Second Highest Number: " + secondHighest.get());
        } else {
            System.out.println("Second Highest Number not found");
        }
    }
}