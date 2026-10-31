package com.nit.java_8_features_pro;


public class MovesZero
{

    public static void main(String[] args)
    {

        int arr[] = {10,0,78,0,90,9,0,0,5,0};

        int index = 0;

        for (int i = 0; i < arr.length; i++)
        {

            if (arr[i] != 0) 
            {

                arr[index] = arr[i];

                index++;
            }
        }

        while (index < arr.length) 
        {

            arr[index] = 0;

            index++;
        }

        for (int i = 0; i < arr.length; i++) 
        {

            System.out.print(arr[i] + " ");
        }
    }
}
