package metadevs.oop;

public class Turtle extends Animal {
    public Turtle(String name, int age, String sex, boolean presenceOfHair) {
        super(name, age, sex, presenceOfHair);
    }

    @Override
    public void saySomething() {
        System.out.println("Kavabanga");
    }
}
