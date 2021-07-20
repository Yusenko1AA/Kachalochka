package entity;

public class Employee extends Person {

    String gym;

    public Employee(String name, String company) {
        super(name);
        this.gym = company;
    }

    public void display() {

        System.out.printf("Employee Name: %s \t Gym: %s \n", super.getName(), gym);
    }
}