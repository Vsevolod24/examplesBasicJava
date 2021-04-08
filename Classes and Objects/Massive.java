package com.pvt;

public class Massive {
    int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public int printMassiveAsLine(int mass) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return mass;
    }

    public int printReverseMassiveAsLine(int mass1) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        return mass1;
    }

    public int getSumOfElements(int summa) {
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ = summ + array[i];
        }
        return summ;
    }

    public int multiptyBy3(int composition) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 3;
            System.out.print(array[i] + " ");
        }
        return composition;
    }

    public int multiptyBy3Revers(int composition) {
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = array[i] * 3;
            System.out.print(array[i] + " ");
        }
        return composition;
    }
}
