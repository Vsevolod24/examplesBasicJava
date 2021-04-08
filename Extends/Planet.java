package com.pvt;

public class Planet extends StarsSystem {
    int temperature;
    String name;
    String space;

    protected Planet(int temperature) {
        this.temperature = 25;
    }

    protected Planet(int temperature, String name) {
        this(temperature);
        this.name = "Earth";
    }

    public Planet(int temperature, String name, String space) {
        this(temperature, name);
        this.space = "Air";
    }

    protected void printAllInfo(int temperature, String name, String space) {
        System.out.println(temperature + name + space);
    }

    @Override
    protected void getSummOfStars() {
        System.out.println((numberOfBigStars + numberOfLittleStars) * 134);
    }

    @Override
    public void printNameOfSystem() {
        System.out.println("Milky Way");
    }
}