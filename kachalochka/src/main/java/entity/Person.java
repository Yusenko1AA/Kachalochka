package entity;

public abstract class Person {

    protected Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private final String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
