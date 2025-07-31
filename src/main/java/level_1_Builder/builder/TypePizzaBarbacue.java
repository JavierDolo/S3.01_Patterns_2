package level_1_Builder.builder;

import level_1_Builder.model.Pizza;

import java.util.List;

public class TypePizzaBarbacue implements BuilderPizza {

    private Pizza pizza;

    @Override
    public void reset() {
        pizza = new Pizza();
    }

    @Override
    public void buildSize() {
        pizza.setSize("Medium");
    }

    @Override
    public void buildDough() {
        pizza.setDough("Roman");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping(List.of("caramelized onion", "minced meat", "barbecue sauce", "mozzarella", "tomato sauce"));
    }

    @Override
    public Pizza build() {
        return pizza;
    }
}