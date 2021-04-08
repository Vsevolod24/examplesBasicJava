package com.pvt;

public class Word implements Interface {
    String genre = "Fantasy";
    int pages = 240;


    @Override
    public void setNumberOfWords() {
        System.out.println("Количество страниц: " + pages);
    }

    @Override
    public String getGenre() {
        return "Жанр: " + genre;
    }
}
