package com.metadevs.oop;

import java.awt.*;

public class Animal extends Creature {
    public Animal(String name, int age, String sex, boolean presenceOfHair) {
        super(name, age, sex, presenceOfHair);
    }

    @Override
    public void doShomthing() {

    }

    private int price;
    private String breed;
    private Color color;
    private AnimalType animalClass;

    public void saySomething(){
        System.out.println("q-q");
    }



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public AnimalType getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(AnimalType animalClass) {
        this.animalClass = animalClass;
    }
}