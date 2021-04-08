package com.pvt;

public class Worker {

    private int age;
    private String name;

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
    public int getKey() {
        int left = 1;
        int right = 99;
        return age * Numbers.primeNumbersBruteForce(left, right);
    }
}