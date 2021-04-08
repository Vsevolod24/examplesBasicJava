package com.pvt;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Max and Min lenghts");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 строки: ");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        String[] words = {str1, str2, str3};
        String min = words[0];
        for (int i = 0; i < words.length; i++) {
            if (min.length() > words[i].length()) {
                min = words[i];
            }
        }
        System.out.println("MinString: " + min);
        int minLenghtString = 0;
        for(int i=0; i<words.length; i++){
            if(words[i].length() != minLenghtString){
                minLenghtString = words[i].length();
            }
        }
        System.out.println("MinLenght: " + minLenghtString);
        int maxLengthString = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxLengthString) {
                maxLengthString = words[i].length();

            }
        }
        System.out.println("MaxLenght: " + maxLengthString);
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == maxLengthString) {
                System.out.println("MaxString: " + words[i]);
            }
        }


        System.out.println("В порядке возрастания их длины:");
        Scanner scanner1 = new Scanner(System.in);
        int size = 5;
        String[] strings = new String[size];
        System.out.println("Введите строки: ");
        for (int i = 0; i < 5; i++) {
            strings[i] = scanner1.nextLine();
        }
        for (int i = strings.length - 1; i > 0; i--) {
        for (int j = 0; j < i; j++) {
          if (strings[j].length() > strings[j + 1].length()) {
              String temp = strings[j];
              strings[j] = strings[j + 1];
              strings[j + 1] = temp;
                }
            }
        }
        System.out.println("В порядке возрастания: ");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
//        }


        System.out.println("длина которых меньше (больше) средней, а также длину:");
        Scanner scannerx = new Scanner(System.in);
        int size = 5;
        String[] strings = new String[size];
        System.out.println("Введите строки: ");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scannerx.nextLine();
        }
        double averageNumber = 0;
        for (String string : strings) {
            averageNumber = averageNumber + (double) string.length();
        }
        double averageNumberLenght = averageNumber / strings.length;
        System.out.println("Average lenght is: " + averageNumberLenght);
        for(int i=0; i<strings.length; i++){
            if(strings[i].length()>averageNumberLenght){
                System.out.println("Lenght more than average: " + strings[i]);
                System.out.println("Lenght: " + strings[i].length());
            }
        }
    }
        System.out.println("Найти слово, в котором число различных символов минимально");
        Carbon carbon = new Carbon();
        String[] arraystring = {"dauidhiuhaipwx,xd, aopdckakxax, joadjioaxax, iocajax, xapxdakxdaxk, daxdxua"};
        String findsymbol = arraystring[0];
        for (int i = 0; i < arraystring.length; i++) {
            System.out.print(arraystring[i] + ", ");
            if (carbon.getValue(arraystring[i]) < carbon.getValue(findsymbol))
                findsymbol = arraystring[i];
        }
        System.out.println();
        System.out.println("Count different symbols are: " + carbon.getValue(findsymbol));

        System.out.println("Найти количество слов, содержащих только символы латинского алфавита");
        String string = "Short sto2ries are so3me of the first pieces456 of literature th4at children320.";
        char[] arrayvowels = {'a','e','i','o','u','y'};
        char[] chArray = string.toCharArray();
        Scanner scanner = new Scanner(String.valueOf(string.toCharArray()));
        System.out.print("There are words: ");
        int amount = 0;
        while (scanner.hasNext()) {
            if (scanner.hasNext("[a-zA-Z]+")) {
                amount++;
                System.out.print(scanner.next() + " ");
            } else {
                scanner.next();
            }
        }
        System.out.println();
        System.out.println("Amount of words: " + amount);
        Carbon carbon = new Carbon();
        System.out.println("Count of vowels: " + carbon.getVowel());
        System.out.println("Count of consonants: " + carbon.getConsonants());

        Carbon carbon = new Carbon();
        carbon.getSequenceFirstWord();
        System.out.println();
        carbon.getSequenceSecondWord();
        System.out.println();
        carbon.getSequenceThirdWord();



    }
}






