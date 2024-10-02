package Patterns.AbstractFabric;

public interface Chair {
    default void sitOn() {
        System.out.println("Sit on a chair");
    }
}
