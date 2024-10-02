package Patterns.AbstractFabric;

public class ModernCoffeeTable implements CoffeeTable{
    @Override
    public void putOn() {
        System.out.println("You can put on a modern table");
    }
}
