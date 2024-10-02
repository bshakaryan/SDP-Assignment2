package Patterns.AbstractFabric;

public class AbstractFactory {
    private Chair chair;
    private Sofa sofa;
    private CoffeeTable coffeeTable;

    public AbstractFactory(FurnitureFactory factory) {
        chair = factory.createChair();
        sofa = factory.createSofa();
        coffeeTable = factory.createCoffeeTable();
    }

    public void describeFurniture() {
        chair.sitOn();
        sofa.lieOn();
        coffeeTable.putOn();
    }
}
