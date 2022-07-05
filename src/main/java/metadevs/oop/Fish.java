package metadevs.oop;

public class Fish extends Animal {
    public Fish(String name, int age, String sex, boolean presenceOfHair) {
        super(name, age, sex, presenceOfHair);
    }

    @Override
    public void saySomething() {
        System.out.println("oOooOo");
    }
}
