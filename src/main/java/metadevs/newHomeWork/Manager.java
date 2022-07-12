package metadevs.newHomeWork;

public class Manager implements Worker {
    private String name;
    private int age;
    private int salary;
    private String nameOfPlaceOfWork;

    public String getNameOfPlaceOfWork() {
        return nameOfPlaceOfWork;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void setNameOfPlaceOfWork(String nameOfPlaceOfWork) {
        this.nameOfPlaceOfWork = nameOfPlaceOfWork;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void aboutPerson() {
        System.out.println("Меня зовут " + getName() +
                ", " + "Мне " + getAge() + " лет" +
                ", в фирме " +  " " +
                "я получаю " + getSalary() + " рублей ");
    }

    @Override
    public boolean checkDifference() {
        boolean statement = salary >= age;
        System.out.println(statement);
        return statement;
    }

    @Override
    public void setCompanyName(String name) {

    }
}
