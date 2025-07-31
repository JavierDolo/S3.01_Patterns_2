package level_1_Builder.controller;

import level_1_Builder.builder.TypePizzaBarbacue;
import level_1_Builder.builder.TypePizzaHawaiian;
import level_1_Builder.builder.TypePizzaVegetarian;
import level_1_Builder.creator.CreatorPizzaBuilder;
import level_1_Builder.model.Pizza;

public class OrderController {

    public static void menu() {
        CreatorPizzaBuilder builder = new CreatorPizzaBuilder();

        Pizza pizzaHawaiian = builder.create(new TypePizzaHawaiian());
        pizzaHawaiian.displayInfo();

        Pizza pizzaVegetarian = builder.create(new TypePizzaVegetarian());
        pizzaVegetarian.displayInfo();

        Pizza pizzaBarbacue = builder.create(new TypePizzaBarbacue());
        pizzaBarbacue.displayInfo();
    }
}
