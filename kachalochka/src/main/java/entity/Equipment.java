package entity;

public class Equipment {
    String name;
    EquipmentTypeEnum equipmentType;


    Equipment(String name, EquipmentTypeEnum type){

        equipmentType = type;
        this.name = name;

    }
}

