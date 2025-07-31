package level_1_Builder.builder;

import level_1_Builder.model.Pizza;

public interface BuilderPizza {

    void reset();
    void buildSize();
    void buildDough();
    void buildTopping();
    Pizza build();
}
