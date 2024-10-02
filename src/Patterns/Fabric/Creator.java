package Patterns.Fabric;

public abstract class Creator {
    public abstract Product factoryMethod();

    public void someOperation() {
        Product product = factoryMethod();
        product.doSomething();
    }
}
