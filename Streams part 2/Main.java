package com.pvt;

import java.io.*;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) throws IOException {
        String fileName = "book.txt";
        URL url = new URL("https://all-the-books.ru/download_book/00ae0503fb3889d7e9faf30400aefde3/");
        InputStream in = new BufferedInputStream(url.openStream());
        FileOutputStream out = new FileOutputStream(fileName);
        System.out.println("Download was started");
        byte buffer[] = new byte[1024];
        while (in.read(buffer) != -1) {
            out.write(buffer);
        }
        System.out.println("Download was finished");
        in.close();
        out.close();
        File file = new File("book.txt");
        try {
            FileInputStream inputStream = new FileInputStream(file);
            Scanner scanner = new Scanner(inputStream, "Qwerty-1_2_3");
            Map<String, Integer> words = new HashMap<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Arrays.stream(line.toLowerCase().replaceAll("[^0-9a-zа-я]", " ").split(" "))
                        .filter(x -> x.length() > 1)
                        .forEach(x -> {
                            if (!words.containsKey(x)) words.put(x, 0);
                            words.put(x, words.get(x) + 1);
                        });
            }
            System.out.println("The most popular word:");
            List<Map.Entry<String, Integer>> popularWord = words.entrySet().stream().sorted((a, b) -> {
                return b.getValue() - a.getValue();
            }).limit(1).collect(Collectors.toList());
            for (Map.Entry<String, Integer> entry : popularWord) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
            System.out.println("The most rare word: ");
            List<Map.Entry<String, Integer>> rareWord = words.entrySet().stream().sorted((a, b) -> {
                return a.getValue() - b.getValue();
            }).limit(1).collect(Collectors.toList());
            for (Map.Entry<String, Integer> entry : rareWord) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
            System.out.println("The longest word:");
            List<Map.Entry<String, Integer>> longWord = words.entrySet().stream().sorted((a, b) -> {
                return b.getKey().length() - a.getKey().length();
            }).limit(1).collect(Collectors.toList());
            for (Map.Entry<String, Integer> entry : longWord) {
                System.out.println(entry.getKey());
            }
            System.out.println("Years:");
            List<Map.Entry<String, Integer>> years = words.entrySet().stream().filter((a) -> {
                try {
                    int year = Integer.parseInt(a.getKey());
                    if (year > 2000 || year < 1700) return false;
                    return true;
                } catch (Exception e) {
                    return false;
                }
            })
                    .sorted((a, b) -> {
                        return b.getValue() - a.getValue();
                    })
                    .limit(1000).collect(Collectors.toList());
            for (Map.Entry<String, Integer> entry : years) {
                System.out.println(entry.getKey() + " = " + entry.getValue() + " times");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}