package com.pvt;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Person {

    private ArrayList<Worker> list = new ArrayList<>();
    private int id;

    public void Workers(ArrayList<Worker> listOfWorkers) {
        this.list = listOfWorkers;
    }

    public Map<Integer, Worker> getWorkers() {
        int averageAge = 11;
        return list.stream().filter(person -> person.getAge() > averageAge)
                .collect(Collectors.toMap(Worker::getKey, Function.identity()));
    }

}