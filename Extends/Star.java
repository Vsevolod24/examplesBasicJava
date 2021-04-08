package com.pvt;

public class Star extends StarsSystem {
    String glow = "Red";
    int percentOfHydrogen = 73;

    public String getGlow() {
        return glow;
    }

    public void setGlow(String glow) {
        this.glow = glow;
    }

    public int getPercentOfHydrogen() {
        return percentOfHydrogen;
    }

    public void setPercentOfHydrogen(int percentOfHydrogen) {
        this.percentOfHydrogen = percentOfHydrogen;
    }
    @Override
    protected void getSummOfStars() {
        System.out.println(numberOfBigStars + numberOfLittleStars);
    }

    @Override
    public void printNameOfSystem() {
        System.out.println("SpaceX");
    }
}
