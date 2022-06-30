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

    public String getNameOfPlaceOfWork() {
        return nameOfPlaceOfWork;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setNameOfPlaceOfWork(String nameOfPlaceOfWork) {
        this.nameOfPlaceOfWork = nameOfPlaceOfWork;
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

    public void aboutPerson() {
        System.out.println("Меня зовут " + getName() +
                ", " + "Мне " + getAge() + " лет" +
                ", в фирме " +  " " +
                "я получаю " + getSalary() + " рублей ");
    }
    public boolean checkDifference(){
        boolean statement = salary >= age;
        System.out.println(statement);
        return statement;
    }

    public void setCompanyName(String name) {
    }
}