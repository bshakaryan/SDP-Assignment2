package Patterns.Prototype;

public abstract class Prototype implements Cloneable {
    private String name;

    public Prototype(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract Prototype clone();
}