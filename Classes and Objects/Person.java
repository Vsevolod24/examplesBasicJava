package com.pvt;

public class Person {
    private String name = "Andrei";
    private String surname = "Petrov";
    private int age = 25;
    private String phone = "Samsung";

    public String getAllInformation() {
        return "Name: " + name + "," + "Surname: " + surname + "," + "Age: " + age + "," + "Phone: " + phone;
    }

    public String printName() {
        return "Name and Surname: " + this.name + ", " + this.surname;
    }

    public boolean isAdult() {
        if (age > 18) {
            return true;
        } else
            return false;
    }

    public int setAge(int age) {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

