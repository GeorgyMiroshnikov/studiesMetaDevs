package com.metadevs.newHomeWork;

import java.util.ArrayList;
import java.util.List;


public class Company {
    private String name;
    private List<Person> persons;

    public String getName() {
        return name;
    }

    public Company(String name) {
        this.name = name;
        persons = new ArrayList<Person>();
    }

    public void rectuitPerson(Person person) {
    }

    public void firePerson(Person person) {
        int x =4;
        switch (x) {
            case 1:
                persons.remove(1);
                break;
            case 2:
                persons.remove(2);
                break;
            default:
                break;
        }
    }

    public void about() {
        System.out.println(name);
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
            persons.get(i).information();
        }
    }
}