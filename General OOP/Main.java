package com.pvt;

public class Main {

    public static void main(String[] args) {
        Paragraph paragraph = new Paragraph();
        System.out.println(paragraph.getSentence());
        System.out.println();
        System.out.println("In mode of treatment strings:");
        System.out.println();
        System.out.println(paragraph.getCharArray());
        System.out.println(paragraph.hashCode());
        paragraph.getAllInfo();
        System.out.println();
        Word word = new Word();
        System.out.println(word.getGenre());
        System.out.println();
        word.setNumberOfWords();
    }
}