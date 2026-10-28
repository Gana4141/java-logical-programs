package com.nit.java_8_features_pro;

interface Vehicle {
    default void start() {
        System.out.println("Vehicle is starting.");
    }

    static void serviceInfo() {
        System.out.println("Vehicles should be serviced regularly.");
    }
}

public class DefaultStaticMethodsDemo implements Vehicle {
    public static void main(String[] args) {
        DefaultStaticMethodsDemo vehicle = new DefaultStaticMethodsDemo();
        vehicle.start();
        Vehicle.serviceInfo();
    }
}
