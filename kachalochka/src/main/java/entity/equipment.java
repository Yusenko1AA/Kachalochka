package entity;

public class equipment {
    String name;
    Type equipmentType;


    equipment(String name, Type type){

        equipmentType = type;
        this.name = name;

    }
}

enum Type
{
    Weights,
    Elliptical_machine,
    Dumbell,
    Barbell,
    Cable_machine,
    Smith_machine
}

