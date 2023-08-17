package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
//        obj.name = "John"; // This will result in an error
//        System.out.println(obj.name); // This will also result in an error

        obj.setName("Alice");
        System.out.println(obj.getName());
    }
}