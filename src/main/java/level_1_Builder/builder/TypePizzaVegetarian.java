package level_1_Builder.builder;

import level_1_Builder.model.Pizza;

import java.util.List;

public class TypePizzaVegetarian implements BuilderPizza {
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
        pizza.setDough("Integral");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping(List.of("Pimientos", "Champiñones", "Cebolla", "Aceitunas"));
    }

    @Override
    public Pizza build() {
        return pizza;
    }
}

