package entity;

public class Client extends Person {

    String gym;

    public Client(String name, String company) {
        super(name);
        this.gym = company;
    }
}
