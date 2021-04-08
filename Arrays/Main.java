package com.pvt;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(" Массив с рандомными числами:");
        int[] mass = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i + (int) (Math.random() * 10);
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        System.out.println("поменять местами каждые 2 соседних элемента");
        for (int i = 0; i < mass.length - 1; i = i + 2) {
            int tmp = mass[i];
            mass[i] = mass[i + 1];
            mass[i + 1] = tmp;
        }
        System.out.println();
        System.out.println("В обратном порядке:");
        for (int i = mass.length - 1; i >= 0; i--) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        System.out.println("Каждый третий умноженный на 2:");
        for (int x = 0; x < mass.length - 1; x = x + 3) {
            mass[x] = x * 2;
            System.out.print(mass[x] + " ");
        }
        System.out.println();
        System.out.println("Новый массив");
        int size = 10;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Колличество нулевых элементов:");
        int numberOfZero = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                System.out.print(array[i]);
                numberOfZero++;
            }
        }
        System.out.println();
        System.out.println("найти минимальный-максимальный элементы, их индексы и вывести");
        int values[] = new int[]{7, 6, 12, 4, 8, 9, 1, 42, 8, 21, 1};
        int minNumber = values[0];
        int minIndex = 0;
        int maxIndex = 0;
        int maxNumber = values[0];
        for (int i = 0; i < values.length; i++) {
            if (minNumber > values[i]) {
                minNumber = values[i];
                minIndex = i;
            }
            if (maxNumber < values[i]) {
                maxNumber = values[i];
                maxIndex = i;
            }
        }
        System.out.println("minNumber: " + minNumber + ", minIndex: " + minIndex);
        System.out.println("maxNumber: " + maxNumber + ", maxIndex: " + maxIndex);
        System.out.println();
        System.out.println("проверить, является ли массив возрастающей последовательностью");
        boolean a = true;
        boolean b = false;
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] < values[i + 1]) {
                System.out.println(b);
                break;
            } else {
                System.out.println(a);
            }
        }
        System.out.println();
        System.out.println("Произведение всех элементов: ");
        int[] mark = new int[]{1, 2, 6, 7, 13, 18, 9, 8, 14};
        int count = 1;
        for (int j = 1; j < mark.length - 1; j++) {
            count = count * mark[j + 1];
        }
        System.out.print(count);

    }

}

