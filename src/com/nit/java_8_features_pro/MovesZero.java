package com.nit.java_8_features_pro;


public class MovesZero
{

    public static void main(String[] args)
    {

        int arr[] = {2,2,0,1,0,10, 5, 0, 3, 8, 0, 2};

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
