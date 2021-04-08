package com.pvt;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] array = str.split(" ");
        var words = Arrays.stream(array)
                .collect(Collectors.groupingBy(element -> element, Collectors.counting()));
        System.out.println(words);
        Person workerStorage = new Person();
        ArrayList<Worker> listOfWorkers = new ArrayList<>();
        listOfWorkers.add(new Worker("Manya", 25));
        listOfWorkers.add(new Worker("Andrei", 27));
        listOfWorkers.add(new Worker("Olya", 18));
        listOfWorkers.add(new Worker("Tanya", 19));
        listOfWorkers.add(new Worker("Stas", 20));
        listOfWorkers.add(new Worker("Ylya", 21));
        listOfWorkers.add(new Worker("Misha", 23));
        listOfWorkers.add(new Worker("Dima", 28));
        workerStorage.Workers(listOfWorkers);
        System.out.println(workerStorage.getWorkers());

    }
}