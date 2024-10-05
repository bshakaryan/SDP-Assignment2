package Patterns.Builder;

public class ConcreteBuilder implements Builder {
    private ProductBuilt product = new ProductBuilt();

    @Override
    public void buildPartA() {
        product.add("Part A");
    }

    @Override
    public void buildPartB() {
        product.add("Part B");
    }

    @Override
    public ProductBuilt getResult() {
        return product;
    }
}