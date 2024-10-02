package Patterns.AbstractFabric;

public class OldFurnitureFabric implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new OldChair();
    }

    @Override
    public Sofa createSofa() {
        return new OldSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new OldCoffeeTable();
    }
}
