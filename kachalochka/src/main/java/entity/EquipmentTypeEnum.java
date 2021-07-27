package entity;

public enum EquipmentTypeEnum {

    ELLIPTICAL_MACHINE(MuscleTypeEnum.LEGS, 0.5),
    DUMBELL(MuscleTypeEnum.BICEPS, 1.2),
    BARBELL_CHEST(MuscleTypeEnum.CHEST, 1.0),
    CABLE_MACHINE(MuscleTypeEnum.TRICEPS, 0.7),
    SMITH_MACHINE(MuscleTypeEnum.DELTOIDS,0.4),
    BARBELL_BACK(MuscleTypeEnum.BACK,1.1);

    EquipmentTypeEnum(MuscleTypeEnum muscle, Double increaseValue) {
        this.muscle = muscle;
        this.increaseValue = increaseValue;
    }

    public MuscleTypeEnum getMuscle() {
        return muscle;
    }

    public Double getIncreaseValue() {
        return increaseValue;
    }

    private final MuscleTypeEnum muscle;
    private final Double increaseValue;
}

