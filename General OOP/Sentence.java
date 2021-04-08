package com.pvt;

import java.util.Objects;
import java.util.Scanner;

public class Sentence extends Paragraph {
    private String name = "Harry Potter";
    private int numberofpages = 240;
    private int id = 135;

    public Sentence(String name, int id){
        this.name = name;
        this.id = id;
    }

    public Sentence(String name, int numberofpages, int id) {
        this(name, id);
        this.numberofpages = numberofpages;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (null == object) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }

        Sentence sentence = (Sentence) object;

        if (name != sentence.name) {
            return false;
        }
        if (null == this.name) {
            return this.name == sentence.name;
        } else {
            if (!name.equals(sentence.name)) {
                return false;
            }

            if (id != sentence.id) {
                return false;
            }
            if (numberofpages != sentence.numberofpages) {
                return false;
            }
            return true;
        }
    }

    public int hashCode() {
        return (31 * id + (null == name ? 0 : name.hashCode())
                + 51 * numberofpages);
    }
}