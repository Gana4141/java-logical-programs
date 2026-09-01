package com.nit.logicals;

public class SumOftwoDigit
{
public static void main(String[] args)

{ 
	int number = 123435;
int sumOfDigits = calculateSumOfDigits(number);
System.out.println("Sum of digits of " + number + " is: " +sumOfDigits);
}
public static int calculateSumOfDigits(int number)
{ 
	int sum = 0;
while (number > 0) 
{
int digit = number % 10;
sum = sum + digit;
number = number / 10; 
}
return sum;
}
}