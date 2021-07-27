package entity;

public enum MuscleQualityEnum {
    WEAK(10),
    NORMAL(20),
    BIG(30),
    VERY_BIG(40);

    private final Integer value;

    MuscleQualityEnum(Integer value) {
        this.value = value;
    }


    public Integer getValue() {
        return value;
    }
}
