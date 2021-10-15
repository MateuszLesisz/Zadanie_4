package pl.infoshare;

import java.util.Objects;

public class Pizza extends Order{
    private String typeOfPizza;
    private int valuesOfPizza;

    public Pizza(String typeOfPizza, int valuesOfPizza) {
        this.typeOfPizza = typeOfPizza;
        this.valuesOfPizza = valuesOfPizza;
    }

    public String getTypeOfPizza() {
        return typeOfPizza;
    }

    public int getValuesOfPizza() {
        return valuesOfPizza;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pizza pizza = (Pizza) o;
        return valuesOfPizza == pizza.valuesOfPizza && Objects.equals(typeOfPizza, pizza.typeOfPizza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfPizza, valuesOfPizza);
    }
}
