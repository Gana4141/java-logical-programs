package com.nit.java_8_features_pro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeAPIDemo
{
    public static void main(String[] args) 
    {
        LocalDate today = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Date: " + today.format(formatter));
        System.out.println("Time: " + currentTime);
        System.out.println("Date and time: " + currentDateTime);
    }
}