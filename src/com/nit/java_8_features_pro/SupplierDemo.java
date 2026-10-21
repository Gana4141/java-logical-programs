package com.nit.java_8_features_pro;

import java.util.function.Supplier;

public class SupplierDemo 
{
    public static void main(String[] args) 
    {
        Supplier<String> messageSupplier = () -> "Welcome to Java 8!";

        System.out.println(messageSupplier.get());
    }
}