package com.pvt;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    String name = "MaltaZoo";
    int cages = 5;
    int age = 8;
    double price = 25.5;

    public List<String> getCountOfAnimals() {
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("Animals: ");
        list.add("Tiger");
        list.add("Dolphin");
        list.add("Bear");
        list.add("Bison");
        System.out.println(list);
        for (String count : list) {
            System.out.println("Count of animals: " + list.size());
            break;
        }
        return list;
    }

}
