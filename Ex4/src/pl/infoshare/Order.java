package pl.infoshare;

import java.util.Objects;

public class Order{
    protected String clientName;
    protected String clientAddress;
    protected String typeOfMeal;
    protected String typeOfDrink;
    protected int numberOfMeal;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return numberOfMeal == order.numberOfMeal && Objects.equals(clientName, order.clientName) && Objects.equals(clientAddress, order.clientAddress) && Objects.equals(typeOfMeal, order.typeOfMeal) && Objects.equals(typeOfDrink, order.typeOfDrink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientName, clientAddress, typeOfMeal, typeOfDrink, numberOfMeal);
    }
}
