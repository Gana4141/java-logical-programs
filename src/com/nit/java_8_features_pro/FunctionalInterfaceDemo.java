package com.nit.java_8_features_pro;

@FunctionalInterface
interface Greeting
{
    void sayHello(String name);
}

public class FunctionalInterfaceDemo 
{
    public static void main(String[] args) 
    {
        Greeting greeting = name -> System.out.println("Hello, " + name + "!");
        greeting.sayHello("Raj");
    }
}