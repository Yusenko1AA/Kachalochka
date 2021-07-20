package entity;

public class muscle {
    String name2;
    Type muscl;

    void Type(String name2, Type type){

        muscl = type;
        this.name2 = name2;

    }
}
enum muscl{
    chest,
    triceps,
    back,
    biceps,
    legs,
    deltoids
}

