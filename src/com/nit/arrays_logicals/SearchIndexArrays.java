package com.nit.arrays_logicals;


public class SearchIndexArrays
{
public static void main(String[] args)
{ 
	int[] array = {5, 2, 9, 1, 6, 3};
int target = 6;
int index = linearSearch(array, target);
if (index != -1) 
{
System.out.println("Element " + target + " found at index: " +
index);
} else {
System.out.println("Element " + target + " not found in the array");
}
}
public static int linearSearch(int[] array, int target)
{ 
	for (int i = 0; i < array.length; i++)
	{
if (array[i] == target)
{
return i; 
}
}
return -1;
}
}

