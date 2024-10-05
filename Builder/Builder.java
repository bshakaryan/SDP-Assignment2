package Patterns.Builder;

public interface Builder {
    void buildPartA();
    void buildPartB();
    ProductBuilt getResult();
}