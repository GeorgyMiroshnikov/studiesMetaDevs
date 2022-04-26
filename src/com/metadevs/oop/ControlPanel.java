package com.metadevs.oop;

import java.awt.*;

public class ControlPanel {
    public static void main(String[] args) {
        ZooShop ZooMagazin = new ZooShop("ZooMagaizne", "Tashkent", "Ptrovskaya-Razumovskaya");
        Fish Java = new Fish("Java", 13, "f", false);
        Hamster Poop = new Hamster("Poop", 7, "M", true);
        Snake Solid = new Snake("Solid", 55, "F", false);
        Bird Bodya = new Bird("Bodya", 2, "M", true);
        Cat Lapsha = new Cat("Lapsha", 228, "M", true);
        Turtle Vasya = new Turtle("Vasya", 19, "F", false);
        Employee Petr = new Employee("Petr",27,"M",true, "three years", Color.GREEN,"Kazan","Incomplete higher");
        Petr.setPlaceOfWork(ZooMagazin.getName());

        ZooMagazin.addAnimal(Java);
        ZooMagazin.addAnimal(Poop);
        ZooMagazin.addAnimal(Solid);
        ZooMagazin.addAnimal(Bodya);
        ZooMagazin.addAnimal(Lapsha);
        ZooMagazin.addAnimal(Vasya);
        ZooMagazin.addEmployee(Petr);
        ZooMagazin.about();
        CanSpeak speakr = new Human("Petr",27,"M",true);
        speakr.Moo();
    }
}