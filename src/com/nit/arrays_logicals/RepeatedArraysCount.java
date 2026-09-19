package com.nit.arrays_logicals;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class RepeatedArraysCount 
{
public static void main(String[] args) 
{
int[] array = {1, 9,1012,5,1, 2, 2, 3, 4, 5, 5, 6, 6,5,5,8,8,9,60};
List<Integer> result = findNonRepeatedElements(array);
System.out.println("Non-repeated elements: " + result);
}
public static List<Integer> findNonRepeatedElements(int[]array) 
{

Map<Integer, Integer> countMap = new HashMap<>();
for (int num : array) 
{
countMap.put(num, countMap.getOrDefault(num, 0) + 1);
}

List<Integer> nonRepeatedElements = new ArrayList<>();
for (Map.Entry<Integer, Integer> entry :
countMap.entrySet()) 
{
if (entry.getValue() == 1)
{ nonRepeatedElements.add(entry.getKey());
}
}
return nonRepeatedElements;
}
}
