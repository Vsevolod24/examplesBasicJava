package com.pvt;

public class Main {

    public static void main(String[] args) {
        Planet planet = new Planet(25);
        planet.getSummOfStars();
        planet.printNameOfSystem();
        Star star = new Star();
        star.getSummOfStars();
        star.printNameOfSystem();
        SunSirius sunSirius = new SunSirius();
        sunSirius.getSummOfStars();
        sunSirius.printNameOfSystem();
        System.out.println(sunSirius.hashCode());
    }
}