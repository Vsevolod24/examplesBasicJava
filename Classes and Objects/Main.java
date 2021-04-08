package com.pvt;

public class Main {

    public static void main(String[] args) {
        Massive massive = new Massive();
        System.out.println("array в прямом порядке");
        System.out.print(massive.printMassiveAsLine(5));
        System.out.println();
        System.out.println("array в обратном порядке");
        System.out.print(massive.printReverseMassiveAsLine(5));
        System.out.println();
        System.out.println("Cумма всех элементов массива");
        System.out.print(massive.getSumOfElements(5));
        System.out.println();
        System.out.println("Умножение каждого элемента на 3 в прямом порядке");
        System.out.print(massive.multiptyBy3(5));
        System.out.println();
        System.out.println("Умножение каждого элемента на 3 в обратном порядке");
        System.out.print(massive.multiptyBy3Revers(5));

    }

}
