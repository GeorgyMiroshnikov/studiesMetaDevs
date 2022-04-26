package com.metadevs.oop;

public class Hamster extends Animal {
    public Hamster(String name, int age, String sex, boolean presenceOfHair) {
        super(name, age, sex, presenceOfHair);
    }

    @Override
    public void saySomething() {
        System.out.println("Ыы");
    }
}
