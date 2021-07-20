package entity;

public class grafic {
    String name1;
    Type Day;


    void Type(String name1, Type type){

        Day = type;
        this.name1 = name1;

    }
}
enum Day{

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

