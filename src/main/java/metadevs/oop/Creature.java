package metadevs.oop;

public abstract class Creature {

    private String name;
    private int age;
    private String sex;
    private boolean presenceOfHair;

    public Creature(String name, int age, String sex, boolean presenceOfHair) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.presenceOfHair = presenceOfHair;
    }
    public abstract void doShomthing();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isPresenceOfHair() {
        return presenceOfHair;
    }

    public void setPresenceOfHair(boolean presenceOfHair) {
        this.presenceOfHair = presenceOfHair;
    }
}