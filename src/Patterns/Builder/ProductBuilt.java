package Patterns.Builder;

import java.util.ArrayList;
import java.util.List;

public class ProductBuilt {
    private List<String> parts = new ArrayList<>();

    public void add(String part) {
        parts.add(part);
    }

    public String show() {
        return String.join(", ", parts);
    }
}