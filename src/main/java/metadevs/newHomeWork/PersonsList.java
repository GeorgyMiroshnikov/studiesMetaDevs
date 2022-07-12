package metadevs.newHomeWork;

public class PersonsList {
    public static void main(String[] args) {
        Company fiveBottelOfVodka = new Company("5 Бутылок Водки");
        Person bodya = new Person("Бодя", 27, 12345,"любое");
        Person sanya = new Person("Саня", 30, 54321, " ");

        fiveBottelOfVodka.rectuitPerson(bodya,200);
        fiveBottelOfVodka.rectuitPerson(sanya,200);
        bodya.aboutPerson();
        sanya.aboutPerson();

        fiveBottelOfVodka.aboutCompany();
    }
}