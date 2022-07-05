package metadevs.oop;

import java.awt.*;

public class Employee extends Human {
    private String placeOfWork;
    private String experience;

    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Employee(String name, int age, String sex, boolean presenceOfHair, String experience, Color eyeColor, String hometown, String education) {
        super(name, age, sex, presenceOfHair);
        this.experience = experience;
        this.eyeColor = eyeColor;
        setHometown(hometown);
        setEducation(education);
    }


    public void about() {
        System.out.println();
    }

    public void information() {
        System.out.println(placeOfWork + experience + eyeColor + getHometown() + getEducation());
    }

    @Override
    public String toString() {
        return placeOfWork + " " + " " + experience + " " + eyeColor+ " " + getEducation() + " " + getHometown();
    }
}
