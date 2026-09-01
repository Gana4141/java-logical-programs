package com.nit.logicals;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedCharacters
{

    public static void main(String[] args) 
    {

        String str = "programming";

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) 
        {

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println("non-repeated characters:");

        for (char ch : str.toCharArray()) 
        {

            if (map.get(ch) == 1)
            {
                System.out.print(ch + " ");
            }
        }
    }
}