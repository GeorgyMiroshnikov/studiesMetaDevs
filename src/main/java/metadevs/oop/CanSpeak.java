package metadevs.oop;

public interface CanSpeak {
    void speak();

    default void Moo() {
        System.out.println("Mooo");
    }
}