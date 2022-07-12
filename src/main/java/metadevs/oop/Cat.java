package metadevs.oop;

public class Cat extends Animal {
    public Cat(String name, int age, String sex, boolean presenceOfHair) {
        super(name, age, sex, presenceOfHair);
    }

    @Override
    public void saySomething() {
        System.out.println("Meow");
    }
}