package level_1_Builder.creator;

import level_1_Builder.builder.BuilderPizza;
import level_1_Builder.model.Pizza;

public class CreatorPizzaBuilder {

    public Pizza create(BuilderPizza builder) {

        builder.reset();
        builder.buildSize();
        builder.buildDough();
        builder.buildTopping();
        return builder.build();
    }
}
