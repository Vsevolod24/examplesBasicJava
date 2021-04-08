package com.pvt;

public class SunSirius extends Star {
    double lenghtOfDay = 21.14;
    int id = 192;

    @Override
    protected void getSummOfStars() {
        System.out.println("Rewrite method of Star class");
    }

    @Override
    public void printNameOfSystem() {
        System.out.println("Sun Sirius and my id is " + getPercentOfHydrogen());
    }

}
