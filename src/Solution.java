import Patterns.*;
import Patterns.Fabric.*;
import Patterns.AbstractFabric.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println("<------ Singleton ------>");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        if (singleton1 == singleton2) {
            System.out.println("Singleton exist");
        }

        System.out.println("<------ Factory ------>");
        Creator creatorA = new ConcreteCreatorA();
        creatorA.someOperation();
        Creator creatorB = new ConcreteCreatorB();
        creatorB.someOperation();

        System.out.println("<------ Abstract Factory ------>");
        FurnitureFactory furnitureFactory = new OldFurnitureFabric();
        AbstractFactory abstractFactory = new AbstractFactory(furnitureFactory);
        abstractFactory.describeFurniture();
        furnitureFactory = new ModernFurnitureFabric();
        abstractFactory = new AbstractFactory(furnitureFactory);
        abstractFactory.describeFurniture();
    }
}
