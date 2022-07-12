package metadevs.oop;

public class Snake extends Animal {
    public Snake(String name, int age, String sex, boolean presenceOfHair) {
        super(name, age, sex, presenceOfHair);
    }

    @Override
    public void saySomething() {
        System.out.println("Shh!");
    }
}
