package entity;

public abstract class Person {

    public String getName() {
        return name;
    }

    private final String name;

    public abstract void display();
}
