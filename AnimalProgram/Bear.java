package com.pvt;

import java.util.Scanner;

public class Bear extends Animal {

    @Override
    public void emotion() {
        Scanner scanner = new Scanner(System.in);
        String nameoffood = "grass, wood, glass, sand, meat, ice-cream, chocolate";
        System.out.println("Lets try to guess my favorite food! Choose food from the list: " + nameoffood);
        while (scanner.hasNext()) {
            if (scanner.hasNext("meat")) {
                System.out.println("Yaaaammmyyy. It is my favorite tasty!!!");
                break;
            } else {
                System.out.println("I won't eat this food, get me more tasty than: " + scanner.nextLine());
                System.out.println("You didn't guess. Let's try again: " + nameoffood);
                System.out.println("Write here: ");
            }
        }
    }
}
