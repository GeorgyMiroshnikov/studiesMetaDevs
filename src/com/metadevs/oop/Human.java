package com.metadevs.oop;

import java.awt.*;

public class Human extends Creature implements CanSpeak {

    public Human(String name, int age, String sex, boolean presenceOfHair ) {
        super(name, age, sex, presenceOfHair);
    }

    protected Color eyeColor;

    public Color getEyeColor() {
        return eyeColor;
    }

    private String education;
    private String hometown;

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getHometown() {
        return hometown;
    }

    public String getEducation() {
        return education;
    }

    public Human(String name, int age, String sex, boolean presenceOfHair, Color eyeColor, String education, String experience, String hometown) {
        super(name, age, sex, presenceOfHair);
        this.eyeColor = eyeColor;
        this.education = education;
        this.hometown = hometown;
    }
    @Override
    public void doShomthing() {
        System.out.println("im doin something");
    }

    @Override
    public void speak() {
        System.out.println("I can speak!1");
    }
}