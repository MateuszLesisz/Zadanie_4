package pl.infoshare;

public class Main {

    public static void main(String[] args) {
        Client client1 = new Client();
        Pizza meal1 = new Pizza("Pepperoni", 1);
        Drink drink1 = new Drink();
        client1.clientName = "Zenek";
        client1.clientAddress = "ul.Łąkowa 11E";
        client1.setTelephone(546785457);
        meal1.typeOfMeal = "Pizza";
        PizzaSize size = PizzaSize.DUŻA;
        drink1.typeOfDrink = "Sok";
        drink1.setNumberOfDrink(2);

        System.out.println("Zamówienie nr 1");
        System.out.println("Imię: " + client1.clientName);
        System.out.println("Adres: " + client1.clientAddress);
        System.out.println("Telefon: " + client1.getTelephone());
        System.out.println("Danie: " + meal1.typeOfMeal);
        System.out.println("Rodzaj pizzy: " + meal1.getTypeOfPizza());
        System.out.println("Rozmiar pizzy: " + size);
        System.out.println("Ilość: " + meal1.getValuesOfPizza());
        System.out.println("Picie: " + drink1.typeOfDrink);
        System.out.println("Ilość: " + drink1.getNumberOfDrink());
        System.out.println();

        Client client2 = new Client();
        Pizza meal2 = new Pizza("Diavola + Pepperoni", 2);
        Drink drink2 = new Drink();
        client2.clientName = "Krysia";
        client2.clientAddress = "ul.Nadrzeczna 6/3";
        client2.setTelephone(546785457);
        meal2.typeOfMeal = "Pizza";
        PizzaSize size2 = PizzaSize.MAŁA;
        PizzaSize size3 = PizzaSize.ŚREDNIA;
        drink2.typeOfDrink = "Cola";
        drink2.setNumberOfDrink(1);

        System.out.println("Zamówienie nr 2");
        System.out.println("Imię: " + client2.clientName);
        System.out.println("Adres: " + client2.clientAddress);
        System.out.println("Telefon: " + client2.getTelephone());
        System.out.println("Danie: " + meal2.typeOfMeal);
        System.out.println("Rodzaj pizzy: " + meal2.getTypeOfPizza());
        System.out.println("Rozmiar pizzy: " + size2 + " + " + size3);
        ;
        System.out.println("Ilość: " + meal2.getValuesOfPizza());
        System.out.println("Picie: " + drink2.typeOfDrink);
        System.out.println("Ilość: " + drink2.getNumberOfDrink());
        System.out.println();

        Client client3 = new Client();
        Drink drink3 = new Drink();
        Order meal3 = new Order();
        client3.clientName = "Antoni";
        client3.clientAddress = "ul.Polna 13";
        client3.setTelephone(546785457);
        meal3.typeOfMeal = "Hamburger";
        meal3.numberOfMeal = 1;
        drink2.typeOfDrink = "Piwo";
        drink2.setNumberOfDrink(1);

        System.out.println("Zamówienie nr 2");
        System.out.println("Imię: " + client3.clientName);
        System.out.println("Adres: " + client3.clientAddress);
        System.out.println("Telefon: " + client3.getTelephone());
        System.out.println("Danie: " + meal3.typeOfMeal);
        System.out.println("Ilość: " + meal3.numberOfMeal);
        System.out.println("Picie: " + drink2.typeOfDrink);
        System.out.println("Ilość: " + drink2.getNumberOfDrink());
    }
}