package com.nit.arrays_logicals;
import java.util.Scanner;
public class SecondLargest 
{
 public static void main(String[] args) 
 {
     Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) 
        {
            arr[i] = scanner.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++)
        {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } 
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);
        scanner.close();}}