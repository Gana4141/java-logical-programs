package com.nit.java_8_features_pro;
import java.util.Optional;
public class OptionalDemo 
{
    public static void main(String[] args) 
    {
        String input = "java programming 9";

        Optional<String> value = Optional.ofNullable(input);
        System.out.println(value.orElse("No value provided"));

        Optional<String> emptyValue = Optional.ofNullable(null);
        System.out.println(emptyValue.orElse("No value provided"));
    }
}