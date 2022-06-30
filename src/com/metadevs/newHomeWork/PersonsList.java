package com.metadevs.newHomeWork;

public class PersonsList {
    public static void main(String[] args) {
        Company fiveBottelOfVodka = new Company("5 Бутылок Водки");
        Person Bodya = new Person("Бодя", 27, 12345,"любое");
        Person Sanya = new Person("Саня", 30, 54321, " ");

        fiveBottelOfVodka.rectuitPerson(Bodya,200);
        fiveBottelOfVodka.rectuitPerson(Sanya,200);
        Bodya.aboutPerson();
        Sanya.aboutPerson();

        fiveBottelOfVodka.aboutCompany();
    }
}