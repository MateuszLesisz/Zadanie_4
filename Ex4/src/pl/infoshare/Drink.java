package pl.infoshare;

public class Drink extends Order{
    private static int numberOfDrink;

    public int getNumberOfDrink() {
        return numberOfDrink;
    }

    public static void setNumberOfDrink(int numberOfDrink) {
        Drink.numberOfDrink = numberOfDrink;
    }
}

