package com.nit.arrays_logicals;

import java.util.ArrayList;
public class ArraysFirstAndLastElement
{
public static void main(String[] args)
{
ArrayList<String> arrayList = new
ArrayList<>();
arrayList.add("Apple");
arrayList.add("Banana");
arrayList.add("Cherry");
arrayList.add("Date");
arrayList.add("Elderberry");

if (!arrayList.isEmpty())

{
String firstElement = arrayList.get(0);
String lastElement = arrayList.get(arrayList.size() - 1);
System.out.println("The First element is : " + firstElement);
System.out.println("The Last element is  : " + lastElement);
} 
else
{
System.out.println("The ArrayList is empty.");
}
}
}