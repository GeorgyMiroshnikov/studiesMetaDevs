package metadevs.oop;

import java.util.ArrayList;
import java.util.List;

public class ZooShop {
    private String name;
    private Address address;
    private List<Animal> animals;
    private List<Employee> employees;

    public ZooShop(String name, String city, String street) {
        this.name = name;
        this.address = new Address(city, street);
        animals = new ArrayList<Animal>();
        employees = new ArrayList<Employee>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void about() {
        System.out.println(name + " " + address);
        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).saySomething();
        }
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
            employees.get(i).speak();
        }

    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}