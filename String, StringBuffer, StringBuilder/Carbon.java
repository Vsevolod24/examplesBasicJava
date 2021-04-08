package com.pvt;

import java.util.Scanner;

public class Carbon {
    public int getValue(String value) {
        StringBuffer stringBuffer = new StringBuffer();
        String string;
        for (int i = 0; i < value.length(); i++) {
            string = String.valueOf(value.charAt(i));
            if (stringBuffer.indexOf(string) == -1)
                stringBuffer.append(string);
        }
        return stringBuffer.length();
    }

    public String getStr(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        String string;
        for (int i = 0; i < str.length(); i++) {
            string = String.valueOf(str.charAt(i));
            if (str.indexOf() == string.matches("[a-zA-Z]"))
                string.matches("[a-zA-Z]+");
        }
            return String.valueOf(str.matches("[a-zA-Z]+"));
    }

    public String findLetter(String str){
        String string;
    }

    String vowels = "a,e,i,o,u,y";
    String consonants = "b,c,d,f,g,h,j,k,l,m,n,p,q,r,s,t,v,w,x,z";

    public int getVowel() {
        String string = "Short sto2ries are so3me of the first pieces456 of literature th4at children320.";
        String vowels = "a,e,i,o,u,y,A,E,I,O,U,Y";
        int countvowels = 0;
        int countconsonats = 0;
        for (int i = 0; i < string.length(); i++) {
            char symbol = string.charAt(i);
            if (symbol == 'a' + 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u' || symbol == 'y' ||
                    symbol == 'A' || symbol == 'E' || symbol == 'I' || symbol == 'O' || symbol == 'U' || symbol == 'Y') {
                countvowels++;
            } else {
                countconsonats++;
            }
        }
        return countvowels;
    }
    public int getConsonants() {
        String string = "Short sto2ries are so3me of the first pieces456 of literature th4at children320.";
        String consonants = "b,c,d,f,g,h,j,k,l,m,n,p,q,r,s,t,v,w,x,z";
        int countvowels = 0;
        int countconsonants = 0;
        for (int i = 0; i < string.length(); i++) {
            char symbol = string.charAt(i);
            if (countvowels == countconsonants) {
                countvowels++;
            } else {
                countconsonants++;
            }
        }
        return countconsonants;
    }

    public void getSequenceFirstWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the first word:");
        String firstword = scanner.nextLine();
        for (int i = 0; i < firstword.length(); i++) {
            char symbols = firstword.charAt(i);
            int sequence = (int) symbols;
            if (symbols > firstword.charAt(i + 1)) {
                break;
            }
            System.out.print(sequence + " " + firstword.charAt(i) + " ");
        }
    }

    public void getSequenceSecondWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the second word:");
        String secondword = scanner.nextLine();
        for (int i = 0; i < secondword.length(); i++) {
            char symbols = secondword.charAt(i);
            int sequence = (int) symbols;
            if (symbols > secondword.charAt(i + 1)) {
                break;
            }
            System.out.print(sequence + " " + secondword.charAt(i) + " ");
        }
    }

    public void getSequenceThirdWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the third word:");
        String thirdword = scanner.nextLine();
        for (int i = 0; i < thirdword.length(); i++) {
            char symbols = thirdword.charAt(i);
            int sequence = (int) symbols;
            if (symbols > thirdword.charAt(i + 1)) {
                break;
            }
            System.out.print(sequence + " " + thirdword.charAt(i) + " ");
        }

    public int getDifferenses() {
        String string = "Short sto2ries are so3me of the first pieces456 of literature th4at children320.";
        String vowels = "a,e,i,o,u,y,A,E,I,O,U,Y";
        String consonants = "b,c,d,f,g,h,j,k,l,m,n,p,q,r,s,t,v,w,x,z";
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char symbol = string.charAt(i);
            if (vowels != consonants) {
                count++;
            }
        }
        return count;
    }
}


