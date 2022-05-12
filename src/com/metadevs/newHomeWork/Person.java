package com.metadevs.newHomeWork;

import javax.crypto.spec.PSource;

public class Person {
    private String name;
    private int age;
    private int salary;
    private String nameOfPlaceOfWork;

    public Person(String name, int age, int salary, String nameOfPlaceOfWork) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void information() {
        System.out.println("Меня зовут " + getName() +
                ", " + "Мне " + getAge() + " лет" +
                ", в фирме " +  " " +
                "я получаю " + getSalary() + " рублей ");
    }
}