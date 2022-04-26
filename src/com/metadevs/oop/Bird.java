package com.metadevs.oop;

public class Bird extends Animal{
    public Bird(String name, int age, String sex, boolean presenceOfHair) {
        super(name, age, sex, presenceOfHair);
    }

    @Override
    public void saySomething() {
        System.out.println("4ik-4iriq");
    }
}
