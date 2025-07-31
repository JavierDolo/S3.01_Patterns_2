package level_1_Builder.model;

import java.util.List;

public class Pizza {
    private String size;
    private String dough;
    private List<String> topping;

    public Pizza() {}

    public Pizza(String size, String dough, List<String> topping) {
        this.size = size;
        this.dough = dough;
        this.topping = topping;
    }

    public String getSize() {
        return size;
    }

    public String getDough() {
        return dough;
    }

    public List<String> getTopping() {
        return topping;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setTopping(List<String> topping) {
        this.topping = topping;
    }

    public void displayInfo() {
        System.out.println("\n--- Order Pizza ---");
        System.out.println("Size     : " + getSize());
        System.out.println("Dough    : " + getDough());
        System.out.println("Toppings : " + String.join(", ", getTopping()));
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", dough='" + dough + '\'' +
                ", topping=" + topping +
                '}';
    }
}
