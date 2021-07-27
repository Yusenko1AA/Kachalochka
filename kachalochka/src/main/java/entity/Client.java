package entity;

import java.util.List;

public class Client extends Person {

    private Long money;
    private List<Muscle> muscles;
    private List<Graphic> graphic;

    public Client(String name, String company) {
        super(name);
        this.gym = company;
    }
}
