package com.metadevs.newHomeWork;

public class PersonsList {
    public static void main(String[] args) {
        Company fiveBottelOfVodka = new Company("5 Бутылок Водки");
        System.out.println("В нашу стабильно развивающуюся компанию " + fiveBottelOfVodka.getName() +
             " решили устроиться два человека, если согласен их взять на рабоу, нажми цифру 1, если нет - то нажми 2");
        Person Bodya = new Person("Бодя", 27, 12345,"любое");
        Person Sanya = new Person("Саня", 30, 54321, " ");

        fiveBottelOfVodka.rectuitPerson(Bodya);
        fiveBottelOfVodka.rectuitPerson(Sanya);

        Bodya.information();
        Sanya.information();

        fiveBottelOfVodka.about();

        System.out.println("Упс! Кажется кто-то из новичков доставил комании " + fiveBottelOfVodka.getName() +
                " много хлопот, придётся кого-нибудь из них уволить. 1 - Бодя, 2 - Саня.. Решать тебе");
        fiveBottelOfVodka.firePerson(Bodya);
        fiveBottelOfVodka.firePerson(Sanya);

        Bodya.information();
        Sanya.information();

        fiveBottelOfVodka.about();
    }
}