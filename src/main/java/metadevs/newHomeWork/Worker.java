package metadevs.newHomeWork;

public interface Worker {
    public void setAge(int age);
    public void setName(String name);
    public void setSalary(int salary);
    public void setNameOfPlaceOfWork(String nameOfPlaceOfWork);
    public String getName();
    public int getAge();
    public int getSalary();
    public void aboutPerson();
    public boolean checkDifference();
    public void setCompanyName(String name);
}