package entity;

import java.util.List;

public class Trainer extends Person {

    private List<EquipmentTypeEnum> equipments;
    private double coefficient;
    private List<Graphic> graphic;
    private String gym;
    public Trainer(String name, String company) {
        super(name);
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "gym='" + gym + '\'' +
                '}';
    }
}