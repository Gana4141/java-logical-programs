package com.nit.java_8_features_pro;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo 
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("James","pankaj","Nandhini");

        names.forEach(System.out::println);
    }
}