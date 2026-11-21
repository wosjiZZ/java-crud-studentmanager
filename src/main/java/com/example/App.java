package com.example;

public class App {
    public static String greet(String name) {
        return "你好, " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(greet("Java 环境"));
        System.out.println("JVM: " + System.getProperty("java.version") + " / " + System.getProperty("java.vendor"));
    }

}