package com.pvt;

import java.util.Scanner;

public class Paragraph {
    String mass = "I've been learning English during one year and 4 month";
    String name = "Solver";
    double price = 225.45;

    public String getSentence() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String string = scanner.nextLine();
        return string.replace("a", "%");
    }

    public String getCharArray() {
        char[] charArray = mass.toCharArray();
        for (int i = 0; i < mass.length(); i++) {
        }
        return mass.replace("a", "%");
    }

    static int multiplication(int a, int b) {
        return a * b;
    }

    static double sum(double c, double e, double g) {
        return c + e + g;
    }

    protected void getAllInfo() {
        System.out.println("Name is: " + name + " " + "Reason: " + mass + " " + "Price: " + price);
    }

    protected String getName() {
        return name;
    }

}


