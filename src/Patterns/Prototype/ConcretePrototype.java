package Patterns.Prototype;

public class ConcretePrototype extends Prototype {

    public ConcretePrototype(String name) {
        super(name);
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.getName());
    }
}