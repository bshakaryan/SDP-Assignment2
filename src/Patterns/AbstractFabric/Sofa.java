package Patterns.AbstractFabric;

public interface Sofa {
    default void lieOn() {
        System.out.println("Lie on a sofa");
    }
}
