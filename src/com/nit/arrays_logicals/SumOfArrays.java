package com.nit.arrays_logicals;

public class  SumOfArrays 
{
public static void main(String[] args) 
{
String[] array = {"5", "2", "9", "a", "1", "6", "#", "3","80","500"};

int sum = sumIntegers(array);
System.out.println("Sum of integers in the array: " + sum);
}
public static int sumIntegers(String[] array)
{ 
	int sum = 0;
for (String element : array)
{
	try 
	{
int num = Integer.parseInt(element);
sum += num;
} 
	catch (NumberFormatException e) {
}
}
return sum;
}
}

