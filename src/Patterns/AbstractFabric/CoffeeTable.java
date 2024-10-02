package Patterns.AbstractFabric;

public interface CoffeeTable {
    default void putOn() {
        System.out.println("You can put on a table");
    }
}
