package com.nit.arrays_logicals;

public class SmallestAndLargest
{
public static void main(String[] args)
{ 
int[] array = {0,10000,2,8,5654,78,1};
int[] result = findLargestAndSmallest(array);
System.out.println("Smallest element: " + result[0]);
System.out.println("Largest element: " + result[1]);
}
public static int[] findLargestAndSmallest(int[] array)
{ if (array == null || array.length == 0) {
throw new IllegalArgumentException("Array must not be null or empty");
}
int smallest = array[0];
int largest = array[0];
for (int num : array)
{ 
	if (num < smallest)
{
smallest = num;
}
if (num > largest)
{ 
	largest = num;
}
}
return new int[]{smallest, largest};
}
}

