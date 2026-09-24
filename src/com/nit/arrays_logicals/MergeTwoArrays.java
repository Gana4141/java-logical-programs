package com.nit.arrays_logicals;
import java.util.Scanner;
public class MergeTwoArrays
{  
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first array size: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter first array elements:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.print("Enter second array size: ");
        int size2 = scanner.nextInt();

        int[] arr2 = new int[size2];

        System.out.println("Enter second array elements:");

        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Create third array
        int[] mergedArray = new int[size1 + size2];

        // Copy first array
        for (int i = 0; i < size1; i++) {
            mergedArray[i] = arr1[i];
        }

        // Copy second array
        for (int i = 0; i < size2; i++) {
            mergedArray[size1 + i] = arr2[i];
        }

        System.out.println("Merged array:");

        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }

        scanner.close();
    }
}
